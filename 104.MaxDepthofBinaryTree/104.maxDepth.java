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
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int l = 1 + maxDepth(root.left);
        int r = 1 + maxDepth(root.right);
        return Math.max(l, r);
    }
}