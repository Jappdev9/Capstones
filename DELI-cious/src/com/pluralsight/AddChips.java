package com.pluralsight;

import java.util.Scanner;

public class AddChips {
    private Scanner scanner;

    public AddChips(Scanner scanner) {
        this.scanner = scanner;
    }

    public void selectChips() {
        System.out.println("Select Chips Screen");
        // Implement logic to select chips

        // Example logic to navigate to CheckoutScreen class
        System.out.println("Do you want to proceed to checkout? (yes/no)");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            navigateToCheckout(); // Navigate to CheckoutScreen class
        } else if (choice.equalsIgnoreCase("no")) {
            System.out.println("Returning to order screen."); // If user decides not to proceed to checkout
        } else {
            System.out.println("Invalid choice."); // If user enters an invalid choice
        }
    }

    // Method to navigate to CheckoutScreen class
    private void navigateToCheckout() {
        System.out.println("Proceeding to checkout...");
        // Implement logic to proceed to checkout
    }
}
