# Write a python program to Enter vector b and find the projection of b orthogonal to a given vector u.import numpy as np

import numpy as np


def orthogonal_projection(b, u):
    # Ensure the vectors have the same dimension
    if len(b) != len(u):
        raise ValueError("Vectors must have the same dimension.")

    # Calculate the projection
    dot_product = np.dot(b, u)
    u_magnitude_squared = np.dot(u, u)

    projection = (dot_product / u_magnitude_squared) * u

    return projection


# Get input from the user
try:
    # Input vector b
    b_input = input("Enter vector b as a space-separated list of values: ")
    b = np.array([float(x) for x in b_input.split()])

    # Input vector u
    u_input = input("Enter vector u as a space-separated list of values: ")
    u = np.array([float(x) for x in u_input.split()])

    # Calculate and print the orthogonal projection
    projection_result = orthogonal_projection(b, u)
    print("Orthogonal Projection of b onto u:", projection_result)

except ValueError as e:
    print(f"Error: {e}. Please enter valid numerical values.")
