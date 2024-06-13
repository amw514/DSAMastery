package ApnaCollege.Loops;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check if it is prime: ");
        // boolean isPrime = true;

        // if (number <= 1) {
        // isPrime = false;
        // }

        // for (int i = 2; i * i <= number; i++) {
        // if (number % i == 0) {
        // isPrime = false;
        // break;
        // }
        // }

        // if (isPrime) {
        // System.out.println(number + " is a prime number.");
        // } else {
        // System.out.println(number + " is not a prime number.");
        // }

        int n = scanner.nextInt(); // Input number
        System.out.println("Prime numbers from 1 to " + n + ":");

        long startTime = System.currentTimeMillis();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        long endTime = System.currentTimeMillis(); // End the timer

        System.out.println("\nTime taken: " + (endTime - startTime) + " milliseconds"); // Print the time taken

    }

    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
