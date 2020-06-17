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

// 재귀함수이용
class Solution {
    public int fib(int N) {
        
        if(N > 1){
            return fib(N-1) + fib(N-2);            
        }else{            
            return N;            
        }        
    }
}
