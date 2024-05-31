package com.pluralsight;
import java.util.Scanner;

public class OrderScreen {
    private final Scanner scanner;

    public OrderScreen(Scanner scanner) {
        this.scanner = scanner;
    }

    public void display() {
        int choice;
        do {
            printMenu();
            choice = getChoice();
            switch (choice) {
                case 1:
                    addSandwich();
                    break;
                case 2:
                    addDrink();
                    break;
                case 3:
                    addChips();
                    break;
                case 4:
                    checkout();
                    break;
                case 0:
                    cancelOrder();
                    return; // Exit from this screen
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (true);
    }

    private void printMenu() {
        System.out.println("\nOrder Screen:");
        System.out.println("1) Add Sandwich");
        System.out.println("2) Add Drink");
        System.out.println("3) Add Chips");
        System.out.println("4) Checkout");
        System.out.println("0) Cancel Order");
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

    private void addSandwich() {
        System.out.println("Adding a sandwich...");
    }

    private void addDrink() {
        System.out.println("Adding a drink...");
    }

    private void addChips() {
        System.out.println("Adding chips...");
    }

    private void checkout() {
        System.out.println("Proceeding to checkout...");
    }

    private void cancelOrder() {
        System.out.println("Canceling the order...");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderScreen orderScreen = new OrderScreen(scanner);
        orderScreen.display();
    }
}
