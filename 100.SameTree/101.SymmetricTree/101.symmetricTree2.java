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
        return twoSymmetric(root.left, root.right);
    }
    private boolean twoSymmetric(TreeNode m, TreeNode n) {
        if(m == null && n == null) {
            return true;
        }
        if(m == null || n == null) {
            return false;
        }
        return m.val == n.val && twoSymmetric(m.left, n.right) && twoSymmetric(m.right, n.left);
    }
}