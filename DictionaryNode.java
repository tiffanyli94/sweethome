import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class DictionaryNode {
    char value;
    Map<Character, DictionaryNode> children;
    boolean isEndOfWord;

    //constructor
    public DictionaryNode(char curChar) {
        this.value = curChar;
        children = new HashMap<>();
    }

    public void print() {
        //this can not be null;
        Queue<DictionaryNode> q = new LinkedList<>();
        q.offer(this);
        int levelRemainingCount = 1;
        while (!q.isEmpty()) {
            DictionaryNode cur = q.poll();
            System.out.print(cur.value);
            if (cur.isEndOfWord) {
                System.out.print("*");
            }
            levelRemainingCount--;

            for (Map.Entry<Character, DictionaryNode> childEntry : cur.children.entrySet()) {
                q.offer(childEntry.getValue());
            }

            //check if need to restart a line after printing each node
            if (levelRemainingCount == 0) {
                System.out.println(" ");
                levelRemainingCount = q.size();
            }




        }
    }
}
