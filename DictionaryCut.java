import java.util.Set;

public class DictionaryCut {
    public static boolean checkContains(String input, Set<String> dictionary) {
        boolean[] m = new boolean[input.length() + 1];
        m[0] = true;
        // i is the length of substring
        for (int i = 1; i <= input.length(); i++) {
            //j is the length of left side of the substring
            for (int j = 0; j < i; j++) {
                String rightSide = input.substring(j, i);
                boolean contains = (m[j] && dictionary.contains(rightSide));
                if (contains) {
                    m[i] = true;
                    break;
                }
            }
        }
        return m[input.length()];
    }
}
