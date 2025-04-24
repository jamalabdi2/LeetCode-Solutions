// Last updated: 24/04/2025, 23:45:52
class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;
       for(int i = 0; i < s.length(); i++){
            if(letter == s.charAt(i)) count++;
       }
       return (count * 100) / s.length();
    }
}