class Solution {
    public int[] sortArray(int[] nums) {
        
        int size = nums.length;
             
        for(int i = 0; i < size-1 ; i++){
            
            int min_index = i;
            
            for(int j = i+1; j < size;  j++){
                
                if(nums[j] < nums[min_index]){
                     
                    min_index = j;
                }
            }
            
            int temp = nums[min_index];
            nums[min_index] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}
