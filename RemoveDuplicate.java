import java.util.Deque;
import java.util.LinkedList;

public class RemoveDuplicate {
    public static String removeDuplicate (String input) {
        char[] toChar = input.toCharArray();
        for (char c : toChar) {
            System.out.print(c);
        }
        System.out.println();
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < toChar.length; i++) {
            if (stack.size() == 0 || stack.peekLast() != toChar[i]) {
                stack.offer(toChar[i]);
                System.out.println(toChar[i]);
            } else {
                continue;
            }
        }
        return stack2String(stack);
    }

    private static String stack2String(Deque<Character> stack) {
       for (Character c : stack) {
           System.out.print(c);
       }
       System.out.println();
       int size = stack.size();
        StringBuilder charResult = new StringBuilder();
        for (int i = 0; i < size; i++) {
            charResult.append(stack.pollFirst());
        }
        return charResult.toString();
    }
}
