def selection_sort(arr):
    n = len(arr)
    for i in range(n):
        min_idx = i
        for j in range(i + 1, n):
            if arr[j] < arr[min_idx]:
                min_idx = j
        arr[i], arr[min_idx] = arr[min_idx], arr[i]
    return arr


def insertion_sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key
    return arr


# Example usage
if __name__ == "__main__":
    arr = [64, 25, 12, 22, 11]

    print("Original Array:", arr)
    sorted_arr_selection = selection_sort(arr.copy())
    print("Sorted Array (Selection Sort):", sorted_arr_selection)

    sorted_arr_insertion = insertion_sort(arr.copy())
    print("Sorted Array (Insertion Sort):", sorted_arr_insertion)
