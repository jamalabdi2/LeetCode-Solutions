// Last updated: 24/04/2025, 21:05:39
// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         HashMap<Integer, Integer> seen = new HashMap<>();
//         for(int num: nums){
//             seen.put(num, seen.getOrDefault(num, 0) + 1);
//         }
//         Integer[] keys = seen.keySet().toArray(new Integer[0]);
//         Arrays.sort(keys, (a, b) -> seen.get(b) - seen.get(a));
//         Integer[] topKElements = Arrays.copyOfRange(keys,0,k);
        
//         int[] result = new int[topKElements.length];
//         for(int i = 0; i<result.length; i++){
//             result[i] = topKElements[i];
//         }
//         return result;
//     }
// }

// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         Map<Integer, Integer> count = new HashMap<>();
//         List<Integer>[] freq = new List[nums.length + 1];

//         for (int i = 0; i < freq.length; i++) {
//             freq[i] = new ArrayList<>();
//         }

//         for (int n : nums) {
//             count.put(n, count.getOrDefault(n, 0) + 1);
//         }

//         for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
//             freq[entry.getValue()].add(entry.getKey());
//         }

//         int[] res = new int[k];
//         int index = 0;
//         for (int i = freq.length - 1; i > 0 && index < k; i--) {
//             for (int n : freq[i]) {
//                 res[index++] = n;
//                 if (index == k) {
//                     return res;
//                 }
//             }
//         }
//         return res;
//     }
// }
class Solution {
        //solution using bucket sort
    public static int[] topKFrequent(int[] arr, int k){
        final int OFFSET = 10000;
        //create the array in range [-10000, 10000]
        int[] count = new int[20001];
        //count the frequency
        for(int num: arr){
            count[num + OFFSET]++;
        }

        //Create bucket of array length + 1
        //cause the maximum frequency we can get is [n]
        List<Integer>[] buckets = new ArrayList[arr.length + 1];
        //populate the buckets with new array
        for(int i = 0; i < buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }

        //fill the buckets
        for(int i = 0; i < count.length; i++){
            //check if there is frequecy
            int f = count[i];
            if(f > 0){
                //put the element in the correct bucket
                buckets[f].add(i - OFFSET);
            }
        }

        //Loop through the bucket from back
        List<Integer> results = new ArrayList<>();
        for(int i = buckets.length - 1; i >= 0 && results.size() < k; i--){
            for(int num: buckets[i]){
                results.add(num);
                if(results.size() == k) break;
            }
        }

        int[] resArr = new int[results.size()];
        for(int j = 0; j < results.size(); j++){
            resArr[j] = results.get(j);
        }
        return resArr;

    }
}