// Last updated: 22/04/2025, 15:42:09
class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for(char c: s.toCharArray()){
            freq[c - 'a']++;
        }
        for(int i = 0; i < s.length(); i++){
            int index = s.charAt(i) - 'a';
            if(freq[index] == 1){
                return i;
            }
        }
        return -1;
        
    }
}