package com.pluralsight;
import java.util.Scanner;

class AddSandwichScreen {
    private final Scanner scanner;

    public AddSandwichScreen(Scanner scanner) {
        this.scanner = scanner;
    }

    public void display() {
        System.out.println("Add Sandwich Screen:");
        System.out.println("1) Select your bread");
        System.out.println("2) Select sandwich size");
        System.out.println("3) Add toppings");
        System.out.println("4) Select sauces");
        System.out.println("5) Choose if the sandwich should be toasted");
        System.out.println("0) Go back to Order Screen");

        int choice;
        do {
            choice = getChoice();
            switch (choice) {
                case 1:
                    selectBread();
                    break;
                case 2:
                    selectSize();
                    break;
                case 3:
                    addToppings();
                    break;
                case 4:
                    selectSauces();
                    break;
                case 5:
                    selectToasted();
                    break;
                case 0:
                    return; // Go back to Order Screen
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (true);
    }

    private int getChoice() {
        System.out.print("Enter your choice: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            System.out.print("Enter your choice: ");
            scanner.next(); // Consume invalid input
        }
        return scanner.nextInt();
    }

    private void selectBread() {
        System.out.println("Select your bread:");
        System.out.println("1) White");
        System.out.println("2) Wheat");
        System.out.println("3) Rye");
        System.out.println("4) Wrap");
        // Example: Display available bread options and take user input
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You selected: White bread");
                break;
            case 2:
                System.out.println("You selected: Wheat bread");
                break;
            case 3:
                System.out.println("You selected: Rye bread");
                break;
            case 4:
                System.out.println("You selected: Wrap");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private void selectSize() {
        System.out.println("Select sandwich size:");
        System.out.println("1) 4\"");
        System.out.println("2) 8\"");
        System.out.println("3) 12\"");
        // Example: Display available sizes and take user input
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You selected: 4\"");
                break;
            case 2:
                System.out.println("You selected: 8\"");
                break;
            case 3:
                System.out.println("You selected: 12\"");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private void addToppings() {
        System.out.println("Adding toppings:");
        System.out.println("Enter toppings (comma-separated): ");
        // Example: Display available toppings and take user input
        String toppings = scanner.next();
        System.out.println("You added the following toppings: " + toppings);
    }

    private void selectSauces() {
        System.out.println("Select sauces:");
        System.out.println("1) Mustard");
        System.out.println("2) Mayonnaise");
        System.out.println("3) Ketchup");
        // Example: Display available sauces and take user input
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You selected: Mustard");
                break;
            case 2:
                System.out.println("You selected: Mayonnaise");
                break;
            case 3:
                System.out.println("You selected: Ketchup");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private void selectToasted() {
        System.out.println("Choose if the sandwich should be toasted:");
        System.out.println("1) Yes");
        System.out.println("2) No");
        // Example: Display option to toast or not and take user input
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You chose to toast the sandwich.");
                break;
            case 2:
                System.out.println("You chose not to toast the sandwich.");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddSandwichScreen addSandwichScreen = new AddSandwichScreen(scanner);
        addSandwichScreen.display();
        scanner.close();
    }
}
