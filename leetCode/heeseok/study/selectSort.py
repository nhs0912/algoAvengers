class selectSort:
    list = []

    # constructor
    # def __init__(self, nums:int):
    #     self.list = nums

    def change(self,list:list, x, y):
        tmp = list[x]
        self.list[x] = self.list[y]
        self.list[y] = tmp

    def execute(self, nums: list):
        self.list = nums
        listSize = len(self.list)

        if listSize > 1:
            for i in range(0, listSize-1):
                minNum = self.list[i]
                minIndex = i
                for j in range(i+1, listSize):
                    if minNum > self.list[j]:
                        minNum = self.list[j]
                        minIndex = j
                self.change(self.list,i,minIndex)
                print(i+1,"번째-->",self.list)

        return self.list


arr = [6, 1, 7, 8, 9, 3, 5, 4, 2]
print(0,"번째-->",arr)
print("result-->",selectSort().execute(arr))
