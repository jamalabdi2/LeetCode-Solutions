// Last updated: 24/04/2025, 22:29:28
class Solution {
    public int[] frequencySort(int[] nums) {
        //1:2, 2:3, 3:1, 4:2
                        
         //create buckets [] [3] [1,4] [2] [] [] [] []
         // 3 1 1 2 2 2
         final int OFFSET = 100;
         int[] count = new int[201];

         //calculate the frequency
         for(int num: nums){
            count[num + OFFSET]++;
         }

         //create buckets
         List<Integer>[] buckets = new List[nums.length + 1];
         for(int i = 0; i < count.length; i++){
            int freq = count[i];
            if(freq > 0){
                if(buckets[freq] == null){
                    buckets[freq] = new ArrayList<>();
                }
                buckets[freq].add(i - OFFSET);
            }
         }

        List<Integer> results = new ArrayList<>();
        for(int i = 0; i < buckets.length; i++){
            if(buckets[i] != null){
                Collections.sort(buckets[i], Collections.reverseOrder());
               for(int num: buckets[i]){
                  for(int j = 0; j < i; j++){
                     results.add(num);
                  }
               }
            }
        }
        int[] resArr = new int[results.size()];
        for(int i = 0; i < resArr.length; i++){
            resArr[i] = results.get(i);
        }
        return resArr;
    }
   
}