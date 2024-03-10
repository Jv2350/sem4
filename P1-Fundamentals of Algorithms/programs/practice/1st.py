def sum_of_array(arr):
    return sum(arr)


def search_element(arr, target):
    return target in arr


def find_min_max(arr):
    if not arr:
        return None, None
    min_val = max_val = arr[0]
    for num in arr:
        if num < min_val:
            min_val = num
        elif num > max_val:
            max_val = num
    return min_val, max_val


def count_even_odd(arr):
    even_count = sum(1 for num in arr if num % 2 == 0)
    odd_count = len(arr) - even_count
    return even_count, odd_count


# Example usage:
array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
target = 5

print("Sum of array elements:", sum_of_array(array))
print("Is {} in the array?".format(target), search_element(array, target))

min_num, max_num = find_min_max(array)
print("Minimum element:", min_num)
print("Maximum element:", max_num)

even_count, odd_count = count_even_odd(array)
print("Number of even numbers:", even_count)
print("Number of odd numbers:", odd_count)
