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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        pathSum(root, sum, temp, res);
        return res;
    }
    
    private void pathSum(TreeNode root, int sum, List<Integer> temp, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        temp.add(root.val);
        if (root.left == null && root.right == null && root.val == sum) {
            res.add(new ArrayList(temp)); 
            temp.remove(temp.size() - 1);
            return;
        } else {
            pathSum(root.left, sum - root.val, temp, res);
            pathSum(root.right, sum - root.val, temp, res);
        }
        temp.remove(temp.size() - 1);
    }
}