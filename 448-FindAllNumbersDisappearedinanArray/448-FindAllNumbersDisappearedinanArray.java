// Last updated: 11/04/2025, 20:30:00
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //implement cycle sort to detect which number is missing 
        //initialize counter i = 0
        //run while loop that run while(i < nums.length)
        //check if the current number is in it correct positions?
        //if an array of range [1,n] -> [1,3] -> [1,2,3] idices are 
        // 1 -> 0, 2 -> 1, 3 -> 2 which means the index = number - 1
        //if it does not applies to this format swap it 
        //else just ignore it
        //for example for range [1,4] -> [1,3,4] 2 is missing
        //and indices are 1 -> 0, 3 -> 1, 4 -> 3 but 3 should have index 3 - 1 which is
        // 2 but it has 1 so we just check if(nums[i] != nums[nums[i] - 1])
        //for 3 is if(3 != 4) which is false so we know 3 it was supposed to be at index 2
        //so swap with element 4 swap(nums, 1,2) which is {1,4,3}
        //so for [1,3,4] 2 is missing so let do the cyclic sort
        //i = 0 , correct index = 1 - 1 => 0 so check if nums[0] = 1 !=  nums[correct index] 
        //which is if(1 != 1) is false so increment counter by 1
        // i = 1, nums[1] => 3 , corrctindex = 3 - 1 => 2 check if(nums[1] != nums[2])
        //which is if(3 != 4) true so swap(nums, 1, 2) which is {1,4,3} so now 1 is int correct index
        //and 3 is in it correct index
        // i = 1 nums[1] = 4, correctIndex = 4 - 1 => 3 check if(nums[1] != nums[3])
        //which is if(4 != 3) and nums[3] index out of bound so we have to put check for
        // nums[i] <= nums.length
        //skip it 
        //i = 2, nums[2] => 3 , correct index = 3 -1 => 2 check if(nums[i] != nums[2])
        //which is if(3 != 3) which is false and we increent counter to i = 3
        //since nums.length is 2 and 3 > nums.length we have to stop so our while loop should have
        // while (i < nums.length) and num sorted is {1,4,3}

        //checking part after array is sorted
        //in sorted array like [1,2,3,4] element x is index + 1 for element 3 nums[2] 
        //index is 2 + 1 you get the 3 
        //so loop through the {1,4,3} check if nums[i] != i + 1 if it true we got the missing number
        //as i + 1 else we just ignore
        //for {1,4,3}  i = 0; nums[0] = 1 if(1 != 0 + 1) is false so increment i++
        //i = 1; nums[1] = 4 if(4 != i + 1) true so the list.add(i + 1);
        //i = 2; nums[2] = 3, if(3 != 2+1) false, stop the loop and return the anserr list

        int i = 0;
        int length = nums.length;
        while( i < length){
            int correctIndex = nums[i] - 1;
            if(nums[i] <= length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j = 0; j < length; j++){
            if(nums[j] != j + 1) ans.add(j+1);
        }
        return ans;
    } 
    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}