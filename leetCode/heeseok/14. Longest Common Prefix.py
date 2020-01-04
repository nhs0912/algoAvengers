from typing import List


# 1) 첫번째 단어와 두번째 단어의 공통문자를 찾는다.(if listSize >1 )
# 2) 세번째 이후 단어와 공통문자를 비교한다.
#   2-1) 검사를 다 했으면 공통문자를 출력한다.
# 3) listSize가 1이면 단어 그대로 출력한다.

# list 2개를 입력받아 둘 중 짧은 길이를 return 한다.
def getMinSize(listOne, listTwo):
    listOneSize = len(listOne)
    listTwoSize = len(listTwo)

    return listOneSize if listOneSize <= listTwoSize else listTwoSize


class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        listSize = len(strs)
        # listSize가 1보다 클 때
        if listSize > 1:
            commonStr = ""
            # 첫번째 문자와 두번째 문자 중 공통문자를 찾는다.
            for i in range(0, getMinSize(strs[0], strs[1])):
                if strs[0][i] == strs[1][i]:
                    commonStr += strs[0][i]
                else:
                    break

            # 나머지 문자열을 검사 한다. (if listSize > 3)
            if listSize > 2:
                for j in range(2, listSize):
                    tmpCommonStr = ""
                    # ""문자가 하나라도 들어가있으면 그대로 "" 출력
                    if strs[j] == "":
                        return ""
                    for k in range(0, getMinSize(commonStr, strs[j])):
                        # 임시 공통 문자를 생성한 다음 기존공통문자와 list단어와 비교해서 임시공통문자에 저장한다.
                        # 그리고 임시공통문자를 기존공통문자에 저장한다.
                        if commonStr[k] == strs[j][k]:
                            tmpCommonStr += strs[j][k]

                    commonStr = tmpCommonStr
            return commonStr
        # listSize가 1일때
        elif listSize == 1:
            return strs[0]
        # listSize가 0 이하일 때
        elif listSize < 1:
            return ""


list = ["flower","flow","flight"]
print(Solution().longestCommonPrefix(list))
