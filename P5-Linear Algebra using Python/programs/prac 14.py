# Write a python program to find the projection of b orthogonal to a set of given vectors.

import numpy as np


def gram_schmidt(vectors):
    ortho_basis = [vectors[0]]
    for i in range(1, len(vectors)):
        projection = sum(np.dot(vectors[i], u) / np.dot(u, u) * u for u in ortho_basis)
        orthogonalized = vectors[i] - projection
        ortho_basis.append(orthogonalized)
    return ortho_basis


def orthogonal_projection(b, U):
    # Ensure the vectors have the same dimension
    for u in U:
        if len(b) != len(u):
            raise ValueError("All vectors must have the same dimension.")
    # Perform Gram-Schmidt process on U
    ortho_basis = gram_schmidt(U)
    # Calculate the projection
    projection = sum(np.dot(b, u) / np.dot(u, u) * u for u in ortho_basis)
    return projection


try:
    # Input vector b
    b_input = input("Enter vector b as a space-separated list of values:")
    b = np.array([float(x) for x in b_input.split()])

    # Input vectors U
    U = []
    num_vectors = int(input("Enter the number of vectors in set U:"))
    for i in range(num_vectors):
        vector_input = input(
            f"Enter vector {i + 1} as a space-separated list of values: "
        )
        U.append(np.array([float(x) for x in vector_input.split()]))

    # Calculate and print the orthogonal projection
    projection_result = orthogonal_projection(b, U)
    print("Orthogonal Projection of b onto U:", projection_result)
except ValueError as e:
    print(f"Error: {e}. Please enter valid numerical values.")
