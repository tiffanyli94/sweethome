public class ReverseWords {
    public static void reverseWord (char[] input, int left, int right) {
        if (input == null) {
            return;
        }
        if (left >= right) {
            return;
        }
        reverseWord(input, left + 1, right - 1);
        char temp = input[left];
        input[left] = input[right];
        input[right] = temp;

    }
}
