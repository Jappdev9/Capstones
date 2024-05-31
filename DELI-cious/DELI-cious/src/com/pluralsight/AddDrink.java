package com.pluralsight;
import java.util.Scanner;

public class AddDrink {
    private final Scanner scanner;

    public AddDrink(Scanner scanner) {
        this.scanner = scanner;
    }

    public void display() {
        System.out.println("Add Drink Screen:");
        System.out.println("1) Select drink size");
        System.out.println("2) Select drink flavor");
        System.out.println("0) Go back to Order Screen");

        int choice;
        do {
            choice = getChoice();
            switch (choice) {
                case 1:
                    selectSize();
                    break;
                case 2:
                    selectFlavor();
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

    private void selectSize() {
        System.out.println("Select drink size:");
        System.out.println("1) Small");
        System.out.println("2) Medium");
        System.out.println("3) Large");
        // Example: Display available sizes and take user input
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You selected: Small");
                break;
            case 2:
                System.out.println("You selected: Medium");
                break;
            case 3:
                System.out.println("You selected: Large");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private void selectFlavor() {
        System.out.println("Select drink flavor:");
        System.out.println("1) Coke");
        System.out.println("2) Pepsi");
        System.out.println("3) Sprite");
        // Example: Display available flavors and take user input
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You selected: Coke");
                break;
            case 2:
                System.out.println("You selected: Pepsi");
                break;
            case 3:
                System.out.println("You selected: Sprite");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddDrink addDrink = new AddDrink(scanner);
        addDrink.display();
        scanner.close();
    }
}

