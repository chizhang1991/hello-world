/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    private Stack<TreeNode> stack = new Stack<TreeNode>();
    
    public BSTIterator(TreeNode root) {
        // push the very left tree into the stack
        pushAll(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode temp = stack.pop();
        pushAll(temp.right);
        return temp.val;
    }
    
    private void pushAll(TreeNode root) {
        TreeNode cur = root;
        if(cur == null) {
            return;
        }
        // cur != null  -> the root can push into the stack
        while(cur != null) {
            stack.push(cur);
            cur = cur.left;
        }
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */



// /**
//  * Definition for binary tree
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode(int x) { val = x; }
//  * }
//  */

// public class BSTIterator {
//     private TreeNode root;
    
//     public BSTIterator(TreeNode root) {
//         root = root;
//     }

//     /** @return whether we have a next smallest number */
//     public boolean hasNext() {
//         TreeNode cur = root;
//         if(cur == null) {
//             return false;
//         } 
//         return true;
//     }

//     /** @return the next smallest number */
//     public int next() {
//         TreeNode cur = root;
//         TreeNode pre = null;
//         while(cur.left != null) {
//             pre = cur;
//             cur = cur.left;
//         } 
//         if(pre == null) {
//             root = root.right;
//         } else {
//             pre.left = cur.right;
//         }
//         return cur.val;
//     }
// }

// /**
//  * Your BSTIterator will be called like this:
//  * BSTIterator i = new BSTIterator(root);
//  * while (i.hasNext()) v[f()] = i.next();
//  */