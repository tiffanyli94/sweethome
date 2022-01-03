public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        int longest = Integer.MIN_VALUE;

        for (int i = 0; i < s.length(); i++) {
            int[] oddPalindromeStartAndEnd = expandFromCenter(s, i, i);
            int[] evenPalindromeStartAndEnd = expandFromCenter(s, i, i + 1);
            int len = Math.max(oddPalindromeStartAndEnd[1] - oddPalindromeStartAndEnd[0],evenPalindromeStartAndEnd[1] - evenPalindromeStartAndEnd[0]) + 1;

            if (len > longest) {
                longest = len;
                if (len % 2 == 0) {
                    // even length
                    start = evenPalindromeStartAndEnd[0];
                    end = evenPalindromeStartAndEnd[1];
                } else {
                    // odd length
                    start = oddPalindromeStartAndEnd[0];
                    end = oddPalindromeStartAndEnd[1];
                }
            }
        }
        return s.substring(start, end + 1);
    }

    // return an array of integer, index 0 = starting point, index 1 = ending point
    public static int[] expandFromCenter(String s, int left, int right) {
        int l = left;
        int r = right;
        while (l > 0 && r < s.length() - 1) {
            if (s.charAt(l - 1) != s.charAt(r + 1)) {
                break;
            } else {
                l--;
                r++;
            }
        }
        return new int[]{l, r};
    }
}
