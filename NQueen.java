import java.util.ArrayList;
import java.util.List;

public class NQueen {
    public static List<List<Integer>> NQueen(int n) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();
        helper(cur, n, result);
        return result;
    }

    private static void helper(List<Integer> cur, int n, List<List<Integer>> result) {
        if (cur.size() == n) {
            result.add(new ArrayList<>(cur));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isValid(i, cur)) {
                cur.add(i);
                helper(cur, n, result);
                cur.remove(cur.size() - 1);
            }
        }

    }

    private static boolean isValid (int i, List<Integer> cur) {
        for (int j = 0; j < cur.size(); j++) {
            //column of j = cur.get(j); row j = j
            //column of i = i; row i = cur.size
            if (i == cur.get(j) || Math.abs(i - cur.get(j)) == Math.abs(j - cur.size())) {
                return false;
            }
        }
        return true;
    }
}
