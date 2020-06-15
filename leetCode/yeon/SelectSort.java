class Solution {
    public int[] sortArray(int[] nums) {
        
        int tmpIndex ;
        int tmp ;
        
        for(int i = 0; i < nums.length ; i++){
            tmpIndex = i;
            tmp = nums[i];
            for(int j = i ; j < nums.length; j++ ){
                // 제일 작은수 찾기
                if( tmp > nums[j]){
                    tmpIndex = j;
                    tmp = nums[j];
                }
            }
            
            nums[tmpIndex] = nums[i];
            nums[i] = tmp;
        }
        
        return nums;      
            
    }
}
