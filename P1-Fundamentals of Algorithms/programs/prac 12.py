# Write python program for implementing Strassen matrix multiplication using divide and conquer method.

l = [[0, 2], [0, 1]]
m = [[0, 0], [3, 4]]

print(l)
print(m)


def strassen(a, b):
    s = ([b[0][1] - b[1][1]],)
    a[0][0] + a[0][1],
    a[1][0] + a[1][1],
    b[1][0] - b[0][0],
    a[0][0] + a[1][1],
    b[0][0] + b[1][1],
    a[0][1] - a[1][1],
    b[1][0] + a[0][1],
    a[0][0] + a[0][1],
    a[0][0] + a[0][1]
