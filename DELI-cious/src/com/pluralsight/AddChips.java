package com.pluralsight;

import java.util.Scanner;

public class AddChips {
    private final Scanner scanner;

    public AddChips(Scanner scanner) {
        this.scanner = scanner;
    }

    public void selectChips() {
        System.out.println("Select Chips Screen");
        System.out.println("Available chip types: Regular, BBQ, Salt & Vinegar");

        // Prompt user to select chip type
        System.out.print("Enter the chip type: ");
        String chipType = scanner.nextLine();

        // Validate chip type
        if (isValidChipType(chipType)) {
            System.out.println("Chips added: " + chipType);
        } else {
            System.out.println("Invalid chip type. Please select from the available chip types.");
            selectChips(); // Prompt user to select again
            return; // Return to avoid navigating to checkout prematurely
        }

        // After selecting chips, prompt user to proceed to checkout
        proceedToCheckout();
    }

    // Method to validate chip type
    private boolean isValidChipType(String chipType) {
        return chipType.equalsIgnoreCase("Regular") ||
                chipType.equalsIgnoreCase("BBQ") ||
                chipType.equalsIgnoreCase("Salt & Vinegar");
    }

    // Method to prompt user to proceed to checkout
    private void proceedToCheckout() {
        System.out.println("Do you want to proceed to checkout? (yes/no)");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            navigateToCheckout(); // Navigate to CheckoutScreen class
        } else if (choice.equalsIgnoreCase("no")) {
            System.out.println("Returning to order screen."); // If user decides not to proceed to checkout
        } else {
            System.out.println("Invalid choice."); // If user enters an invalid choice
            proceedToCheckout(); // Prompt user again
        }
    }

    // Method to navigate to CheckoutScreen class
    private void navigateToCheckout() {
        System.out.println("Proceeding to checkout...");
        // Implement logic to proceed to checkout
    }
}
