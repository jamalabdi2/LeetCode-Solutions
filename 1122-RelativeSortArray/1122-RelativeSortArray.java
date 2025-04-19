// Last updated: 19/04/2025, 21:04:48
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        return countingSort(arr1, arr2);
    }

    public static int[] countingSort(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for (int num : arr1) {
            count[num]++;
        }

        int[] output = new int[arr1.length];
        int index = 0;


        for (int num : arr2) {
            while (count[num] > 0) {
                output[index++] = num;
                count[num]--;
            }
        }

     
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                output[index++] = i;
                count[i]--;
            }
        }

        return output;
    }
}
