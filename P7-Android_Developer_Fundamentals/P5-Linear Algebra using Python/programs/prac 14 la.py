import numpy as np


def oprojection(of_vec, on_vec):
    v1 = np.array(of_vec)
    v2 = np.array(on_vec)

    scal = np.dot(v2, v1) / np.dot(v2, v2)
    vec = scal * v2

    return round(scal, 10), np.around(vec, decimals=10)


v1 = [-2, -3, -2]
v2 = [2, -4, -1]
x = [-4, -2, 1]


def make_unit_vec(u):
    bottom = np.linalg.norm(u)
    return u / bottom


b1 = make_unit_vec([-2, -3, -2])
print(b1)
print(oprojection(v2, b1))

v2_perp = v2 - oprojection(v2, b1)[1]
b2 = make_unit_vec(v2_perp)
print(b2)

print("Check whether b1 and b2 are orthonormal or not")
print(np.linalg.norm(b2))
print(np.dot(b1, b2))

p1 = np.outer(b1, b1)
print(p1)

p2 = np.outer(b2, b2)
print(p2)

p = p1 + p2
t = np.dot(p, x)
print(t)
