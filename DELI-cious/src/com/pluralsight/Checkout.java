package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CheckoutScreen {

    public void displayOrderDetails(Order order) {
        System.out.println("Order Details:");
        System.out.println(order.toString());
        System.out.println("Total Cost: $" + order.calculateTotalCost());
    }

    public void saveReceipt(Order order) {
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
        // Generate a unique receipt file name based on date and time
        // For example: 20240531-144512.txt
        String dateTime = java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
        return dateTime + ".txt";
    }
}
