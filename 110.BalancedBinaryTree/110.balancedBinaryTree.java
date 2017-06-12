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
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return (Math.abs(l - r) <= 1) && isBalanced(root.left) && isBalanced(root.right); 
    }
    private int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int l = 1 + maxDepth(root.left);
        int r = 1 + maxDepth(root.right);
        return Math.max(l, r);
    }
}