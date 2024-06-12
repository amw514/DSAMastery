package ApnaCollege.Loops;

import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to get reverse: ");
        int number = scanner.nextInt(); // Input number
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Append digit to reversed
            number /= 10; // Remove the last digit from the original number
        }

        System.out.println("Reversed Number: " + reversed); // Output: 4321
    }
}
