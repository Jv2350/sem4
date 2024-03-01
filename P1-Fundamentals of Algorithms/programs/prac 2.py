# Aim - write python program to insert and delete element from an array.


# Initialize an array
my_array = [1, 2, 3, 4, 5]

# Insert an element at a specific index(e.g.index 2)
insert_index = 2
insert_value = 10
my_array.insert(insert_index, insert_value)

# Print the array after insertion
print("Array after insertion:", my_array)

# Delete an element at a specific index(e.g.index 3)
delete_index = 3
del my_array[delete_index]

# Print the array after deletion
print("Array after deletion:", my_array)
