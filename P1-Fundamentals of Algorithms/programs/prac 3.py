X = [[12, 7, 3], [4, 5, 6], [7, 8, 9]]
Y = [[5, 8, 1], [6, 7, 3], [4, 5, 9]]
result = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
# result = [[0 for _ in range(len(X[0]))] for _ in range(len(Y))] # here the result matrix form according to x and y matrix

# program to add two matrices using nested loop
for i in range(len(X)):
    for j in range(len(X[0])):
        result[i][j] = X[i][j] + Y[i][j]
for r in result:
    print(r)


# or otherwise we can use numpy if nesting is not specified like

import numpy as np

X = np.array(X)
Y = np.array(Y)
# print(np.add(X, Y))

# ----------------------------------------------------------------
# Aim- write python program to perform matrix multiplication.

import numpy as np

X = np.array(X)
Y = np.array(Y)
# print(np.dot(X, Y))

# if nesting asked
for i in range(len(X)):
    for j in range(len(Y[0])):
        for k in range(len(Y)):
            result[i][j] += X[i][k] * Y[k][j]

# print(result)
for r in result:  # but if we want to display the matrix in matrix format
    print(r)
