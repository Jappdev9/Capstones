package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cheese {
    private final Scanner scanner;

    public Cheese(Scanner scanner) {
        this.scanner = scanner;
    }

    public void display() {
        System.out.println("Add Cheese:");
        System.out.println("Select your cheese:");
        System.out.println("1) Swiss Cheese");
        System.out.println("2) Cheddar Cheese");
        System.out.println("3) Pepper Jack Cheese");
        System.out.println("4) Mozzarella Cheese");
        System.out.println("5) Provolone Cheese");
        System.out.println("6) American Cheese");
        System.out.println("0) Done");

        List<String> selectedCheeses = new ArrayList<>();
        while (true) {
            System.out.print("Enter cheese number (0 to finish): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break; // Exit loop if 0 is entered
            }

            String cheese = getCheeseName(choice);
            if (cheese != null) {
                selectedCheeses.add(cheese);
                System.out.println(cheese + " added.");
            } else {
                System.out.println("Invalid cheese number. Please try again.");
            }
        }

        // Display selected cheeses
        System.out.println("Selected cheeses:");
        for (String cheese : selectedCheeses) {
            System.out.println("- " + cheese);
        }
    }

    private String getCheeseName(int choice) {
        return switch (choice) {
            case 1 -> "Swiss Cheese";
            case 2 -> "Cheddar Cheese";
            case 3 -> "Pepper Jack Cheese";
            case 4 -> "Mozzarella Cheese";
            case 5 -> "Provolone Cheese";
            case 6 -> "American Cheese";
            default -> null;
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cheese cheese = new Cheese(scanner);
        cheese.display();
        scanner.close();
    }
}
