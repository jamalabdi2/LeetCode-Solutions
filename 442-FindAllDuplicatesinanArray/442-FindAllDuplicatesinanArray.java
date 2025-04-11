// Last updated: 11/04/2025, 22:14:39
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(nums,i, correctIndex);

            }else{
                if(i != correctIndex && !seen.contains(nums[i])){
                    ans.add(nums[i]);
                    seen.add(nums[i]);
                }
                i++;
            }
        }
        return ans;
        
    }
    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}