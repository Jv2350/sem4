import cmath
a = int(input("Enter the number: "))
b = int(input("Enter the number: "))
c = int(input("Enter the number: "))

d = cmath.sqrt((b**2)- (4*a*c))

sol1 = (-b + d) / (2*a)
sol2 = (-b - d) / (2*a)

print(sol1)
print(sol2)