def insert_element(arr, index, element):
    arr.insert(index, element)


def delete_element(arr, index):
    arr.pop(index)


# Example usage:
array = [1, 2, 3, 4, 5]

# Inserting an element
insert_element(array, 2, 10)
print("Array after insertion:", array)

# Deleting an element
delete_element(array, 4)
print("Array after deletion:", array)
