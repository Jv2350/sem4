import numpy as np


def main():
    u = np.array([1, 2, 3])
    v = np.array([4, 5, 6])

    a = float(input("Enter coefficient a: "))
    b = float(input("Enter coefficient b: "))

    new_face = a * u + b * v
    print("New face as a linear combination of u and v:", new_face)

    average_face = (u + v) / 2
    print("Average face of the original faces:", average_face)


if __name__ == "__main__":
    main()
