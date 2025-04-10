// Last updated: 11/04/2025, 02:06:42
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums) set.add(num);
        List<Integer> ans = new ArrayList<>();
        for(int i = 1; i <= nums.length; i++ ){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    } 
}