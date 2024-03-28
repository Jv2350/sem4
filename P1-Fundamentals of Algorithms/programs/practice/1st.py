import numpy as np


def array_operations(arr):
    sum_of_array = sum(arr)
    min_element = min(arr)
    max_element = max(arr)
    even_count = sum(arr % 2 == 0)
    odd_count = len(arr) - even_count
    return sum_of_array, min_element, max_element, even_count, odd_count


# Example usage:
array = np.array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])

sum_of_array, min_element, max_element, even_count, odd_count = array_operations(array)

print("Sum of array elements:", sum_of_array)
print("Minimum element:", min_element)
print("Maximum element:", max_element)
print("Number of even numbers:", even_count)
print("Number of odd numbers:", odd_count)
