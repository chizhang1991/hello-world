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
    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        int l = 1 + minDepth(root.left);
        int r = 1 + minDepth(root.right);
        if(root.left == null) {
            return r;
        }
        if(root.right == null) {
            return l;
        }
        return Math.min(l, r);
    }
}