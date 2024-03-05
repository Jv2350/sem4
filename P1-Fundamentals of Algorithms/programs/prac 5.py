# Aim - write a python program to sort n number using merge sort algorithm. discuss the complexity


def merge_sort(arr):
    if len(arr) > 1:
        m = len(arr) // 2
        L, R = arr[:m], arr[m:]
        merge_sort(L)
        merge_sort(R)
        i = j = k = 0
        while i < len(L) and j < len(R):
            arr[k], i, j = (L[i], i + 1, j) if L[i] < R[j] else (R[j], i, j + 1)
            k += 1
        arr[k:] = L[i:] + R[j:]


# Example usage
arr = [60, 0, 30, 10, 20]
merge_sort(arr)
print(arr)


# ----------------------------------------------------------------


def mergeSort(arr):
    if len(arr) > 1:
        mid = len(arr) // 2
        left = arr[:mid]
        right = arr[mid:]

        mergeSort(left)
        mergeSort(right)

        i = j = k = 0

        while i < len(left) and j < len(right):
            if left[i] < right[j]:
                arr[k] = left[i]
                i += 1
            else:
                arr[k] = right[j]
                j += 1
            k += 1

        while i < len(left):
            arr[k] = left[i]
            i += 1
            k += 1

        while j < len(right):
            arr[k] = right[j]
            j += 1
            k += 1


arr = [60, 0, 30, 10]
mergeSort(arr)
print(arr)
