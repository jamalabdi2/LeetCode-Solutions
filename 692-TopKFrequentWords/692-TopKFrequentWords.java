// Last updated: 24/04/2025, 22:01:07
class Solution {
    public static List<String> topKFrequent(String[] words, int k){
        //create the frequency map
        //create the buckets
        //put them inside based on frequency
        //go from back and sort the array and put them back
        HashMap<String, Integer> map = new HashMap<>();
        for(String word: words){
            map.put(word, map.getOrDefault(word,0) + 1);
        }
        int maxFrequency = Collections.max(map.values());
        List<String>[] buckets = new List[maxFrequency + 1];

        for(String word: map.keySet()){
            int freq = map.get(word);
            if(buckets[freq] == null){
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(word);
        }
        List<String> result = new ArrayList<>();
        for(int i = buckets.length - 1; i >= 0 && result.size() < k; i--){
            if(buckets[i] != null){
                Collections.sort(buckets[i]);
                for(String word: buckets[i]){
                    result.add(word);
                    if(result.size() == k) break;
                }
            }
        }
        return result;
    }
    
}