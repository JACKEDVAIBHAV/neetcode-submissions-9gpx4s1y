/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;                          // Bug 1 fixed

        int leftHeight  = maxHeight(root.left);
        int rightHeight = maxHeight(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) return false; // Bug 3 fixed

        return isBalanced(root.left) && isBalanced(root.right);   // Bug 4 fixed
    }

    public int maxHeight(TreeNode root) {
        if (root == null) return 0;                            // Bug 2 fixed
        return Math.max(maxHeight(root.left), maxHeight(root.right)) + 1;
    }
}