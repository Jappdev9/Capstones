package com.pluralsight;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Confirm {
    private final Scanner scanner;

    public Confirm(Scanner scanner) {
        this.scanner = scanner;
    }

    public void display(String orderDetails, double totalCost) {
        System.out.println("Order confirmed. Saving order details...");

        // Generate receipt filename based on date and time
        String fileName = "receipts/" + LocalDate.now() + "-" + LocalTime.now().withNano(0) + ".txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            // Write order details to the file
            writer.println("Order details:");
            writer.println(orderDetails); // Include order details
            writer.println("Total cost: $" + totalCost); // Include total cost

            System.out.println("Receipt saved: " + fileName);
            System.out.println("Thank you for your order!");
        } catch (IOException e) {
            System.out.println("Error occurred while saving order details: " + e.getMessage());
        }

        // Return to Home Screen
        HomeScreen homeScreen = new HomeScreen(scanner);
        homeScreen.display();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Confirm confirm = new Confirm(scanner);
        // Example order details and total cost
        String orderDetails = """
                1 Sandwich: Chicken Sandwich, Size: 8", Toppings: Lettuce, Tomato, Cheese, Sauce: Mustard
                1 Drink: Medium Coke
                1 Chips: Regular""";
        double totalCost = 20.0;
        confirm.display(orderDetails, totalCost);
        scanner.close();
    }
}

