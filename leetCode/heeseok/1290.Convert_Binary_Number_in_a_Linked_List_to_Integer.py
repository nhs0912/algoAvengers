# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def getDecimalValue(self, head: ListNode) -> int:

        tmp = head
        index = 0
        resultSum = 0
        savebinaryNumber = []
        while tmp != None:
            savebinaryNumber.append(tmp.val)
            # if tmp.val == 1:
            #     resultSum += 2 ** index
            tmp = tmp.next
            # index += 1
        savebinaryNumberSize = len(savebinaryNumber)
        for i in range(savebinaryNumberSize-1, -1, -1):
            if savebinaryNumber[i] == 1:
                resultSum += 2 ** index
            index += 1

        return resultSum
