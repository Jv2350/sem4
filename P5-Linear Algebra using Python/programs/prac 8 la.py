x = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
y = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
mul = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]

print("Mulitiplication of two matrix is: ")
for i in range(len(x)):
    for j in range(len(y[0])):
        for k in range(len(y)):
            mul[i][j] += x[i][k] * y[k][j]

for r in mul:
    print(r)
