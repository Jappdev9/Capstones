package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Checkout {
    private final Scanner scanner;

    public Checkout(Scanner scanner) {
        this.scanner = scanner;
    }

    public void display(double totalCost, String orderDetails) {
        System.out.println("Checkout:");
        System.out.println("Order details:");
        System.out.println(orderDetails); // Display order details
        System.out.println("Total cost: $" + totalCost);
        System.out.println("1) Confirm order");
        System.out.println("0) Cancel order and go back to Home Screen");

        int choice = getChoice();
        switch (choice) {
            case 1:
                confirmOrder(orderDetails, totalCost);
                break;
            case 0:
                cancelOrder();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                display(totalCost, orderDetails); // Display checkout options again
        }
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

    private void confirmOrder(String orderDetails, double totalCost) {
        System.out.println("Order confirmed. Saving order details...");
        saveOrderDetails(orderDetails, totalCost); // Save order details to file
        System.out.println("Thank you for your order!");
    }

    private void saveOrderDetails(String orderDetails, double totalCost) {
        // Generate receipt filename based on date and time
        String fileName = "receipts/" + java.time.LocalDate.now() + "-" + java.time.LocalTime.now().withNano(0) + ".txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            // Write order details to the file
            writer.println("Order details:");
            writer.println(orderDetails); // Include order details
            writer.println("Total cost: $" + totalCost); // Include total cost
        } catch (IOException e) {
            System.out.println("Error occurred while saving order details: " + e.getMessage());
        }
    }

    private void cancelOrder() {
        System.out.println("Order canceled. Going back to Home Screen...");
        // Return to Home Screen
        HomeScreen homeScreen = new HomeScreen(scanner);
        homeScreen.display();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Checkout checkout = new Checkout(scanner);
        checkout.display(20.0, "1 Sandwich: Chicken Sandwich, Size: 8\", Toppings: Lettuce, Tomato, Cheese, Sauce: Mustard\n1 Drink: Medium Coke\n1 Chips: Regular"); // Pass total cost and order details as parameters
        scanner.close();
    }
}
