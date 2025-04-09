package FlightReservationSystem;

import java.util.Scanner;

public class Payment {
    private Scanner scanner;

    public Payment() {
        scanner = new Scanner(System.in);
    }
    public boolean processPayment(double amount) {
        System.out.println("Total amount to pay: ₹" + amount);
        System.out.print("Do you want to make the payment? (yes/no): ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Payment successful! Booking confirmed.");
            return true; 
        } else {
            System.out.println("Booking failed. Payment not completed.");
            return false; 
        }
    }
}

