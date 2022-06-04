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
public class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;

    }

    public int height(TreeNode node){
        if(node == null) return 0;
        
        int L = height(node.left);
        if(L == -1) return -1;

        int R = height(node.right);
        if(R == -1) return -1;

        if(Math.abs(L-R) > 1) return -1;        
        return Math.max(L,R) + 1;
    }
}