class Solution:
    def toLowerCase(self, str: str) -> str:
        out = ''
        baseNum = ord('a')
        for i in str:
            
            if ord('A') <= ord(i) and ord(i) <= ord('Z'):
                diff = ord(i) - ord('A')
                out += chr(baseNum + diff)
            else:
                out += i
        return out
