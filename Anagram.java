import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {
    public static List<Integer> findAnagrams(String sh, String lo) {
        List<Integer> result = new ArrayList<>();

        //construct the anagram Map
        Map<Character, Integer> anagramMap = new HashMap<>();
        char[] anagramChar = lo.toCharArray();
        for (Character c : anagramChar) {
            if (!anagramMap.containsKey(c)) {
                anagramMap.put(c, 1);
            } else {
                int cCredit = anagramMap.get(c);
                anagramMap.put(c, cCredit + 1);
            }
        }
        Map<Character, Integer> originalMap = new HashMap<>(anagramMap);

        int slow = 0;
        int fast = 0;
        int anaLength = 0;
        char[] shChar = sh.toCharArray();
        while (fast < sh.length()) {

            if (anagramMap.containsKey(shChar[fast]) && anagramMap.get(shChar[fast]) > 0) {
                int cCredit = anagramMap.get(shChar[fast]);
                anagramMap.put(shChar[fast], cCredit - 1);
                fast++;
                anaLength = fast - slow;
                if (anaLength == anagramChar.length) {
                    result.add(slow);
                }
                if (fast == sh.length()) {
                    return result;
                }
            }
            while (!anagramMap.containsKey(shChar[fast])) {
                fast++;
                if (fast == sh.length()) {
                    return result;
                }
                if (anagramMap.containsKey(shChar[fast])) {
                    slow = fast;
                    anaLength = fast - slow;;
                    anagramMap = new HashMap<>(originalMap);
                    break;
                }
            }
            if (anagramMap.get(shChar[fast]) <= 0) {
                int cCredit = anagramMap.get(shChar[slow]);
                anagramMap.put(shChar[slow], cCredit + 1);
                slow++;
            }
        }
    return result;
    }
}
