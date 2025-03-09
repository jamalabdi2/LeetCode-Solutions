class Solution {
    public int[][] merge(int[][] intervals) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> Integer.compare(a[0],b[0]));
        for(int [] interval: intervals) heap.add(interval);

        List<int[]> merged = new ArrayList<>();
        int[] prevInterval = heap.poll();
        merged.add(prevInterval);

        while(!heap.isEmpty()){
            int[] currentInterval = heap.poll();
            if(prevInterval[1] >= currentInterval[0]){
                prevInterval[1] = Math.max(currentInterval[1],prevInterval[1]);
            }else{
                merged.add(currentInterval);
                prevInterval = currentInterval;
            }
        }
        int[][] ans = new int[merged.size()][merged.get(0).length];
        for(int i = 0; i < merged.size(); i++){
            ans[i] = merged.get(i);
        }
        return ans;
    }
}