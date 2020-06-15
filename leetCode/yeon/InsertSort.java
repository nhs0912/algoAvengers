class Solution {
    public int[] sortArray(int[] nums) {
        
        int tmpIndex ;
        int tmp ;
        
        for(int i = 0; i < nums.length; i++){
            
            tmp = nums[i];
            tmpIndex = i;
            
            for(int j = i ; j > -1; j--){
                // 이미 정렬된 값들중에 자신보다 작은 값이 있을때 까지 비교  
                if(nums[tmpIndex] < nums[j]){ 
                    nums[tmpIndex] = nums[j];
                    nums[j] = tmp;
                    
                    tmpIndex = j;
                    tmp = nums[j];
                }
            }
        }
        
        return nums;      
            
    }
}
