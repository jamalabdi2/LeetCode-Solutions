class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1) return 0;
      //binary search solution
      int left = 0 ; int right = nums.length - 1;
      while(left <= right){
        int mid = left + (right - left);
        if(mid < nums.length - 1 && nums[mid] < nums[mid + 1]){
            left = mid + 1;
        }else if (mid > 0 && nums[mid] < nums[mid - 1] ){
            right = mid - 1;
        }else{
            return mid;
        }
      }
      return -1;
    }
}