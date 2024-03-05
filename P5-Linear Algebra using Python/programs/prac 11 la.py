def find_numbers_for_sum_of_squares(N):
    # Ensure N is a positive number
    if N <= 0:
        print("Please enter a positive number.")
        return

    # Initialize variables
    a = 0
    b = int(N**0.5)  # Start with b as the square root of N

    # Iterate to find a and b
    while a <= b:
        current_sum = a**2 + b**2
        if current_sum == N:
            print(f"Numbers found: a = {a}, b = {b}")
            return
        elif current_sum < N:
            a += 1
        else:
            b -= 1

    print("No such numbers found.")


try:
    N = int(input("Enter a positive number N: "))
    find_numbers_for_sum_of_squares(N)
except ValueError:
    print("Invalid input. Please enter a valid positive number.")
