def multiply_matrices(matrix1, matrix2):
    result = [[0, 0], [0, 0]] 

    print("Matrix A:")
    for row in matrix1:
        print(row)
    print("\nMatrix B:")
    for row in matrix2:
        print(row)
    print("\nSteps:")

    for i in range(len(matrix1)):
        for j in range(len(matrix2[0])):
            calculation = []
            for k in range(len(matrix2)):
                step = f"{matrix1[i][k]} * {matrix2[k][j]}"
                calculation.append(step)
                result[i][j] += matrix1[i][k] * matrix2[k][j]
            calc_str = " + ".join(calculation)
            print(f"Step {i+1}.{j+1}: {calc_str} = {result[i][j]}")

    return result

# Input matrices from the user
print("Enter values for Matrix A (2x2):")
matrix_A = [[int(input(f"Enter element {i+1}.{j+1}: ")) for j in range(2)] for i in range(2)]

print("\nEnter values for Matrix B (2x2):")
matrix_B = [[int(input(f"Enter element {i+1}.{j+1}: ")) for j in range(2)] for i in range(2)]

resultant_matrix = multiply_matrices(matrix_A, matrix_B)

print("\nFinal Result:")
for row in resultant_matrix:
    print(row)
