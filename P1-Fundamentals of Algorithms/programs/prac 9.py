import sys

print("Enter a size of an array")
s = int(input())
i = 0
ar = []
print("Enter array elements")
while i < s:
    ar.append(int(input()))
    i += 1
    print("Array values are:")
    print(ar)
for i in range(len(ar)):
    min_idx = i
    for j in range(i + 1, len(ar)):
        if ar[min_idx] > ar[j]:
            min_idx = j
            ar[i], ar[min_idx] = ar[min_idx], ar[i]

print("Sorted array")
for i in range(len(ar)):
    print("%d" % ar[i])
    print("Smallest element:%d" % ar[0])
    print("Largest element:%d" % ar[s - 1])
