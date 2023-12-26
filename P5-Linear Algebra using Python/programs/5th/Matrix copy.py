import pandas as pd
n = int(input("Enter the number of rows in a matrix: "))
a = [[0] * n for i in range(n)]
col_names = []
row_names = []


for i in range(n):
    col_names.append('col ' + str(i+1))
    row_names.append('row ' + str(i+1))  
    for j in range(n):
          a[i][j] = int(input())

print(pd.DataFrame(a,columns = col_names, index = row_names))