// Last updated: 25/04/2025, 00:57:54
class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] count = new int[100001];
        for(int num: nums){
            if(num % 2 == 0){
                count[num]++;
            }
        }

        int maxf = Arrays.stream(count).max().getAsInt();
        for(int i = 0; i < count.length; i++){
            if(count[i] > 0 && count[i] == maxf){
                return i;
            }
        }
        if (maxf > 0){
            return count[maxf];
        }else{
            return -1;
        }
    }
}