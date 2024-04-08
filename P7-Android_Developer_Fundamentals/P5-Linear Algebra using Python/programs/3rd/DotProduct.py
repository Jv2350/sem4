def vector(length,name):
    vec = []
    for i in range(length):
        vec.append(int(input(f"Enter {i+1}{suffix(i+1)} value of vector {name}: ")))
    return vec

def suffix(i):
    if i in (11,12,13):
        suf = "th"
    else:
        suf = {1:"st",2:"nd",3:"rd"}.get(i%10,"th")
    return suf

def dotProduct():
    len = int(input("Enter the length of vector: "))
    a = vector(len,"a")
    print()
    b = vector(len,"b")
    
    result = 0
    for i in range(len):
        result += a[i]*b[i]
        
    return a,b,result

resultant = dotProduct()
q,r,s = resultant
print(f"Dot product of {q} and {r} is {s}")

