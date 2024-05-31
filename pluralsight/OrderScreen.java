package com.pluralsight;
import java.util.Scanner;

class OrderScreen {
    private Order order;
    private Scanner scanner;

    public OrderScreen(Order order, Scanner scanner) {
        this.order = order;
        this.scanner = scanner;
    }

    public void display() {
        boolean ordering = true;

        while (ordering) {
            System.out.println("Order Screen:");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

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
                    ordering = false;
                    break;
                case 0:
                    cancelOrder();
                    ordering = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addSandwich() {
        // Implement logic to add a sandwich to the order
        System.out.println("Adding sandwich to the order...");
    }

    private void addDrink() {
        // Implement logic to add a drink to the order
        System.out.println("Adding drink to the order...");
    }

    private void addChips() {
        // Implement logic to add chips to the order
        System.out.println("Adding chips to the order...");
    }

    private void checkout() {
        // Implement logic to proceed to checkout
        System.out.println("Proceeding to checkout...");
    }

    private void cancelOrder() {
        // Implement logic to cancel the current order
        System.out.println("Canceling the current order...");
    }
}
