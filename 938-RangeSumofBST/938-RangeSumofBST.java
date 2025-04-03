// Last updated: 03/04/2025, 15:29:47
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
    private int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        inorder(root,low,high);
        return sum;
    }
    public void inorder(TreeNode node, int low, int high){
        if(node == null) return;
        inorder(node.left, low,high);
        if(node.val >= low && node.val <= high){
            sum += node.val;
        }
        inorder(node.right, low,high);
    }
}