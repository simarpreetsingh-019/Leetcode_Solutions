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
    public void recoverTree(TreeNode root) {
        //use inorder traversal to detect incorrect node

        inOrder(root);


        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    TreeNode prev = null;
    TreeNode first = null;
    TreeNode second = null;

    public void inOrder(TreeNode root){
        if(root == null) return;
        //search left tree
        inOrder(root.left);

        //in inorder traversal of BST, prev should always have smaller value than current value
        if(prev != null && prev.val >= root.val){
            //incorrect smaller node is always found as prev node
            if(first == null) first = prev;
          //incorrect larger node is always found as curr(root) node
            second = root;
        }


        //update prev node
        prev = root;

        //search right tree
        inOrder(root.right);
    }
}