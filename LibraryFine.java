package Assignment7;

import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of days late
        System.out.print("Enter the number of days late: ");
        int daysLate = scanner.nextInt();

        // Calculate fine based on the number of days late
        double fine = 0;
        if (daysLate >= 1 && daysLate <= 7) {
            fine = daysLate * 0.5;
        } else if (daysLate >= 8 && daysLate <= 14) {
            fine = 7 * 0.5 + (daysLate - 7) * 1;
        } else if (daysLate > 14 && daysLate <= 21) {
            fine = 7 * 0.5 + 7 * 1 + (daysLate - 14) * 5;
        } else if (daysLate > 21) {
            System.out.println("Your membership has been canceled due to returning the book after 21 days.");
            System.exit(0); // Exit the program
        }

        // Display fine amount or message
        if (fine > 0) {
            System.out.println("The fine amount is: Rs. " + fine);
        } else {
            System.out.println("No fine is applicable.");
        }

        scanner.close();
    }
}
