import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 94. Binary Tree Inorder Traversal
 * Diflty : Easy
 * URL    : https://leetcode.com/problems/binary-tree-inorder-traversal/
 * Date   : 17-03-2025
 * Author : Lutfi
 */
public class BinaryTreeInorderTraversal {
    
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {this.val = val;}
    }

    static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<Integer> output = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            output.add(root.val);
            root = root.right;
        }
        return output;
    }

    public static void main(String[] args) {
        /*
              1
             / \
            2   3
           / \   \
          4   5   6
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.println(inorderTraversal(root)); // [4, 2, 5, 1, 3, 6]
    }
}
