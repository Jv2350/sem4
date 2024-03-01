# Sum of arrays :

arr = [12, 3, 4, 15]
n = len(arr)
print("Sum of given array is ", sum(arr))


# Largest number in array :
def largest(arr, n):
    return max(arr)


arr = [10, 324, 45, 90, 9808]
n = len(arr)
Ans = largest(arr, n)
print("Largest in given array is", Ans)


# Smallest Number of array:
def Smallest(arr, n):
    return min(arr)


arr = [10, 324, 45, 90, 9808]
n = len(arr)
Ans = Smallest(arr, n)
print("Smallest in given array is", Ans)


# Even No in Array:
array = [10, 21, 4, 45, 66, 93]
print("Even No in Array is", end=" ")
for num in array:
    if num % 2 == 0:
        print(num, end=" ")
