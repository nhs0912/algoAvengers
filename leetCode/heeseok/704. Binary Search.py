class Solution:
    def search(self, nums: List[int], target: int) -> int:
        numsSize = len(nums)
        return self.binarySearch(nums, 0, len(nums), target, numsSize)

    def binarySearch(self, nums: List[int], start, end, target, numsSize) -> int:

        if start == end:
            return -1
        half = int((start + end) / 2)
        if nums[half] == target:
            return half
        if nums[half] < target:
            return self.binarySearch(nums, half + 1, end, target, numsSize)
        if nums[half] > target:
            return self.binarySearch(nums, start, half, target, numsSize)
