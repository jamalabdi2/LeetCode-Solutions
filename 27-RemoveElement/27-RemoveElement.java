class Solution {
    public int removeElement(int[] nums, int val) {
        int skip = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[i - skip] = nums[i];
            }else{
                skip++;
            }
        }

        for(int j = nums.length - 1; j >= nums.length - skip; j--){
            nums[j] = 0;
        }

        return nums.length - skip ;
      
    }
}