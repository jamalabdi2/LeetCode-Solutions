class Solution {
    public int addDigits(int num) {
        if(num < 10) return num;
        int numLength = String.valueOf(num).length();
        
        while(numLength >= 2){
            int first = num % 10;
            int second = num / 10;
            num = first + second;
            numLength = String.valueOf(num).length();
        }
        return num;
    }
}