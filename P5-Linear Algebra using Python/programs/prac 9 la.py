def row_echelon_form(matrix):
    rows, cols = len(matrix), len(matrix[0])

    for i in range(rows):
        # Find the leading entry in the current row
        leading_entry = None
        for j in range(cols):
            if matrix[i][j] != 0:  # Corrected syntax: 0 should not be capitalized
                leading_entry = matrix[i][j]
                break
        if leading_entry is not None:
            for j in range(cols):
                matrix[i][j] /= leading_entry
        # Eliminate entries below the leading entry in the current column
        for k in range(i + 1, rows):
            factor = matrix[k][i]  # Corrected typo: 'matrix' instead of 'martrix'
            for j in range(cols):
                matrix[k][j] -= factor * matrix[i][j]
    return matrix


# Example Matrix
matrix = [[2, 1, 1, 8], [-3, -1, 2, -11], [-2, 1, 2, -2]]

# Applying the function to the matrix
result = row_echelon_form(matrix)
print(result)
