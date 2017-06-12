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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        // StringBuilder onePath = new StringBuilder();
        // why use String not StringBuilder for onePath? 
        // because do not want to change the value of onePath
        findAll(root, "" + root.val, "->", res);
        return res;
    }
    
    private void findAll(TreeNode root, String onePath, String sep, List<String> res) {
        // find one whole path
        if (root.left == null && root.right == null) {
            res.add(onePath);
        }
        if (root.left != null) {
            // findAll(root.left, onePath.append(sep).append(String.valueOf(root.left.val)), sep, res);
            findAll(root.left, onePath + sep + root.left.val, sep, res);
        } 
        if (root.right != null) {
            // findAll(root.right, onePath.append(sep).append(String.valueOf(root.right.val)), sep, res);
            findAll(root.right, onePath + sep + root.right.val, sep, res);
        }
    }
}