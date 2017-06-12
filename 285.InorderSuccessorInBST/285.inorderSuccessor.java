class TreeNode {
	private int val;
	private TreeNode left;
	private TreeNode right;

	public TreeNode(int val) {
		this.val = val;
	}
}

class Solution {
	public TreeNode inorderSuccessor(TreeNode root, TreeNode cur) {
		TreeNode successor = null;
		while (root != null && root.val != cur) {
			if (root.val > cur.val) {
				successor = root;
				root = root.left;
			} else {
				root = root.right;
			}
		}
		// found the position of cur -> root
		if (root == null) {
			// no cur Node
			return null;
		}
		if (root.right == null) {
			// cur do not have right children, go to its parent
			return successor;
		}
		// find the smallest TreeNode larger than cur
		root = root.right;
		successor = root;
		while (root != null) {
			successor = root;
			root = root.left;
		}
		return successor;
	}
}