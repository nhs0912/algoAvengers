class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        nums = sorted(nums)
        numsSize = len(nums)
        if numsSize == 1:
            return nums[0]
        for i in range(1,numsSize):
            if nums[i-1]==nums[i]:
                return nums[i]
