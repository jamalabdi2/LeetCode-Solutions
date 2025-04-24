// Last updated: 24/04/2025, 23:15:38
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map = new HashMap<>();
        for(int i = 0; i < names.length; i++) map.put(heights[i], names[i]);
        Arrays.sort(heights);

        String[] ans = new String[names.length];

        int index = 0;
        for(int j = heights.length - 1; j >= 0; j--){
            String name = map.get(heights[j]);
            ans[index++] = name;
        }
        return ans;
    }
}