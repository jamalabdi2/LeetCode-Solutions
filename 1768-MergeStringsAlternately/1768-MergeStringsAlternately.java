// Last updated: 29/03/2025, 10:19:14
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = 0;
        for(int num: candies){
            maxCandy = Math.max(maxCandy, num);
        }
        

        List<Boolean> ans = new ArrayList<>(candies.length);
        for(int candy: candies){
            ans.add(candy + extraCandies >= maxCandy);
        }
        return ans;
    }
}