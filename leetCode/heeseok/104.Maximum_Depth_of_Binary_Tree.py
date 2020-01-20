# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:
    treeLevel = 0
    maxLevel = 1

    def inOrder(self, root: TreeNode, level) -> int:

        if not root:
            return level
        level += 1
        if self.maxLevel < level:
            self.maxLevel = level
        self.inOrder(root.left, level)
        self.inOrder(root.right, level)

    def maxDepth(self, root: TreeNode) -> int:

        if not root:
            return 0
        if root and not root.left and not root.right:
            return 1
        self.inOrder(root, 0)
        return self.maxLevel

