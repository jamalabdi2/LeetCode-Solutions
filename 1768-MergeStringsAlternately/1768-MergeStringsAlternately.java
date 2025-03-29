// Last updated: 29/03/2025, 10:00:30
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2+str1)) return "";
        int length = gcd(str1.length(), str2.length());
        return str1.substring(0, length);
    }

    public static int gcd(int x, int y){
        if(y == 0) {
            return Math.abs(x);
        }else{
            return gcd(y, x % y);
        }
    }
}