import numpy as np
import matplotlib.pyplot as plt


def rotate_complex(z, angle_degrees):
    angle_radians = np.deg2rad(angle_degrees)
    rotation_factor = np.exp(1j * angle_radians)
    return z * rotation_factor


s = np.array([1 + 2j, 2 + 3j, 4 + 5j, 5 + 6j, 6 + 7j, 3 + 4j])

l = np.array([z * -1 for z in s])
print(l)
x = l.real
y = l.imag

plt.scatter(x, y, label="Complex number", s=25, color="b", marker="o")
plt.xlabel("Real number")
plt.ylabel("Imaginary number")
plt.plot(x, y)
plt.show()
