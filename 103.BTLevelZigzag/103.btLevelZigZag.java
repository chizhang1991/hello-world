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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int levelNum = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode father = queue.poll();
                if (levelNum % 2 == 0) {
                    level.add(father.val);
                } else {
                    level.add(0, father.val);
                }
                if (father.left != null) {
                    queue.offer(father.left);
                } 
                if (father.right != null) {
                    queue.offer(father.right);
                }
            }
            levelNum++;
            res.add(new ArrayList<>(level));
        }
        return res;
    }
}