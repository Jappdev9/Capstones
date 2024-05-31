package com.pluralsight;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Meat {
    private final Scanner scanner;
    private final Map<String, Double> meatOptions;

    public Meat(Scanner scanner) {
        this.scanner = scanner;
        this.meatOptions = new HashMap<>();
        initializeMeatOptions();
    }

    private void initializeMeatOptions() {
        // Initialize meat options
        meatOptions.put("Turkey", 2.00);
        meatOptions.put("Ham", 2.50);
        meatOptions.put("Roast Beef", 3.00);
    }

    public void selectMeat() {
        System.out.println("Select Meat Screen");
        displayAvailableMeatOptions();
        String meatChoice = promptForMeatChoice();
        if (validateMeatChoice(meatChoice)) {
            System.out.println("Meat selected: " + meatChoice);
            navigateToCheese();
        } else {
            System.out.println("Invalid meat choice. Please select from the available options.");
            selectMeat(); // Prompt user to select again
        }
    }

    private void displayAvailableMeatOptions() {
        System.out.println("Available meats:");
        for (String meat : meatOptions.keySet()) {
            System.out.println(meat + ": $" + meatOptions.get(meat));
        }
    }

    private String promptForMeatChoice() {
        System.out.print("Enter your choice of meat: ");
        return scanner.nextLine();
    }

    private boolean validateMeatChoice(String meatChoice) {
        return meatOptions.containsKey(meatChoice);
    }

    private void navigateToCheese() {
        Cheese cheese = new Cheese(scanner);
        cheese.selectCheese();
    }

    // Placeholder for demonstration purposes
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Meat meat = new Meat(scanner);
        meat.selectMeat();
        scanner.close();
    }
}

class Cheese {

    private final Scanner scanner;

    public Cheese(Scanner scanner) {
        this.scanner = scanner;
    }

    public void selectCheese() {
        // Placeholder method for selecting cheese
        System.out.println("Selecting cheese...");
    }
}
