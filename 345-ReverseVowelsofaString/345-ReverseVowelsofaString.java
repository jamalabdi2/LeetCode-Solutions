// Last updated: 31/03/2025, 10:32:18
class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] charArray = s.toCharArray();

        while (left < right) { 
            char leftChar = charArray[left];
            char rightChar = charArray[right];

            if (isValid(leftChar) && isValid(rightChar)) { 
                swap(charArray, left, right);
                left++;
                right--;
            } else if (isValid(leftChar)) {
                right--;
            } else {
                left++;
            }
        }
        return new String(charArray);
    }

    public boolean isValid(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
