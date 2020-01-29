from typing import List


class Solution:

    def generate(self, numRows: int) -> List[List[int]]:
        arrayList = []
        numberList = []
        if numRows > 0:
            numberList.append([1])
        if numRows > 1:
            numberList.append([1, 1])
        if numRows > 2:

            for i in range(3, numRows + 1):
                numList2 = []
                numList2.append(1)
                size = len(numberList[i - 2])
                for j in range(0, size - 1):
                    sum = numberList[i - 2][j] + numberList[i - 2][j + 1]
                    numList2.append(sum)
                numList2.append(1)
                numberList.append(numList2)

        return numberList
