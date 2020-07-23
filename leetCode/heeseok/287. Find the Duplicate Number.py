class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        numsSize = len(nums)
        baseSum = ((numsSize - 1) * numsSize) / 2
        arrSum = 0
        if numsSize>1 and nums[0] == nums[1]:
            return nums[0]
            
        for i in range(0, numsSize):
            arrSum = arrSum + nums[i]

        return int(arrSum - baseSum)
