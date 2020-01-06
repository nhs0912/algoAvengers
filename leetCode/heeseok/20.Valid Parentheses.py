# 1) 모든 문자를 stack에 저장한다.
# 2) },],) 을 만나면 stack에 push 한다.
#  2-1) {,[,(을 만나면 firstChar와 stack을 pop한 문자와 비교해서 둘이 다르면 return False해준다.
# 3) charList가 비워도 stack에 문자가 남아있다면 짝이 맞지 않기 때문에 return False 한다.
# 4) 위의 조건이 다 맞지 않으면 return True한다.


class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        charList = list(s)
        stackSize = len(charList)
        if stackSize == 1:
            return False
        while (len(charList) != 0):
            firstChar = charList.pop()
            if firstChar == '}' or firstChar == ']' or firstChar == ')':
                stack.append(firstChar)
            else:
                if len(stack) == 0:
                    return False
                if firstChar == '{':
                    if '}' != stack.pop():
                        return False
                elif firstChar == '(':
                    if ')' != stack.pop():
                        return False
                elif firstChar == '[':
                    if ']' != stack.pop():
                        return False
        if len(stack) >0:
            return False
        return True
