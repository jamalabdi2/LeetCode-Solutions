// Last updated: 19/04/2025, 20:09:21
class Solution {
    public int[] sortArray(int[] nums) {
        int[] sortedArray = countingSort(nums);
        return sortedArray;
    }
    
    public static int[] countingSort(int[] arr) {
      
        int min = getMinNum(arr);
        int max = getMaxNum(arr);
        
       
        int range = max - min + 1;
        int[] count = new int[range];
        
       
        for(int num: arr) {
            count[num - min]++; 
        }
        
     
        for(int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        
        int[] output = new int[arr.length];
        
      
        for(int j = arr.length - 1; j >= 0; j--) {
            int num = arr[j];
            int index = count[num - min] - 1; 
            output[index] = num;
            count[num - min]--;
        }
        
        return output;
    }
    
    static int getMaxNum(int[] nums) {
        int max = nums[0];
        for(int num: nums) max = Math.max(max, num);
        return max;
    }
    
    static int getMinNum(int[] nums) {
        int min = nums[0];
        for(int num: nums) min = Math.min(min, num);
        return min;
    }
}