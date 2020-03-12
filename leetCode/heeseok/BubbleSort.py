class Solution:
    def execute(self, nums: list) -> list:
        numsSize = len(nums)
        for i in range(0, numsSize):
            for j in range(0, numsSize - 1):
                if nums[j] > nums[j + 1]:
                    tmp = nums[j]
                    nums[j] = nums[j + 1]
                    nums[j + 1] = tmp
        return nums
inputList = [3,4, 1, 6, 7, 2, 19, 34]
print(Solution().execute(inputList))
