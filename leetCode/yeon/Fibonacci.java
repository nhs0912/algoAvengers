class Solution {
    public int fib(int N) {
        
        int i = 0 ;
        
        int[] result = new int[N+1];
        
        while(i <= N){
            
            if(i == 0){
                
                result[0] = 0;
                
            }else if(i == 1){
                
                result[1] = 1;
            
            }else{
                
                result[i] = result[i-1] + result[i-2];    
            }
            
            i++;
        }
        
        return result[N];
    }
}
