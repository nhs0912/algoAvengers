from typing import List


class Solution:

    def checkIfExist(self, arr: List[int]) -> bool:
        doubleList = []
        arrSize = len(arr)
        zeroCnt = 0
        for i in arr:
            doubleList.append(i * 2)

        for i in arr:
            if i == 0:
                zeroCnt += 1
            for j in doubleList:
                if i == 0:
                    continue
                if i == j:
                    return True

        if zeroCnt > 1:
            return True
        return False


list = [-2, 0, 10, -19, 4, 6, -8]
print(Solution().checkIfExist(list))
