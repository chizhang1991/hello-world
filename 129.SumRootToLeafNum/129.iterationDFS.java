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
        int sum = 0;
        if (root == null) {
            return sum;
        }
        Stack<TreeNode> stack = new Stack<>();
        HashSet<TreeNode> hasVisited = new HashSet<>();
        TreeNode cur = root;
        stack.push(cur);
        int pathNum = root.val;
        while (!stack.isEmpty()) {
            // get the child of the stack top tree node
            TreeNode temp = stack.peek();
            if (temp.left != null && !hasVisited.contains(temp.left)) {
                // has left child and never been visited
                pathNum = pathNum * 10 + temp.left.val;
                hasVisited.add(temp.left);
                stack.push(temp.left);
            } else if (temp.right != null && !hasVisited.contains(temp.right)) {
                // has right child and never been visited
                pathNum = pathNum * 10 + temp.right.val;
                hasVisited.add(temp.right);
                stack.push(temp.right);
            } else {
                // both left and right has been visited
                // change another path to visit
                stack.pop();
                // this path has done, add the number into sum, 
                if (temp.left == null && temp.right == null) {
                    sum += pathNum;
                }
                // pathNum come back to when this node has not been visited
                pathNum = (pathNum - temp.val) / 10;
            }
        }
        return sum;
    }
}