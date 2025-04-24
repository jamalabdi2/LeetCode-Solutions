// Last updated: 25/04/2025, 01:07:11
class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] count = new int[100001];
        
        for (int num : nums) {
            if (num % 2 == 0) {
                count[num]++;
            }
        }

        int maxFreq = 0;
        int result = -1;

    
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxFreq) {
                maxFreq = count[i];
                result = i;
            }
        }

        return result;
    }
}
