// Last updated: 03/04/2025, 15:37:41
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
    public int rangeSumBST(TreeNode root, int low, int high) {
        return calculateSum(root,low,high);
    }
    public int calculateSum(TreeNode node, int low, int high){
        int sum = 0;
       if(node == null) return 0;
       if(node.val >= low && node.val <= high)  sum += node.val;

       if(node.val >= low) sum += calculateSum(node.left,low,high);
       if(node.val <=  high) sum += calculateSum(node.right, low,high);
       return sum;
    }
}