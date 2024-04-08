import java.util.Scanner;

class ja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        boolean isPrime = checkPrime(number);
        if (isPrime) {
            System.out.printf("%d is a prime number.", number);
        } else{
            System.out.println("Hello world");
        }

    static boolean checkPrime(int num) {
        if (num <= 1) {
     

            // Check divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, prime
    }
}
