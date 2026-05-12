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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;  // Bug 1 fixed
        if (p == null || q == null) return false; // Bug 1 fixed

        if (p.val != q.val) return false;         // Bug 2 fixed

        return isSameTree(p.left, q.left)         // Bug 3 & 4 fixed
            && isSameTree(p.right, q.right);
    }
}