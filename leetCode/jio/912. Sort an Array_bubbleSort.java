class Solution {
    public int[] sortArray(int[] nums) {
        
        int size = nums.length;
        
        for(int i = 0; i < size-1; i++){
               
            for(int j = 0; j < size-1-i; j++) {
                
                if(nums[j] > nums[j+1]){
                
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }           
        }
        return nums;
    }
}
