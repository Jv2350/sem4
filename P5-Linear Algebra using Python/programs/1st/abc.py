import matplotlib.pyplot as plt
S={3+3j,4+3j,2+1j,2.5+1j,3+1j,3.25+1j}
print('Select operation')
print('1: Addition of two 2 complex number ')
print('2: Plot points from set of complex number')
print('3:Translation')
print('4:Scaling')
print('5:Rotation')
print('6:Exit')
while True:
    ch=int(input('Enter choice for operation'))
    if ch==1:
        c1=complex(input('Enter complex no c1'))
        c2=complex(input('Enter complex no c2'))
        print('Addition of two 2 complex number (c1+c2)is',c1+c2)
    elif ch==2: #plotting
        S1={x for x in S}
    elif ch==3: #Translation
        c1=complex(input('Enter Translation in complex no format'))
        S1={x+c1 for x in S}
    elif ch==4: #Scaling
        scale=float(input('Enter scale pointlike(0.5) for 1/2'))
        S1={x*scale for x in S}
    elif ch==5:
        angle=int(input('Enter angle of rotation 90/180/270'))
        if angle==90:
            S1={x*1j for x in S}
        elif angle==180:
            S1={x*-1 for x in S}
        elif angle==270:
            S1={x*1j-1 for x in S}
        else:
            print('Invalid angle Enter only 90/180/270 degree')
    else:
        break

X=[x.real for x in S1]
Y=[x.imag for x in S1]
plt.plot(X,Y,'ro')
plt.axis([-6,6,-6,6])
plt.show()