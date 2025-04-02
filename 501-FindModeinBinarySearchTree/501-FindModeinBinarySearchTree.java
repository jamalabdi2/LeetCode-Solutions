// Last updated: 03/04/2025, 02:08:28
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        dfs(root, map);

        int maxFreq = 0;
        for(int key: map.keySet()){
            maxFreq = Math.max(maxFreq, map.get(key));
        }

        List<Integer> ans = new ArrayList<>();
        for(int key: map.keySet()){
            if(map.get(key) == maxFreq){
                ans.add(key);
            }
        }

        int[] result = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            result[i] = ans.get(i);
        }
        return result;
    }
    public void dfs(TreeNode node,HashMap<Integer,Integer> map){
        if(node == null) return; 
        map.put(node.val, map.getOrDefault(node.val, 0) + 1);
        dfs(node.left, map);
        dfs(node.right, map);

    }
}