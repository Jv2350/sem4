import numpy as np
import matplotlib.pyplot as plt

s = np.array([1+2j,2+3j,4+5j,5+6j,6+7j,3+4j])
x=s.real
y=s.imag

plt.scatter(x,y,label="Complex Number",color="b",s=25,marker="o")
plt.xlabel("Real number")
plt.ylabel("Imaginary number")

plt.plot(x,y)
plt.show()