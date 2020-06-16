class Solution {
    public int fib(int N) {
        
        int[] nums = new int[N+1];
        int size = nums.length;
        
        for(int i = 0; i < size; i++) {
            
            if(i > 1) {
                nums[i] = nums[i-1] + nums[i-2]; 
            }else{
                nums[i] = i;
            }           
        }
        return nums[N];
    }
}
