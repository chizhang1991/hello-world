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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return null;
        }
        int pd = root.val - p.val;
        int qd = root.val - q.val;
        if(pd * qd == 0) {
            if(pd == 0) {
                return p;
            }
            else {
                return q;
            }
        }
        if(pd * qd < 0) {
            return root;
        }
        if(pd > 0) {
            return lowestCommonAncestor(root.left, p, q);
        }
        else {
            return lowestCommonAncestor(root.right, p, q);
        }
    }
}