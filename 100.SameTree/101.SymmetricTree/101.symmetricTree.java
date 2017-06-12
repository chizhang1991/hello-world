/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return sameTree(root.left, swap(root.right));
    }
    private TreeNode swap(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode temp = swap(root.left);
        root.left = swap(root.right);
        root.right = temp;
        return root;
    }
    private boolean sameTree(TreeNode m, TreeNode n) {
        if(m == null && n == null) {
            return true;
        }
        if(m == null || n == null) {
            return false;
        }
        return m.val == n.val && sameTree(m.left, n.left) && sameTree(m.right, n.right);
    }
}