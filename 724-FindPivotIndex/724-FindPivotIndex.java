// Last updated: 28/04/2025, 11:30:50
class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        int n = nums.length;
        
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for(int i = 0; i < n; i++){
            int beforeSum = (i == 0) ? 0 : prefix[i - 1];
            int afterSum = prefix[n - 1] - prefix[i];
            if(beforeSum == afterSum) return i;
        }
        return -1;
    }
}
