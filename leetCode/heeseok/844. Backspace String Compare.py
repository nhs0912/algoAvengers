# 1) S,T를 탐색한다.
#  1-1) 글자가 '#'가 있으면 pop하고 없으면 list에 추가한다.(push)
# 2) sList와 tList를 비교한다.
#     2-1) list size가 다르면 False
#     2-2) 같으면 글자를 비교한다. 하나라도 다르면 False
# 3) 이 모든 과정이 통과하면 True

class Solution:
    def backspaceCompare(self, S: str, T: str) -> bool:
        sList = []
        tList = []
        sListSize = len(sList)
        tListSize = len(tList)
        if not S or not T:
            return False
        for i in S:
            if i == '#' and len(sList) > 0:
                sList.pop()
            elif i == '#' and len(sList) == 0:
                continue
            else:
                sList.append(i)

        for i in T:
            if i == '#' and len(tList) != 0:
                tList.pop()
            elif i == '#' and len(tList) == 0:
                continue
            else:
                tList.append(i)

        sListSize = len(sList)
        tListSize = len(tList)
        if sListSize != tListSize:
            return False
        for i in range(0, sListSize):
            if sList[i] != tList[i]:
                return False

        return True
