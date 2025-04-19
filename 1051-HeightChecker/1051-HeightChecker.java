// Last updated: 19/04/2025, 10:57:49
class Solution {
    public int heightChecker(int[] heights) {
        int[] sortedHeights = countingSort(heights);
        int output = 0;
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != sortedHeights[i]){
                output++;
            }
        }
        return output;
    }

    public static int[] countingSort(int[] arr){
        int max = getMax(arr);
        int[] count = new int[max + 1];
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }

        for(int i = 1; i < count.length; i++){
            count[i] += count[i - 1];
        }

        int[] output = new int[arr.length];

        for(int j = arr.length - 1; j >= 0; j--){
            int num = arr[j];
            int index = count[num] - 1;
            output[index] = num;
            count[num]--; 
        }
        return output;
    }

    static int getMax(int[] arr){
        int maxNum = arr[0];
        for(int num: arr){
            maxNum = Math.max(maxNum, num);
        }
        return maxNum;
    }
}