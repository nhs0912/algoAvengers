class Solution:    
    def fib(self, N: int) -> int:
        numList=[0,1]
        if N < 2:
            return numList[N]        
        else:
            for i in range(2,N+1):
                numList.append(numList[i-1] + numList[i-2])
        return numList[N]
       
        

