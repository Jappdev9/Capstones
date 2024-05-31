package com.pluralsight;
import java.util.Scanner;

public class HomeScreen implements Screen {
    private static String[] args;

    public static void main(String[] args) {
        HomeScreen.args = args;
        Main.main(new String[0]);
    }
    private final Scanner scanner;

    public HomeScreen(Scanner scanner) {
        this.scanner = scanner;
    }

    public void display() {
        int choice;
        do {
            printMenu();
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                switch (choice) {
                    case 1:
                        System.out.println("Starting a new order...");
                        Order orderScreen = new Order(scanner);
                        orderScreen.display();
                        break;
                    case 0:
                        System.out.println("Exiting the application...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume invalid input
                choice = -1; // Set choice to an invalid value to continue the loop
            }
        } while (choice != 0);
        scanner.close(); // Close the scanner when done
    }

    private void printMenu() {
        System.out.println("Welcome to DELICIOUS!");
        System.out.println("Home Screen:");
        System.out.println("1) New Order");
        System.out.println("0) Exit");
    }
}