package com.pluralsight;

import java.util.Scanner;

public class OrderScreen {
    private Scanner scanner;

    public OrderScreen() {
        scanner = new Scanner(System.in);
    }

    public void startOrder() {
        boolean orderCompleted = false;

        while (!orderCompleted) {
            displayOptions();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    AddSandwich addSandwich = new AddSandwich(scanner);
                    addSandwich.configureSandwich();
                    break;
                case 2:
                    AddDrink addDrink = new AddDrink(scanner);
                    addDrink.selectDrink();
                    break;
                case 3:
                    addChips();
                    break;
                case 4:
                    checkout();
                    break;
                case 0:
                    System.out.println("Cancelling order and returning to home screen.");
                    orderCompleted = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void displayOptions() {
        System.out.println("Order Screen");
        System.out.println("1) Add Sandwich");
        System.out.println("2) Add Drink");
        System.out.println("3) Add Chips");
        System.out.println("4) Checkout");
        System.out.println("0) Cancel Order");
        System.out.print("Enter your choice: ");
    }

    private void addChips() {
        // Implement adding chips
        System.out.println("Adding chips...");
    }

    private void checkout() {
        // Implement checkout process
        System.out.println("Proceeding to checkout...");
    }
}
