from typing import List

class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        sSize = len(s)
        for i in range(0, int(sSize / 2)):
            leftIndex = i
            rightIndex = sSize - (1 + i)
            tmp = s[leftIndex]
            s[leftIndex] = s[rightIndex]
            s[rightIndex] = tmp



