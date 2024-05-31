package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            HomeScreen.display();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Order currentOrder = new Order();
                    OrderScreen orderScreen = new OrderScreen(currentOrder, scanner);
                    orderScreen.display();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Exiting the application...");
    }
}

class HomeScreen {
    public static void display() {
        System.out.println("Welcome to DELI-cious!");
        System.out.println("1) New Order");
        System.out.println("0) Exit");
    }
}

class OrderScreen {
    private final Order order;
    private final Scanner scanner;

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
                    AddSandwichScreen addSandwichScreen = new AddSandwichScreen(order, scanner);
                    addSandwichScreen.display();
                    break;
                case 2:
                    AddDrinkScreen addDrinkScreen = new AddDrinkScreen(order, scanner);
                    addDrinkScreen.display();
                    break;
                case 3:
                    AddChipsScreen addChipsScreen = new AddChipsScreen(order, scanner);
                    addChipsScreen.display();
                    break;
                case 4:
                    CheckoutScreen checkoutScreen = new CheckoutScreen(order);
                    checkoutScreen.display();
                    ordering = false;
                    break;
                case 0:
                    ordering = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class AddSandwichScreen {
    private final Order order;
    private final Scanner scanner;

    public AddSandwichScreen(Order order, Scanner scanner) {
        this.order = order;
        this.scanner = scanner;
    }

    public void display() {
        // Implementation to add a sandwich to the order
    }

    public Order getOrder() {
        return order;
    }

    public Scanner getScanner() {
        return scanner;
    }
}

class AddDrinkScreen {
    private final Order order;
    private final Scanner scanner;

    public AddDrinkScreen(Order order, Scanner scanner) {
        this.order = order;
        this.scanner = scanner;
    }

    public void display() {
        // Implementation to add a drink to the order
    }
}

class AddChipsScreen {
    private final Order order;
    private final Scanner scanner;

    public AddChipsScreen(Order order, Scanner scanner) {
        this.order = order;
        this.scanner = scanner;
    }

    public void display() {
        // Implementation to add chips to the order
    }
}

class CheckoutScreen {
    private final Order order;

    public CheckoutScreen(Order order) {
        this.order = order;
    }

    public void display() {
        // Implementation to display order details and handle confirmation or cancellation
        // After confirmation, save the order details to a receipt file
        saveReceipt();
    }

    private void saveReceipt() {
        // Generate receipt file name based on current date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String timestamp = LocalDateTime.now().format(formatter);
        String fileName = "receipts/" + timestamp + ".txt";

        // Implementation to save order details to the receipt file
        // For demonstration, let's just print the order details
        System.out.println("Saving order details to: " + fileName);
        System.out.println("Order Details:");
        // Print order details
    }
}

class Order {
    // You need to define the Order class with necessary functionalities
    // This class should manage the items in the order
}
