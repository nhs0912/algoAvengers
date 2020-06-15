class Solution:

    # exchange a to b
    def exchange(self, nums: List[int], aIndex, bIndex):
        tmp = nums[aIndex]
        nums[aIndex] = nums[bIndex]
        nums[bIndex] = tmp

    # Make a Selection Sort
    def selectSort(self, nums: List[int]) -> List[int]:
        numsSize = len(nums)
        #두번째부터 제일 작은 수를 검색한다.
        for i in range(1,numsSize):
            # 첫번재 수
            firstNum = nums[i-1]
            firstNumIndex = i-1
            smallNum = nums[i]
            smallNumIndex = i
            for j in range(i,numsSize):
                if smallNum > nums[j]:
                    smallNum = nums[j]
                    smallNumIndex = j

            if smallNum < firstNum:
                self.exchange(nums,firstNumIndex,smallNumIndex)
        return nums

    # Order Sort
    def sortArray(self, nums: List[int]) -> List[int]:
        return self.selectSort(nums)
        

