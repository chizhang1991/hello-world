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
    public int sumNumbers(TreeNode root) {
        return getSum(root, 0);
    }
    
    private int getSum(TreeNode root, int pre) {
        if (root == null) {
            return 0;
        }
        // add the root into pre
        int res = pre * 10 + root.val;
        if (root.left == null && root.right == null) {
            return res;
        }
        // res will be the pre of its subtrees
        return getSum(root.left, res) + getSum(root.right, res);
    }
}