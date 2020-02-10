from typing import List


class Solution:

    def checkDuplicate(self,nums:List[int])->bool:
        check = 0
        for i in nums:
            if (check & 1 << i) > 0:
                return True
            check = check | (1 << i)

        return False

    def containsDuplicate(self, nums: List[int]) -> bool:
        plus = []
        minus = []
        for i in nums:
            if i>=0:
                plus.append(i)
            else:
                minus.append(i*-1)

        return self.checkDuplicate(plus) or self.checkDuplicate(minus)


a = [-3, -3]
print(Solution().containsDuplicate(a))
