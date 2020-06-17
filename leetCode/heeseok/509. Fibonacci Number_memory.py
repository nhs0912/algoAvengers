class Solution:
    numList = [0, 1]

    def fib(self, N: int) -> int:
        numSize = len(self.numList)
        if numSize > N and self.numList[N] > 0:
            return self.numList[N]        
        if N < 2:
            return self.numList[N]
        else:
            num = self.fib(N - 1) + self.fib(N - 2)
            self.numList.append(num)
            return num
        return numList[N]
