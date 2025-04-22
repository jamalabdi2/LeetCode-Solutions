// Last updated: 22/04/2025, 12:21:26
class Solution {
public:
    void countSort(vector<int> &nums,int n,int exp){
        int output[n];
        int i,count[10] = {0};
        for(i=0;i<n;i++)
            count[(nums[i]/exp)%10]++;
        for(i=1;i<10;i++)
            count[i] += count[i-1];
        for(i=n-1;i>=0;i--){
            output[count[(nums[i]/exp)%10]-1] = nums[i];
            count[(nums[i]/exp)%10]--;
        }
        for(int i=0;i<n;i++){
            nums[i] = output[i];
        }
    }
    int getMax(vector<int>nums,int n){
        int mx = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]>mx)
                mx = nums[i];
        }
        return mx;
    }
    int maximumGap(vector<int>& nums) {
        if(nums.size()<2)   return 0;
        int n = nums.size();
        int m = getMax(nums,n);
        for(int exp = 1;m/exp;exp*=10){
            countSort(nums,n,exp);
        }
        
        int mx = INT_MIN;
        for(int i=0;i<nums.size()-1;i++){
            mx = max(nums[i+1]-nums[i],mx);
        }
        return mx;
    }
};