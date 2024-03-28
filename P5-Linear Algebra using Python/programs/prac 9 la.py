# def printmatrix(A):
#     for row in A:
#         print(row)


# def transpose(A):
#     T = [[A[i][j] for i in range(len(A))] for j in range(len(A))]
#     return T


# # Enter the number of rows and columns of matrix M
# n = int(input("Enter the size of square matrix M: "))
# M = []
# for i in range(n):
#     print("Enter elements of row", i + 1)
#     row = []
#     for j in range(n):
#         element = int(input("Enter number: "))
#         row.append(element)
#     M.append(row)

# print("The entered matrix M is:")
# printmatrix(M)


# def determinant_2x2(matrix):
#     return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]


# def determinant_3x3(matrix):
#     det = 0
#     for i in range(3):
#         det += matrix[0][i] * (
#             matrix[1][(i + 1) % 3] * matrix[2][(i + 2) % 3]
#             - matrix[1][(i + 2) % 3] * matrix[2][(i + 1) % 3]
#         )
#     return det


# if n == 2:
#     determinant = determinant_2x2(M)
# else:
#     determinant = determinant_3x3(M)

# print("Determinant =", determinant)

# if determinant == 0:
#     print("Matrix is not invertible")
# else:
#     print("Matrix is invertible")

#     # Calculate cofactor matrix
#     CFM = []
#     for i in range(n):
#         CFM.append([])
#         for j in range(n):
#             minor = []
#             for x in range(n):
#                 if x != i:
#                     minor_row = []
#                     for y in range(n):
#                         if y != j:
#                             minor_row.append(M[x][y])
#                     minor.append(minor_row)
#             if (i + j) % 2 == 0:
#                 CFM[i].append(determinant_2x2(minor))
#             else:
#                 CFM[i].append(-determinant_2x2(minor))

#     print("Cofactor matrix:")
#     printmatrix(CFM)

#     # Calculate inverse
#     AdjM = transpose(CFM)
#     MI = []
#     for i in range(n):
#         MI.append([])
#         for j in range(n):
#             MI[i].append(AdjM[i][j] / determinant)

#     print("Inverse of matrix M is:")
#     printmatrix(MI)

# ----------------------------------------------------------------

import numpy as np

# Input matrix from the user
n = int(input("Enter the size of the square matrix: "))
print("Enter the elements of the matrix, row by row:")
matrix = []
for i in range(n):
    row = list(map(int, input().split()))
    matrix.append(row)

print("Entered matrix:")
print(np.array(matrix))

# Check if the matrix is invertible
try:
    inv_matrix = np.linalg.inv(matrix)
    print("Matrix is invertible.")
    print("Inverse of the matrix:")
    print(inv_matrix)
except np.linalg.LinAlgError:
    print("Matrix is not invertible.")
