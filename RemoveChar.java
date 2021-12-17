//string "student" - "u" "e" - "stdnt"
public class RemoveChar {
    public static String removeChar(String input, char[] targets) {
        char[] inputArray = input.toCharArray();
        int i = 0;
        for (int j = 0; j < inputArray.length; j++) {
            if (withinTarget(inputArray[j], targets)) {
                continue;
            } else {
                inputArray[i] = inputArray[j];
                i++;
            }
        }
        return cutString(inputArray, i);
    }

    private static boolean withinTarget(char cur, char[] targets) {
        for (int i = 0; i < targets.length; i++) {
            if (targets[i] == cur) {
                return true;
            }
        }
        return false;
    }

    private void swap(int i, int j, char[] inputArray) {
        char temp = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = temp;
    }

    private static String cutString(char[] inputArray, int i) {
        StringBuilder result = new StringBuilder();
        for (int j = 0; j < i; j++) {
            result.append(inputArray[j]);
        }
        return result.toString();
    }
}
