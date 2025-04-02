// Last updated: 03/04/2025, 00:08:06
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
    public int closestValue(TreeNode root, double target) {
        //get inorder traversal array
        //calculate the remainder and get the smallest
        List<Integer> nums = new ArrayList();
        inorder(root,nums);

        int closest = nums.get(0);
        double minDiff = Math.abs(closest - target);
       
        for(int num: nums){
            double diff = Math.abs(num - target);
            if(diff < minDiff){
                minDiff = diff;
                closest = num;
            }
            
        }
        return closest;
        
    }
    public void inorder(TreeNode root, List<Integer> nums){
        if(root == null) return;
        inorder(root.left, nums);
        nums.add(root.val);
        inorder(root.right, nums);
    }
}