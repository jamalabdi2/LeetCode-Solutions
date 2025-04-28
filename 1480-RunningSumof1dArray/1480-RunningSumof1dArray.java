// Last updated: 28/04/2025, 10:33:57
class Solution {
    public int[] runningSum(int[] nums) {
       for(int i = 1; i < nums.length; i++) nums[i] += nums[i - 1];
       return nums;
    }
}