M = [[12, 7, 23, 123], [23, 1, 23, 12], [2, 34, 2, 3]]

print("Scalar Multiplication")
scalar = 2
print("scalar = ", scalar)
multi = [[0 for j in range(4)] for i in range(3)]
for i in range(3):
    for j in range(4):
        multi[i][j] = scalar * M[i][j]
for i in multi:
    print(i)


# 5.Find the transpose of the matrix M.
result = [[0 for j in range(3)] for i in range(4)]
print(result)
for i in range(4):
    for j in range(3):
        result[i][j] = M[j][i]

print("Transpose of Matrix M")
for r in result:
    print(r)
