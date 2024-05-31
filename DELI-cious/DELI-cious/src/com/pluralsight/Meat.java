package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Meats {
    private final Scanner scanner;

    public Meats(Scanner scanner) {
        this.scanner = scanner;
    }

    public void display() {
        System.out.println("Add Meats:");
        System.out.println("Select your meats:");
        System.out.println("1) Turkey");
        System.out.println("2) Ham");
        System.out.println("3) Chicken");
        System.out.println("4) Beef");
        System.out.println("5) Bacon");
        System.out.println("0) Done");

        List<String> selectedMeats = new ArrayList<>();
        while (true) {
            System.out.print("Enter meat number (0 to finish): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break; // Exit loop if 0 is entered
            }

            String meat = getMeatName(choice);
            if (meat != null) {
                selectedMeats.add(meat);
                System.out.println(meat + " added.");
            } else {
                System.out.println("Invalid meat number. Please try again.");
            }
        }

        // Display selected meats
        System.out.println("Selected meats:");
        for (String meat : selectedMeats) {
            System.out.println("- " + meat);
        }
    }

    private String getMeatName(int choice) {
        return switch (choice) {
            case 1 -> "Turkey";
            case 2 -> "Ham";
            case 3 -> "Chicken";
            case 4 -> "Beef";
            case 5 -> "Bacon";
            default -> null;
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Meats meats = new Meats(scanner);
        meats.display();
        scanner.close();
    }
}
