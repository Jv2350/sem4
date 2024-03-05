# Aim: Write Python program for finding the second largest element in an array A of size n using Tournament Method.Discuss Time complexity


list = [45, 2, 41, 31, 10, 8, 6, 4]

length = len(list)
list.sort()

print("Smallest element is:", list[0])
print("Second Largest element is:", list[length - 2])
print("Second Smallest element is:", list[1])


# ----------------------------------------------------------------


def tournament(arr):
    n = len(arr)
    if n < 2:
        print("Array size should be at least 2")
        return None

    # Function to recursively find the winner in a tournament
    def find_winner(left, right):
        if left == right:
            return left
        mid = (left + right) // 2
        left_winner = find_winner(left, mid)
        right_winner = find_winner(mid + 1, right)
        return left_winner if arr[left_winner] > arr[right_winner] else right_winner

    winner_index = find_winner(0, n - 1)

    # Find second largest element excluding the winner
    second_largest = float("-inf")
    for i in range(n):
        if i != winner_index and arr[i] > second_largest:
            second_largest = arr[i]

    return second_largest


# Example usage
arr = [12, 35, 1, 10, 34, 1]
second_largest = tournament(arr)
if second_largest is not None:
    print("Second largest element in the array is:", second_largest)
