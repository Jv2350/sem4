n1 = int(input("Enter 1st number: "))
n2 = int(input("Enter 2nd number: "))
n3 = int(input("Enter 3rd number: "))

if n1 > n2 and n1 > n3:
    largest = n1
elif n2 > n1 and n2 > n3:
    largest = n2
else:
    largest = n3

print(f"{largest} is the largest number among {n1}, {n2} and {n3}")