num = int(input("Enter the number: "))

sum = 0
temp = num
for i in range(num):
    d = temp % 10
    sum += d ** 3
    temp //= 10

if num == sum:
    print(f"{num} is armstrong number.")
else:
    print(f"{num} is not armstrong number.")