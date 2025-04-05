// Last updated: 05/04/2025, 14:47:33
class Solution {
    public int mySqrt(int x) {
        if(x < 1) return x;
       int result = 1; // 2
       for(int i = 1; i <= x/2; i++){  //i = 1
            long product = (long)i * i; // 1
            if(product > x) break; // 1 > 4 false
            result = i; // result = 1
       }
       return result;
    }
}