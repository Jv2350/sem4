def add(u, v, a, b):
    return [a * u[i] + b * v[i] for i in range(len(u))]


u = [1, 2, 3, 4]
v = [4, 5, 6, 7]

a = 2
b = 4

c = add(u, v, a, b)
print(c)
