# def MatMultiplication(a, b):
#     result = [[0 for _ in range(len(b[0]))] for _ in range(len(a))]
#     return result


a = [[1,2,3,4],[1,2,3,4]]
b = [[1,2,3,4],[1,2,3,4]]
# print(MatMultiplication(a,b));

result = [[0 for _ in range(len(a[0]))] for _ in range(len(a))]
print(result)

for i in range(len(a)):
    for j in range(len(a[0])):
        for k in range(len(b)):
            result[i][j]+= a[i][k] * b[k][j]

print(result)