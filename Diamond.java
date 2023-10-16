import java.util.InputMismatchException;
import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

        int size = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter an integer: ");
                size = scanner.nextInt();

                if (size % 2 == 0) {
                    System.out.println("Please enter an odd number for a better diamond shape.");
                } else {
                    validInput = true;
                }
                // returns error if user fails to input an integer
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
            }
        }

        // Upper part of the diamond
        for (int i = 1; i <= size; i += 2) {
            for (int j = 0; j < (size - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = size - 2; i >= 1; i -= 2) {
            for (int j = 0; j < (size - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
