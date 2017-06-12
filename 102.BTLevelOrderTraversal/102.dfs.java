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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        dfsLevel(res, root, 0);
        return res;
    }
    private void dfsLevel(List<List<Integer>> res, TreeNode root, int height) {
        if (root == null) {
            return;
        }
        if (height >= res.size()) {
            res.add(new ArrayList<Integer>());
        }
        // add root value into res
        res.get(height).add(root.val);
        // add all left tree
        dfsLevel(res, root.left, height + 1);
        // add all right tree
        dfsLevel(res, root.right, height + 1);
    }
}