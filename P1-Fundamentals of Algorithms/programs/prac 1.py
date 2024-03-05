# sum of arrays :
arr = [12, 3, 4, 15]
n = len(arr)
print("Sum of given array is ", sum(arr))


# largest number in array :
def largest(arr, n):
    return max(arr)


arr = [10, 324, 45, 90, 9808]
n = len(arr)
Ans = largest(arr, n)  # return max to make the program bigger we are calling the largest method
print(max(arr))  # instead of above line and largest function we can directly use max and print the result
print("Largest in given array is", Ans)


# smallest Number of array:
def Smallest(arr, n):
    return min(arr)


arr = [10, 324, 45, 90, 9808]
n = len(arr)
Ans = Smallest(arr, n)
print("Smallest in given array is", Ans)


# even No in Array:
array = [10, 21, 4, 45, 66, 93]
print("Even No in Array is", end=" ")
for num in array:
    if num % 2 == 0:
        print(num, end=" ")  # using end to display in a single line
