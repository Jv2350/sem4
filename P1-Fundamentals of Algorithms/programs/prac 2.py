# Aim - write python program to insert and delete element from an array.


arr = [1, 2, 3, 4, 5]
print("Original array: ", arr)
insert_index = 2
insert_value = 10
arr.insert(insert_index, insert_value)  # inserting 10 and 2nd index using insert


print("Array after insertion of 10 at 2nd index:", arr)


delete_index = 3
# del arr[delete_index]
arr.pop(delete_index)  # both having same functionality


print("Array after deletion of 3rd index element:", arr)
