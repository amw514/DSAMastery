package ApnaCollege.Loops;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 37; // Change 'n' to the desired range
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
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}