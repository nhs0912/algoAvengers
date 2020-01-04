# 1) 입력된 숫자를 문자로 변환한다.
# 2) 입력된 문자 길이를 2로 나누어 자릿수가 어느정도 까지 체크 해야하는지 알아낸다.
# 3) 첫째자리(1)와 n-1을 비교해간다.
#  3-1) 같으면 문자길이/2 자릿수까지  비교한다.
#  3-2) 다르면 false를 반환한다.


class Solution:
    def isPalindrome(self, x: int) -> bool:
        numStr = str(x)
        numStrSize = int(len(numStr))
        checkSize = int(numStrSize / 2)
        
        for i in range(0, checkSize):

            if numStr[i] != numStr[numStrSize-1-i]:
                return False
        return True
