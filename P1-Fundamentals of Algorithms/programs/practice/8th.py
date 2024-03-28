s = int(input("Enter the size of the array: "))
ar = []

for i in range(s):
    ar.append(int(input("Enter an array element: ")))

ar.sort()

print("\nSorted array:", ar)
print("Smallest element:", ar[0])
print("Largest element:", ar[-1])


# ----------------------------------------------------------------


size = int(input("Enter the size of the array: "))
arr = []

for _ in range(size):
    arr.append(int(input("Enter an array element: ")))


for i in range(len(arr)):  # selection algorithm
    min_idx = i
    for j in range(i + 1, len(arr)):
        if arr[j] < arr[min_idx]:
            min_idx = j
    arr[i], arr[min_idx] = arr[min_idx], arr[i]


print("Sorted array:")
for element in arr:
    print(element, end=" ")

print("\nSmallest element:", arr[0])
print("Largest element:", arr[-1])
