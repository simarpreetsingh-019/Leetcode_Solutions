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
// class Solution {
//     public int rangeSumBST(TreeNode root, int low, int high) {
//         if(root == null)
//             return 0;
//         int n = 0;
//         if(root.val >= low && root.val <= high)
//             n = root.val;
//         n += rangeSumBST(root.left, low, high);
//         n += rangeSumBST(root.right, low, high);
        
//         return n;
        
//     }
// }

class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) return 0; // base case.
        return (L <= root.val && root.val <= R ? root.val : 0) + rangeSumBST(root.right, L, R) + rangeSumBST(root.left, L, R);
    }
}