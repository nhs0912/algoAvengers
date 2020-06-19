// case1
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

// case2. 재귀함수이용
class Solution {
    public int fib(int N) {
        
        if(N > 1){
            return fib(N-1) + fib(N-2);            
        }else{            
            return N;            
        }        
    }
}

// case3.
class Solution {
    private int[] nums;
    
    public int fib2(int N){
        
        if(nums[N-1] == 0){            
            
            nums[N-1] = fib2(N-1);
        }          
        return nums[N-1] + nums[N-2];
    }
    
    public int fib(int N) {
        
        nums = new int[N+2];
        nums[0] = 0;
        nums[1] = 1;
            
        if(N > 1){                        
            return fib2(N);        
        }else{           
            return nums[N];
        }        
    }
}
