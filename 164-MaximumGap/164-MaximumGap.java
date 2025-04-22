// Last updated: 22/04/2025, 12:19:24
class Solution {
    public int maximumGap(int[] arr) {
        sortArr(arr);
        int max = 0;
        for(int i = 1; i < arr.length; i++){
            max = Math.max(max, arr[i] - arr[i - 1]);
        }
        return max;
    }
    public static void sortArr(int[] arr){
        int maxNum = Arrays.stream(arr).max().getAsInt();
        for(int exp = 1; maxNum / exp > 0; exp *= 10){
            countingSort(arr, exp);
        }
    }
    public static void countingSort(int[] arr, int exp){
        int n  = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for(int i = 0; i < n; i++){
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }
        
        for(int i = 1; i < count.length; i++){
            count[i] += count[i - 1];
        }
        
        for(int i = n - 1; i >= 0; i--){
            int digit = (arr[i] / exp) % 10;
            int index = count[digit] - 1;
            output[index] = arr[i];
            count[digit]--;
        }
        // output[i] = arr[i] System.arraycopy()
        System.arraycopy(output, 0, arr, 0, n);
 }

}