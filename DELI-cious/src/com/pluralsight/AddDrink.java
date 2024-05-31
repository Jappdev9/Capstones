package com.pluralsight;

import java.util.Scanner;

public class AddDrink {
    private final Scanner scanner;

    public AddDrink(Scanner scanner) {
        this.scanner = scanner;
    }

    public void selectDrink() {
        System.out.println("Select Drink Screen");
        // Implement logic to select a drink

        // Example logic to navigate to AddChips class
        System.out.println("Do you want to add chips? (yes/no)");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            navigateToAddChips(); // Navigate to AddChips class
        } else if (choice.equalsIgnoreCase("no")) {
            System.out.println("No chips added."); // If user doesn't want to add chips
        } else {
            System.out.println("Invalid choice."); // If user enters an invalid choice
        }
    }

    // Method to navigate to AddChips class
    private void navigateToAddChips() {
        AddChips addChips = new AddChips(scanner);
        addChips.selectChips();
    }
}
