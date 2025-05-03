// Last updated: 03/05/2025, 11:04:35
class NumArray {
    private int[] tree;
    private int[] nums;
    private int size;

    public NumArray(int[] nums) {
        this.size = nums.length;
        this.tree = new int[size + 1];
        this.nums = new int[size];

        //build tree
        for(int i = 0; i < size; i++){
            this.nums[i] = nums[i];
            updateTree(i + 1, nums[i]);
        }
    }
    
    public void update(int i, int val) {
       int diff = val - nums[i];
       nums[i] = val;
       updateTree(i + 1, diff);
    }
    public void updateTree(int i, int val){
        while( i <= size){
            tree[i] += val;
            i += (i & -i);
        }
    }
    public int query(int i){
        int sum = 0; 
        while (i > 0){
            sum += tree[i];
            i -= (i & -i);
        }
        return sum;
    }
    
    public int sumRange(int left, int right) {
        return query(right + 1) - query(left );
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */