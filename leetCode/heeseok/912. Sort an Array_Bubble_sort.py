class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        numsSize = len(nums)
        for i in range(0, numsSize):
            for j in range(0, numsSize-1):
                if nums[j] > nums[j + 1]:
                    tmp = nums[j]
                    nums[j] = nums[j+1]
                    nums[j+1] = tmp

        return nums

