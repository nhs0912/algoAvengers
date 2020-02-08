class Solution:
    def convertToTitle(self, n):
        str = ''
        while n is not 0:
            tmp = ord('A') + (n - 1) % 26
            str = chr(tmp) + str
            n = (n - 1) // 26

        return str
