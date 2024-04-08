M = [
    [12, 7, 23, 123],
    [23, 1, 23, 12],
    [2, 34, 2, 3]
]

# Display M in matrix format
print("Matrix M")
for row in M:
    print(row)

# Display the columns of the matrix M
columns = [[0 for _ in range(len(M))] for _ in range(len(M[0]))]
print("\nColumns of matrix M")
for i in range(len(M[0])):
    print("Column no. ", i + 1)
    for j in range(len(M)):
        columns[i][j] = M[j][i]
    print(columns[i])

# Display the rows of the matrix M
rows = [[0 for _ in range(len(M[0]))] for _ in range(len(M))]
print("\nRows of matrix M")
for i in range(len(M)):
    print("Row no. ", i + 1)
    for j in range(len(M[0])):
        rows[i][j] = M[i][j]
    print(rows[i])
