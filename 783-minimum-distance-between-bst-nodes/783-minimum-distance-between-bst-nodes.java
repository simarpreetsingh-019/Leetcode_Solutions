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
    int min = Integer.MAX_VALUE;
    Integer pre = null;
    public int minDiffInBST(TreeNode root) {
        check(root);
        return min;
    }

    private void check(TreeNode node) {
        if (node == null) return;
        check(node.left);
        if (pre != null)
            min = Math.min(min, node.val - pre);
        pre = node.val;
        check(node.right);
    }
}