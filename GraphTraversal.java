import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphTraversal {
    public static List<Integer> getLevelSum (TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int length = q.size();
        int sum = 0;

        while (q.size() != 0) {

            TreeNode cur = q.poll();
            System.out.print(cur.value);
            sum = sum + cur.value;
            length--;
            if (cur.left != null) {
                q.offer(cur.left);
            }
            if (cur.right != null) {
                q.offer(cur.right);
            }
            if (length == 0) {
                System.out.println("");
                length = q.size();
                result.add(sum);
                sum = 0;
            }
        }
        return result;
    }
}
