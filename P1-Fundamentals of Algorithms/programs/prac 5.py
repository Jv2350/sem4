def mergeSort(myList):
    # check if the list has more than one element
    if len(myList) > 1:
        # find the middle index of the list
        mid = len(myList) // 2
        # divide the list into two halves
        left = myList[:mid]
        right = myList[mid:]

        # recursive call to mergeSort for each half
        mergeSort(left)
        mergeSort(right)

        # initialize iterators for traversing the two halves and the main list
        i = 0
        j = 0
        k = 0

        # merge the two halves into the main list in sorted order
        while i < len(left) and j < len(right):
            if left[i] < right[j]:
                # assign the smaller value from the left half to the main list
                myList[k] = left[i]
                i += 1
            else:
                # assign the smaller value from the right half to the main list
                myList[k] = right[j]
                j += 1
            # move to the next position in the main list
            k += 1

        # copy the remaining elements from left half, if any
        while i < len(left):
            myList[k] = left[i]
            i += 1
            k += 1
        # copy the remaining elements from right half, if any
        while j < len(right):
            myList[k] = right[j]
            j += 1
            k += 1


# example usage
myList = [60, 0, 30, 10]
mergeSort(myList)
print(myList)
