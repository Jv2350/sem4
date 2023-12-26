def MatMultiplication(a, b):
    result = [[0 for _ in range(len(b[0]))] for _ in range(len(a))]
    return result


a = [[1,2,3,4],[1,2,3,4]]
b = [[1,2,3,4],[1,2,3,4]]
print(MatMultiplication(a,b));