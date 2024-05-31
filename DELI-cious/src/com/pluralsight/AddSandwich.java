package com.pluralsight;

import java.util.Scanner;

public class AddSandwich {
    private Scanner scanner;

    public AddSandwich(Scanner scanner) {
        this.scanner = scanner;
    }

    public void configureSandwich() {
        System.out.println("Add Sandwich Screen");
        // Implement logic to configure the sandwich

        // Ask user if they want to add a drink
        System.out.println("Do you want to add a drink? (yes/no)");
        String choice = scanner.nextLine();

        // Check user's choice
        if (choice.equalsIgnoreCase("yes")) {
            navigateToAddDrink(); // Navigate to AddDrink class
        } else if (choice.equalsIgnoreCase("no")) {
            System.out.println("No drink added."); // If user doesn't want to add a drink
        } else {
            System.out.println("Invalid choice."); // If user enters an invalid choice
        }
    }

    // Method to navigate to AddDrink class
    private void navigateToAddDrink() {
        AddDrink addDrink = new AddDrink(scanner);
        addDrink.selectDrink();
    }
}
