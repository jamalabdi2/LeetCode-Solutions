// Last updated: 03/04/2025, 14:10:46
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
    public boolean findTarget(TreeNode root, int k) {

        List<Integer> nums = new ArrayList<>();
      
        inorder(root,nums);

        int left = 0;
        int right = nums.size() - 1;
        while(left < right){
            int sum = nums.get(left) + nums.get(right);
            if(sum == k){
                return true;
            }else if(sum > k){
                right--;
            }else{
                left++;
            }
        }
        return false;
    }

    public void inorder(TreeNode node,List<Integer> ans){
        if(node == null) return;
        inorder(node.left,ans);
        ans.add(node.val);
        inorder(node.right,ans);
    }
}