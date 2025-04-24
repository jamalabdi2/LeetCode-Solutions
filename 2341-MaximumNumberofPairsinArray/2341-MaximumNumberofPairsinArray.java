// Last updated: 25/04/2025, 00:13:58
class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] count = new int[101];
        for(int num: nums) count[num]++;

        int leftOvers = 0;
        int pairs = 0;
        for(int num: count){
            if(num > 0){
                leftOvers += num / 2;
                pairs += num % 2;
            }
        }
        return new int[]{leftOvers, pairs};
    }
}