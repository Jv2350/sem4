def euclidean_gcd(a, b):
    while b:
        a, b = b, a % b
    return a


# Get input from the user
try:
    num1 = int(input("Enter the first number: "))
    num2 = int(input("Enter the second number: "))
    # Ensure both numbers are positive
    if num1 < 0 or num2 < 0:
        print("Please enter positive numbers.")
    else:
        gcd_result = euclidean_gcd(num1, num2)
        print(f"The GCD of {num1} and {num2} is: {gcd_result}")
except ValueError:
    print("Invalid input. Please enter valid integers.")
