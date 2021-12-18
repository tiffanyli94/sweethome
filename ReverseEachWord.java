public class ReverseEachWord {
    public static void reverseEachWord(char[] input) {
        if (input == null) {
            return;
        }
        int i = 0;
        for (int j = 0; j < input.length; j++) {
            if (input[j] != ' ') {
                continue;
            }
            if (input[j] == ' ') {
                ReverseWords.reverseWord(input, i, j - 1);
                i = j;
            }
        }
    }

}
