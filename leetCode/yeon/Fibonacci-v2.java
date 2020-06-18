class Solution {
    public int fib(int N) {
        
        int[] nums = new int[N+1];
        
        return fibonacci(N, nums);
        
    }
    
    public int fibonacci(int N, int[] nums) {
    // TODO Auto-generated method stub
    if(N == 0) { 
      
      nums[0] = 0;
      
      return N;
      
    }else if(N == 1) {
      
      nums[0] = 0;
      nums[1] = 1;
      
      return N;
    }
    
    nums[N] = fibonacci(N-1, nums) + nums[N-2];
    
    return nums[N];
  }
}
