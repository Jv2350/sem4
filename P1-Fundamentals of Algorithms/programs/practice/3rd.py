def matrix_multiply(A, B):

    result = [
        [
            0,
            0,
            0,
        ],
        [
            0,
            0,
            0,
        ],
        [0, 0, 0],
    ]

    for i in range(len(A)):
        for j in range(len(B[0])):
            for k in range(len(B)):
                result[i][j] += A[i][k] * B[k][j]

    return result


# Example usage:
matrix1 = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

matrix2 = [[9, 8, 7], [6, 5, 4], [3, 2, 1]]

result = matrix_multiply(matrix1, matrix2)
if result:
    print("Result of matrix multiplication:")
    for row in result:
        print(row)


import numpy as np


def matrix_multiply_np(A, B):
    return np.dot(A, B)


# Example usage:
matrix1_np = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9]])

matrix2_np = np.array([[9, 8, 7], [6, 5, 4], [3, 2, 1]])

result_np = matrix_multiply_np(matrix1_np, matrix2_np)
print("Result of matrix multiplication (using NumPy):")
print(result_np)
