// Last updated: 11/04/2025, 22:35:11
class Solution {
    public int[] findErrorNums(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();

        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else{
               i++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                return new int[]{nums[j], j + 1};
            }
        }
        return new int[]{};
    }

    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}