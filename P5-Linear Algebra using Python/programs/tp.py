import numpy as np
import matplotlib.pyplot as plt


def rotate_complex(z, angle_degrees):
    angle_radians = np.deg2rad(angle_degrees)
    rotation_factor = np.exp(1j * angle_radians)
    return z * rotation_factor


z = 2 + 3j
degree = int(input("Enter angle to rotate: "))
# Rotate each complex number by 180 degrees
rotated_s = rotate_complex(z, degree)
# Extract real and imaginary parts for plotting
x_s = z.real
y_s = z.imag

x_rotated = rotated_s.real
y_rotated = rotated_s.imag

# Plotting
plt.scatter(x_s, y_s, label="Original", s=25, color="b", marker="o")
plt.scatter(
    x_rotated,
    y_rotated,
    label=f"Rotated by {degree} degrees",
    s=25,
    color="r",
    marker="x",
)
plt.axhline(0, color="black", linewidth=0.5)
plt.axvline(0, color="black", linewidth=0.5)
plt.grid(color="gray", linestyle="--", linewidth=0.5)

# Set plot limits
plt.xlim(-4, 4)
plt.ylim(-4, 4)

# Add labels and legend
plt.xlabel("Real")
plt.ylabel("Imaginary")
plt.title("Rotation of Complex Number")
plt.legend()
plt.show()
