import numpy as np
import matplotlib.pyplot as plt


def rotate_complex(z, angle_degrees):
    angle_radians = np.deg2rad(angle_degrees)
    rotation_factor = np.exp(1j * angle_radians)
    return z * rotation_factor


# Define the complex numbers
s = np.array([1 + 2j, 2 + 3j, 4 + 5j, 5 + 6j, 6 + 7j, 3 + 4j])

# Rotate each complex number by 180 degrees
rotated_s = np.array([rotate_complex(z, 180) for z in s])

# Extract real and imaginary parts for plotting
x_s = s.real
y_s = s.imag

x_rotated = rotated_s.real
y_rotated = rotated_s.imag

# Plotting
plt.scatter(x_s, y_s, label="Original", s=25, color="b", marker="o")
plt.scatter(
    x_rotated, y_rotated, label="Rotated by 180 degrees", s=25, color="r", marker="x"
)
plt.xlabel("Real part")
plt.ylabel("Imaginary part")
plt.axhline(0, color="black", linewidth=0.5)
plt.axvline(0, color="black", linewidth=0.5)
plt.grid(color="gray", linestyle="--", linewidth=0.5)
plt.legend()
plt.show()
