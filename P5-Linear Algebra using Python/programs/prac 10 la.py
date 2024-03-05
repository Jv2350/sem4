def row_echelon_form(matrix):
    rows, cols = len(matrix), len(matrix[0])

    # Iterate through each row
    for i in range(rows):
        # Find the leading entry in the current row
        leading_entry = None
        for j in range(cols):
            if matrix[i][j] != 0:
                leading_entry = matrix[i][j]
                break

        # If leading entry is found, normalize the current row
        if leading_entry is not None:
            for j in range(cols):
                matrix[i][j] /= leading_entry

        # Eliminate entries below the leading entry in the current column
        for k in range(i + 1, rows):
            factor = matrix[k][i]
            for j in range(cols):
                matrix[k][j] -= factor * matrix[i][j]

    return matrix


# Example Matrix
matrix = [[2, 1, -1, 81], [-3, -1, 2, -111]]

result = row_echelon_form(matrix)

# Print the resulting matrix in row echelon form
for row in result:
    print(row)
