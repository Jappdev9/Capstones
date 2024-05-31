package com.pluralsight;
import java.util.Scanner;

public class AddChips {
    private final Scanner scanner;

    public AddChips(Scanner scanner) {
        this.scanner = scanner;
    }

    public void display() {
        System.out.println("Add Chips Screen:");
        System.out.println("1) Select chip type");
        System.out.println("0) Go back to Order Screen");

        int choice;
        do {
            choice = getChoice();
            switch (choice) {
                case 1:
                    selectChipType();
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

    private void selectChipType() {
        System.out.println("Select chip type:");
        System.out.println("1) Regular");
        System.out.println("2) Barbecue");
        System.out.println("3) Sour Cream and Onion");
        // Example: Display available chip types and take user input
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You selected: Regular chips");
                break;
            case 2:
                System.out.println("You selected: Barbecue chips");
                break;
            case 3:
                System.out.println("You selected: Sour Cream and Onion chips");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddChips addChips = new AddChips(scanner);
        addChips.display();
        scanner.close();
    }
}
