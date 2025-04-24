// Last updated: 25/04/2025, 01:11:09
class Solution {
    public int mostFrequentEven(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();

       for(int num: nums){
            if(num % 2 == 0){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
       }
       int maxF = 0;
       int result = -1;
       for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int value = entry.getValue();
            int key = entry.getKey();
            if( value > maxF || (value == maxF && key < result)){
                maxF = value;
                result = key;
            }
       }
       return result;
    }
}
