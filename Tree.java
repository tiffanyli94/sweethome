public class Tree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        System.out.println(isBalanced(root));
    }
    private boolean isBalanced(TreeNode root) {
        //corner case
        if (root == null) {
            return true;
        }
        //recursion rule
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if ( Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);

    }

    private int getHeight(TreeNode root) {
        //corner case
        if (root == null) {
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;

    }



}
