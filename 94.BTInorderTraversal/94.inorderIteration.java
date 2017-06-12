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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()) {
            // put all left subtree into stack
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            if(!stack.isEmpty()) {
                // traversal left tree
                cur = stack.pop();
                // get one element
                res.add(cur.val);
                // traversal right tree
                cur = cur.right;
            }
        }
        return res;
    }
}