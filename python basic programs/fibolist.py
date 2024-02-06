a,b = 0, 1
terms = int(input("How many terms?: "))

for i in range(terms):
    print(a,end=", ")
    a, b = b, a+b