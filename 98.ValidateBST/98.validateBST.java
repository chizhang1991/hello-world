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
    public boolean isValidBST(TreeNode root) {
        // inorder traversal
        // when root is null
        if (root == null) {
            return true;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode pre = null;
        while (cur != null || !stack.isEmpty()) {
            // put all left in
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            // no left left
            // deal with right
            if (!stack.isEmpty()) {
                // pop the most left leaf
                cur = stack.pop();
                // do whatever need to do
                if (pre != null && cur.val <= pre.val) {
                    return false;
                }
                pre = cur;
                // go right
                cur = cur.right;
            }
        }
        return true;
    }
}

// restricted by max and min
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
    public boolean isValidBST(TreeNode root) {
        // use (long)Integer.MAX_VALUE + 1, (long)Integer.MIN_VALUE - 1 to deal with the case when the node is 
        // Integer.MAX_VALUE or Integer.MIN_VALUE
        // cast to long first, then + / - 1
        return isValidBST(root, (long)Integer.MAX_VALUE + 1, (long)Integer.MIN_VALUE - 1);
    }
    private boolean isValidBST(TreeNode root, long max, long min) {
        if (root == null) {
            return true;
        }
        if (root.val >= max || root.val <= min) {
            return false;
        }
        // when the recursion deals with subtrees, a right subtree of the left subtree, the max and min is no longer restricted
        // by Integer.MAX_VALUE or Integer.MIN_VALUE
        return isValidBST(root.left, root.val, min)
                && isValidBST(root.right, max, root.val);
    }
}