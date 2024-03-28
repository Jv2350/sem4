def linear_search(arr, target):
    for i in range(len(arr)):
        if arr[i] == target:
            return i
    return -1


def binary_search(arr, target):
    low = 0
    high = len(arr) - 1
    while low <= high:
        mid = (low + high) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            low = mid + 1
        else:
            high = mid - 1
    return -1


arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
target = 7

linear_result = linear_search(arr, target)
binary_result = binary_search(arr, target)

if linear_result != -1:
    print(f"Linear Search: Element found at index {linear_result}")
else:
    print("Linear Search: Element not found")

if binary_result != -1:
    print(f"Binary Search: Element found at index {binary_result}")
else:
    print("Binary Search: Element not found")
