package ApnaCollege.Loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbersArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find prime numbers upto that number: ");

        int limit = scanner.nextInt();

        List<Integer> primeNumbers = new ArrayList<>();
        long startTime = System.currentTimeMillis();

        for (int numberToCheck = 0; numberToCheck <= limit; numberToCheck++) {
            boolean isPrime = true;

            if (numberToCheck <= 1) {
                isPrime = false;
            }
            if (numberToCheck <= 3) {
                isPrime = true;
            }
            if (numberToCheck % 2 == 0 || numberToCheck % 3 == 0) {
                isPrime = false;
            }
            for (int i = 5; i * i <= numberToCheck; i += 6) {
                if (numberToCheck % i == 0 || numberToCheck % (i + 2) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(numberToCheck);
            }
        }

        for (int number : primeNumbers) {
            System.out.println(number);

        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + "ms");

    }

}
