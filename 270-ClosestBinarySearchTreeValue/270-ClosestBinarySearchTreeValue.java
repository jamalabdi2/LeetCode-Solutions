// Last updated: 03/04/2025, 00:39:28
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
      int closest = root.val;
      TreeNode current = root;
      while( current != null){
        //update the closest if we get the smaller value
        double curDiff = Math.abs(current.val - target);
        double closeDiff = Math.abs(closest - target);
        if(curDiff < closeDiff || (curDiff == closeDiff && current.val < closest)){
            closest = current.val;
        }
        if(current.val == target) return current.val;

        if(target < current.val){
            current = current.left;
        }else{
            current = current.right;
        }
      }
      return closest;
        
    }
    
}