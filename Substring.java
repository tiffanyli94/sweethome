public class Substring {
    public static int substring(String original, String substring) {
        char[] s1 = original.toCharArray();
        char[] s2 = substring.toCharArray();

        for (int i = 0; i < s1.length; i++) {
            int j = 0;
            while (j < s2.length && s1[i + j] == s2[j]) {
                j++;
            }
            if (j == s2.length) {
                return i;
            }
        }

        return -1;
    }
}
