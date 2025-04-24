// Last updated: 24/04/2025, 23:42:17
class Solution {
    public int percentageLetter(String s, char letter) {
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            count[c - 'a']++;
        }
    
        int letterCount = count[letter - 'a'];
        return (letterCount * 100) / s.length();
    }
}