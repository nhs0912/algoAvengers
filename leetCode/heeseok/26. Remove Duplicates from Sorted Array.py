from typing import List


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0
        checkNum = nums[0]
        checkCnt = 1
        changeIndex = 1
        listSize = len(nums)
        for i in range(0,listSize):
            if nums[i] != checkNum:
                checkNum = nums[i]
                nums[changeIndex] = checkNum
                changeIndex += 1
                checkCnt += 1

        return checkCnt
