// Last updated: 02/04/2025, 19:21:53
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
    TreeNode root;
    public TreeNode sortedArrayToBST(int[] nums) {
        return balanceTree(nums, 0, nums.length - 1);
    }
    public TreeNode balanceTree(int[] nums, int start, int end){
        if(start > end) return null;

        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = balanceTree(nums, start, mid - 1);
        node.right = balanceTree(nums, mid + 1, end);
        return node;
    }
}