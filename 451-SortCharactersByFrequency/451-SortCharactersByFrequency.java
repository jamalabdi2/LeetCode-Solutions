// Last updated: 22/04/2025, 15:10:37
class Solution {
    public String frequencySort(String s) {
        String ans = sortString(s);
        return ans;
    }
    public static String sortString(String s){
        int[] freq = new int[256];
        for(char c: s.toCharArray()) freq[c]++;

        StringBuilder[] buckets = new StringBuilder[s.length() + 1];
        for(int i = 0; i < 256; i++){
            int f = freq[i];
            if(f > 0){
                if(buckets[f] == null){
                    buckets[f] = new StringBuilder();
                }
                buckets[f].append( (char) i);
            }
        }

        //we have characters in the buckets
        //so we have to fill 
        StringBuilder sb = new StringBuilder();
        for(int i = buckets.length - 1; i >= 0; i--){
            if(buckets[i] != null){
                for(char c: buckets[i].toString().toCharArray()){
                    sb.append(String.valueOf(c).repeat(i));
                }
            }
        }
        return sb.toString();
    }
}