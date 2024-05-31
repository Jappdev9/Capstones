package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sauce {
    private final Scanner scanner;

    public Sauce(Scanner scanner) {
        this.scanner = scanner;
    }

    public void display() {
        System.out.println("Add Sauces:");
        System.out.println("Select your sauces:");
        System.out.println("1) Mustard");
        System.out.println("2) Mayonnaise");
        System.out.println("3) Ketchup");
        System.out.println("4) BBQ Sauce");
        System.out.println("5) Ranch Dressing");
        System.out.println("6) Honey Mustard");
        System.out.println("7) Hot Sauce");
        System.out.println("8) Chipotle Sauce");
        System.out.println("0) Done");

        List<String> selectedSauces = new ArrayList<>();
        while (true) {
            System.out.print("Enter sauce number (0 to finish): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break; // Exit loop if 0 is entered
            }

            String sauce = getSauceName(choice);
            if (sauce != null) {
                selectedSauces.add(sauce);
                System.out.println(sauce + " added.");
            } else {
                System.out.println("Invalid sauce number. Please try again.");
            }
        }

        // Display selected sauces
        System.out.println("Selected sauces:");
        for (String sauce : selectedSauces) {
            System.out.println("- " + sauce);
        }
    }

    private String getSauceName(int choice) {
        return switch (choice) {
            case 1 -> "Mustard";
            case 2 -> "Mayonnaise";
            case 3 -> "Ketchup";
            case 4 -> "BBQ Sauce";
            case 5 -> "Ranch Dressing";
            case 6 -> "Honey Mustard";
            case 7 -> "Hot Sauce";
            case 8 -> "Chipotle Sauce";
            default -> null;
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sauce sauce = new Sauce(scanner);
        sauce.display();
        scanner.close();
    }
}
