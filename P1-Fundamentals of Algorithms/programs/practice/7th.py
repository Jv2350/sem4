class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None


def inorder(temp):
    if not temp:
        return
    inorder(temp.left)
    print(temp.data, end=" ")
    inorder(temp.right)


def deleteDeepest(root, d_node):
    q = []
    q.append(root)

    while len(q):
        temp = q.pop(0)
        if temp is d_node:
            temp = None
            return
        if temp.right:
            if temp.right is d_node:
                temp.right = None
                return
            else:
                q.append(temp.right)
        if temp.left:
            if temp.left is d_node:
                temp.left = None
                return
            else:
                q.append(temp.left)


def deletion(root, key):
    if root is None:
        return None
    if root.left is None and root.right is None:
        if root.data == key:
            return None
        else:
            return root
    q = []
    q.append(root)
    key_node = None
    while len(q):
        temp = q.pop(0)
        if temp.data == key:
            key_node = temp
        if temp.left:
            q.append(temp.left)
        if temp.right:
            q.append(temp.right)
    if key_node:
        x = temp.data
        deleteDeepest(root, temp)
        key_node.data = x
    return root


if __name__ == "__main__":
    root = Node(10)
    root.left = Node(11)
    root.left.left = Node(7)
    root.left.right = Node(12)
    root.right = Node(9)
    root.right.left = Node(15)
    root.right.right = Node(8)
    print("Tree before deletion:")
    inorder(root)
    key = 11
    root = deletion(root, key)
    print("\nTree after deletion:")
    inorder(root)

"""
Tree before deletion:
7 11 12 10 15 9 8
Tree after deletion:
7 8 12 10 15 9
"""
