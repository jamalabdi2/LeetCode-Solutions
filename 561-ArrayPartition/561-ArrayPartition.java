// Last updated: 12/04/2025, 22:51:31
class Solution {
    public int arrayPairSum(int[] nums) {
        //sort the array
        //take the numeber at index of even and add them together
        //since the smallest number together gives us the max sum so we take the smallest

        Arrays.sort(nums); //nlogn n
        int ans = 0;
        for(int i = 0; i < nums.length; i += 2){ // 0(n)
            ans += nums[i]; //o(1)
        }
        return ans;
    }
}