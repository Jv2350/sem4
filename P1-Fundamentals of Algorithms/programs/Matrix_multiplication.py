def matrix():
    matrix = [[int(input(f"Enter value for [{i}][{j}] index: "))for j in range(2)]for i in range(2)]
    matOutput(matrix)
    return  matrix

def matOutput(mat):
    for i in mat:
        print(i)


def multiplication(x,y):
    result = [[0,0],[0,0]]
    for i in range(len(x)):
        for j in range(len(y[0])):
            for k in range(len(y)):
                result[i][j] += x[i][k] * y[k][j]
    matOutput(result)

print("Matrix multiplication (2x2)")
print("For 1st matrix:")
a = matrix()
print("\nFor 2nd matrix:")
b = matrix()

print("\nResultant Matrix: ")
result = multiplication(a,b)


    