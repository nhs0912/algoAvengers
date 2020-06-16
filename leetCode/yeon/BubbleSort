class Solution {
    public int[] sortArray(int[] nums) {
        
        int len = nums.length;
        
        for(int i = 0; i < len-1; i++){ 
            
            for(int j = 0; j < len-1; j++){
            
                if(nums[j] > nums[j+1]){
                    int tmp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = tmp;
                }
            } 
        }
        
        return nums;      
            
    }
}
