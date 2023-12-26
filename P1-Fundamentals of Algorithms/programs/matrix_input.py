def MatrixOutput(matrix):
    for row in matrix:
        print(row)

def Matrix():
    row = int(input("How many rows do you want: "))
    col = int(input("How many columns do you want: "))
    matrix = [[int(input(f"Enter value for [{i}][{j}] index: ")) for j in range(col)] for i in range(row)]
    MatrixOutput(matrix)
    return matrix

def MatMultiplication(a, b):
    if len(a[0]) != len(b):
        print("Matrix multiplication not possible.")
        return None

    result = [[0 for _ in range(len(b[0]))] for _ in range(len(a))]

    for i in range(len(a)):
        for j in range(len(b[0])):
            for k in range(len(b)):
                result[i][j] += a[i][k] * b[k][j]

    return result

print("Matrix multiplication")
print("\nFor 1st matrix: ")
a = Matrix()
print("\nFor 2nd matrix: ")
b = Matrix()

result = MatMultiplication(a, b)
if result:
    print("\nResultant matrix:")
    MatrixOutput(result)
