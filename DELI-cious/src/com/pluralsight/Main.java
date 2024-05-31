package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Order
        CheckoutScreen.Order order = new CheckoutScreen.Order();

        // Create an instance of CheckoutScreen with the order
        CheckoutScreen checkoutScreen = new CheckoutScreen(order);

        // Display order details
        checkoutScreen.displayOrderDetails();

        // Save receipt
        checkoutScreen.saveReceipt();
    }
}

class CheckoutScreen {
    private final Order order;

    public CheckoutScreen(Order order) {
        this.order = order;
    }

    public void displayOrderDetails() {
        System.out.println("Order Details:");
        System.out.println(order.toString());
        System.out.println("Total Cost: $" + order.calculateTotalCost());
    }

    public void saveReceipt() {
        String receiptFileName = generateReceiptFileName();
        try (PrintWriter writer = new PrintWriter(new FileWriter(receiptFileName))) {
            writer.println("Receipt for Order:");
            writer.println(order.toString());
            writer.println("Total Cost: $" + order.calculateTotalCost());
            System.out.println("Receipt saved as: " + receiptFileName);
        } catch (IOException e) {
            System.out.println("Error saving receipt: " + e.getMessage());
        }
    }

    private String generateReceiptFileName() {
        String dateTime = java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
        return dateTime + ".txt";
    }

    static class Order {
        public String calculateTotalCost() {
            // Placeholder implementation to calculate total cost
            return "Total cost calculated";
        }
    }
}
