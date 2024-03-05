import numpy as np


def find_eigenvector(matrix, eigenvalue):
    # Calculate eigenvalues and eigenvectors
    eigenvalues, eigenvectors = np.linalg.eig(matrix)

    # Find the index of the given eigenvalue
    index = np.where(np.isclose(eigenvalues, eigenvalue))[0][0]

    # Extract the corresponding eigenvector
    eigenvector = eigenvectors[:, index]

    return eigenvector


# Get input from the user
try:
    # Input matrix
    rows = int(input("Enter the number of rows in the matrix: "))
    cols = int(input("Enter the number of columns in the matrix: "))

    matrix = []
    for i in range(rows):
        row_input = input(f"Enter row {i + 1} as a space-separated list of values: ")
        matrix.append([float(x) for x in row_input.split()])

    matrix = np.array(matrix)

    # Input eigenvalue
    eigenvalue = float(input("Enter the eigenvalue: "))

    # Calculate and print the corresponding eigenvector
    eigenvector_result = find_eigenvector(matrix, eigenvalue)
    print(
        "Eigenvector corresponding to eigenvalue", eigenvalue, "is:", eigenvector_result
    )

except ValueError as e:
    print(f"Error: {e}. Please enter valid numerical values.")
except np.linalg.LinAlgError:
    print(
        "Error: The matrix must be square (number of rows equals number of columns) and non-singular."
    )
