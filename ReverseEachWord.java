public class ReverseEachWord {
    public static void reverseEachWord(char[] input) {
        if (input == null) {
            return;
        }
        int start = 0;
        ReverseWords.reverseWord(input, start, input.length - 1);
        for (int i = 0; i < input.length; i++) {
            if (input[i] != ' ' && (i == 0 || input[i - 1] == ' ')) {
                start = i;
            }
            if (input[i] != ' ' && (i == input.length - 1 || input[i + 1] == ' ')) {
                ReverseWords.reverseWord(input, start, i );
            }
        }
    }

}
