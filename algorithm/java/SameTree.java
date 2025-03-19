import java.util.Stack;

public class SameTree {
    
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {this.val = val;}
    }

    static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) return false;

        Stack<TreeNode> stack = new Stack<>();

        while ((p != null || q != null) || !stack.isEmpty()) {
            while (p != null || q != null) {
                if (p != null && q != null) {
                    stack.push(p);
                    stack.push(q);
                    if (p.val != q.val) return false;
                    p = p.left;
                    q = q.left;
                }
            }

            p = stack.pop();
            q = stack.pop();

            if (p.val != q.val) return false;

            p = p.right;
            q = q.right;
        }

        return true;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);

        TreeNode t2 = new TreeNode();
        t2.left = new TreeNode(2);
        t2.right = new TreeNode(3);
        //t2.right = new TreeNode(4);

        System.out.println(isSameTree(t1, t2));
    }
}
