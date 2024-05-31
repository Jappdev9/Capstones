package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Toppings {
    private final Scanner scanner;

    public Toppings(Scanner scanner) {
        this.scanner = scanner;
    }

    public void display() {
        System.out.println("Add Toppings:");
        System.out.println("Select your toppings:");
        System.out.println("1) Lettuce");
        System.out.println("2) Tomato");
        System.out.println("3) Onion");
        System.out.println("4) Pickles");
        System.out.println("5) Cucumber");
        System.out.println("6) Bell Pepper");
        System.out.println("7) Spinach");
        System.out.println("8) Olives");
        System.out.println("9) Avocado");
        System.out.println("10) Bacon");
        System.out.println("11) Turkey");
        System.out.println("12) Ham");
        System.out.println("13) Swiss Cheese");
        System.out.println("14) Cheddar Cheese");
        System.out.println("15) Pepper Jack Cheese");
        System.out.println("16) Extra Meat (premium)");
        System.out.println("17) Extra Cheese (premium)");
        System.out.println("0) Done");

        List<String> selectedToppings = new ArrayList<>();
        while (true) {
            System.out.print("Enter topping number (0 to finish): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break; // Exit loop if 0 is entered
            }

            String topping = getToppingName(choice);
            if (topping != null) {
                selectedToppings.add(topping);
                System.out.println(topping + " added.");
            } else {
                System.out.println("Invalid topping number. Please try again.");
            }
        }

        // Display selected toppings
        System.out.println("Selected toppings:");
        for (String topping : selectedToppings) {
            System.out.println("- " + topping);
        }
    }

    private String getToppingName(int choice) {
        return switch (choice) {
            case 1 -> "Lettuce";
            case 2 -> "Tomato";
            case 3 -> "Onion";
            case 4 -> "Pickles";
            case 5 -> "Cucumber";
            case 6 -> "Bell Pepper";
            case 7 -> "Spinach";
            case 8 -> "Olives";
            case 9 -> "Avocado";
            case 10 -> "Bacon";
            case 11 -> "Turkey";
            case 12 -> "Ham";
            case 13 -> "Swiss Cheese";
            case 14 -> "Cheddar Cheese";
            case 15 -> "Pepper Jack Cheese";
            case 16 -> "Extra Meat (premium)";
            case 17 -> "Extra Cheese (premium)";
            default -> null;
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Toppings toppings = new Toppings(scanner);
        toppings.display();
        scanner.close();
    }
}

