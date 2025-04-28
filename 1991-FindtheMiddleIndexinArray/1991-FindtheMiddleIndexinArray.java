// Last updated: 28/04/2025, 11:23:55
class Solution {
    public int findMiddleIndex(int[] nums) {
        //find the prefix sum
        //get the sum before i, prefix[i - 1]
        //get sum after i prefix[n] - prefix[i]
        //compare if the same
        //return the i
    
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for(int i = 0; i < prefix.length; i++){
            int beforeISum = (i == 0) ? 0 : prefix[i - 1];
            int afterISum = prefix[prefix.length - 1] - prefix[i];
            if(beforeISum == afterISum) return i;
        }
        return -1;
    }
}