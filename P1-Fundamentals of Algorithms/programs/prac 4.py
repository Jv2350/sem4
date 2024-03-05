# Write a program in python to sort "n" numbers Using Quick sort algorithm.
Array = [60, 50, 70, 80, 20, 40, 30, 90, 10]


def quickSort_usingSorted(array):
    return sorted(Array)  # to quickly sort but we have to use quick sort algorithm


print(quickSort_usingSorted(Array))  # but this is not acceptable i think ;)


# ----------------------------------------------------------------


def quickSort(arr):
    if len(arr) <= 1:
        return arr
    else:
        pivot = arr[0]
        less_than_pivot = [x for x in arr[1:] if x <= pivot]
        greater_than_pivot = [x for x in arr[1:] if x > pivot]
        return quickSort(less_than_pivot) + [pivot] + quickSort(greater_than_pivot)


arr = [60, 50, 70, 80, 20, 40, 30, 90, 10]
sorted_arr = quickSort(arr)
print(sorted_arr)


# ----------------------------------------------------------------


def quickSort(list):
    quickSortHelper(list, 0, len(list) - 1)


def quickSortHelper(alit, first, last):
    if first < last:
        splitPoint = partition(alit, first, last)
        quickSortHelper(alit, first, splitPoint - 1)
        quickSortHelper(alit, splitPoint + 1, last)


def partition(list, first, last):  # this step can be simplified
    pivotValue = list[first]

    leftMark = first + 1
    rightMark = last

    done = False
    while not done:
        while leftMark <= rightMark and list[leftMark] <= pivotValue:
            leftMark += 1

        while list[rightMark] >= pivotValue and rightMark >= leftMark:
            rightMark -= 1

        if rightMark < leftMark:
            done = True
        else:
            temp = list[leftMark]
            list[leftMark] = list[rightMark]
            list[rightMark] = temp

    temp = list[first]
    list[first] = list[rightMark]
    list[rightMark] = temp

    return rightMark


list = [60, 50, 70, 80, 20, 40, 30, 90, 10]
quickSort(list)
print(list)
