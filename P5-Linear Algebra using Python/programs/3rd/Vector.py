# 1. Enter a vector u as n-list
# 2. Enter another vector v as n-list
# 3. Find the vector au+bv for different values of a and b
# 4. Find the dot product of u and v

#creating the vectors
def vectors(length,name):
    vec = []
    for i in range(length):
        vec.append(int(input(f"Enter {i+1}{suffix(i+1)} value of {name}: ")))
    # as it does not create more logical approach
    # vec=[int(input(f"Enter {i+1}{suffix(i+1)} value of {name}: ")) for i in range(length)]
    return vec

# extra ;)
def suffix(i):
    if i in (11,12,13):
        suf = "th"
    else:
        suf = {1:"st",2:"nd",3:"rd"}.get(i%10,"th")
    return suf

def add():
    len = int(input("Enter the length of vectors: "))
    u = vectors(len,"u")
    print()
    v = vectors(len,"v")

    a = int(input("\nEnter the value of a: "))
    b = int(input("Enter the value of b: "))
    
    resultVec = []
    for i in range(len):
        resultVec.append(a*u[i] + b*v[i])
    return u,v,resultVec
    
print("Performing ((a*u) + (b*v))")
u,v,result = add()
print(f"\nResultant of {u} and {v} is {result}")