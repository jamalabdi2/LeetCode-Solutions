// Last updated: 03/04/2025, 16:14:35
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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        inorder(root, nums);
        
        TreeNode newRoot = new TreeNode(nums.get(0));
        TreeNode currNode = newRoot;
        for(int i = 1; i < nums.size(); i++){
            currNode.right = new TreeNode(nums.get(i));
            currNode = currNode.right;
        }
        return newRoot;

    }
    public void inorder(TreeNode node, List<Integer> nums){
        if(node == null) return;
        inorder(node.left, nums);
        nums.add(node.val);
        inorder(node.right, nums);
    }
}