// Last updated: 31/03/2025, 10:31:32
class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] charArray = s.toCharArray();

        while(left < right){
            //move left pointer forward until we find a vowel
            while(left < right && !isValid(charArray[left])){
                left++;
            } 
            while(left < right && !isValid(charArray[right])){
                right--;
            }   
            swap(charArray,left,right);
            left++;
            right--;

        }
        return new String(charArray);
        
    }
    public boolean isValid(char c){
        return "AEIOUaeiou".indexOf(c) != -1; 
    }
    public void swap(char[] arr, int left,int right){
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}