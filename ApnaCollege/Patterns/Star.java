package ApnaCollege.Patterns;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int line = 0; line < rows; line++) {
            for (int column = 0; column < line; column++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
