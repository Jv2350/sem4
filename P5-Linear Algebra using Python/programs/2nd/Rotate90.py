import numpy as np
import matplotlib.pyplot as plt

s = np.array([1+2j,2+3j,4+5j,5+6j,6+7j,3+4j])

# main logic "z*1j for z in s"
# where s is the array of complex number 
# iterates through every element in s and multiply every element by 1j
# z store the singal value i.e. 1+2j so on for each iteration
# as it is in the "[ ]" creates an list of new complex nums and using array method convert that into in array form
l=np.array([z*1j for z in s]) 
print(l)

x = l.real
y = l.imag
plt.scatter(x,y,label="Comple number",color="b",s=25,marker="o")

plt.xlabel("Real number")
plt.ylabel("Imaginary number")
plt.plot(x,y)
plt.show()