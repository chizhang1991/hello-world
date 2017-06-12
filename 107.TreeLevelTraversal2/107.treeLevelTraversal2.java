/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
// public class ResultType {
//     private int levelNum;
//     private List<Integer> level;
    
//     public ResultType(int levelNum, List<Integer> level) {
//         this.levelNum = levelNum;
//         this.level = level;
//     }
// }

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        // a queue to store
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        // int levelNum = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            // levelNum++;
            for (int i = 0; i < size; i++) {
                TreeNode father = queue.poll();
                level.add(father.val);
                if (father.left != null) {
                    queue.add(father.left);
                }
                if (father.right != null) {
                    queue.add(father.right);
                }
            }
            // list.add(idx, item) -> add item on idx, shift original items to right
            res.add(0, new ArrayList<>(level));
        }
        return res;
    }
}