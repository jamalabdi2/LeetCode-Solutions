// Last updated: 28/04/2025, 11:50:52
class NumArray {
    int[] nums;
    int n;
    public NumArray(int[] nums) {
        this.n = nums.length;
        this.nums = nums;
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i - 1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        int leftSum = (left == 0) ? 0 : nums[left - 1];
        int rightSum = nums[right];
        return rightSum - leftSum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */