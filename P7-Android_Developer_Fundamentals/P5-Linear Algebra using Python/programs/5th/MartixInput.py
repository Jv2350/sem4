def martixInput():
    row = int(input("Enter number of rows: "))
    col = int(input("Enter number of columns: "))

    martix = []
    for i in range(row):
        row = []
        for j in range(col):
            row.append(int(input(f"Enter input for {i} row and {j} column: ")))
        martix.append(row)
    
    return martix

print(martixInput())