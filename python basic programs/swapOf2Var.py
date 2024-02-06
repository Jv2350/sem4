a = int(input("Enter value for a: "))
b = int(input("Enter value for b: "))

temp = a
a = b 
b = temp

print(f"New value of a is {a}")
print(f"New value of b is {b}")