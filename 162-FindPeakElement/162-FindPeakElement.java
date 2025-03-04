class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
       //check the case when we have one element
       if(n == 1) return 0; // first element is the greatest
       //check firt element and second elements
       if(nums[0] > nums[1]) return 0;

       //check for the rest
       for(int i = 1; i < n - 1; i++ ){
            if(nums[i] > nums[i - 1] && nums[i] > nums[i+1]) return i;
       }

       //check for the last element
       if(nums[n - 1] > nums[n - 2]) return n - 1;
       return -1;
    }
}