def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    else:
        pivot = arr[0]
        less_than_pivot = [x for x in arr[1:] if x <= pivot]
        greater_than_pivot = [x for x in arr[1:] if x > pivot]
        return quick_sort(less_than_pivot) + [pivot] + quick_sort(greater_than_pivot)


# Example usage:
numbers = [5, 3, 8, 2, 9, 1, 6, 4, 7]
print("Before sort:", numbers)
sorted_numbers = quick_sort(numbers)
print("Sorted numbers using Quick Sort:", sorted_numbers)
