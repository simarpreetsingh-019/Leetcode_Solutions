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
// public class Solution {
//     public boolean isBalanced(TreeNode root) {
//         return height(root) != -1;

//     }

//     public int height(TreeNode node){
//         if(node == null) return 0;
        
//         int L = height(node.left);
//         if(L == -1) return -1;

//         int R = height(node.right);
//         if(R == -1) return -1;

//         if(Math.abs(L-R) > 1) return -1;        
//         return Math.max(L,R) + 1;
//     }
// }

public class Solution {
    private boolean result = true;

    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return result;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        if (Math.abs(l - r) > 1) result = false;
        return 1 + Math.max(l, r);
    }
}