// Last updated: 11/04/2025, 21:53:34
class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                //swap
                swap(nums,i,correctIndex);
            }else{
                //duplicate or it is in correct possition
                if(i != correctIndex) return nums[i];
                i++;
            }
        }
        return -1;
    }

    public void swap(int nums[], int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}