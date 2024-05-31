package com.pluralsight;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Confirm {
    public static void createReceipt(Order order) {
        // Get the current date and time
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd-HHmmss");
        Date date = new Date();
        String timestamp = formatter.format(date);

        // Generate the filename for the receipt
        String fileName = timestamp + ".txt";

        // Write order details to the receipt file
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println("Order Details:");
            List<Sandwich> sandwiches = order.getSandwiches();
            for (Sandwich sandwich : sandwiches) {
                writer.println("Sandwich:");
                writer.println("Size: " + sandwich.getSize());
                writer.println("Bread: " + sandwich.getBread());
                writer.println("Toppings: " + sandwich.getToppings());
                writer.println("Toasted: " + (sandwich.isToasted() ? "Yes" : "No"));
                writer.println("Price: $" + sandwich.calculatePrice());
                writer.println();
            }

            List<Drink> drinks = order.getDrinks();
            for (Drink drink : drinks) {
                writer.println("Drink:");
                writer.println("Size: " + drink.getSize());
                writer.println("Flavor: " + drink.getFlavor());
                writer.println();
            }

            List<Chips> chips = order.getChips();
            for (Chips chip : chips) {
                writer.println("Chips:");
                writer.println("Type: " + chip.getType());
                writer.println();
            }

            writer.println("Total Price: $" + order.calculateTotalPrice());
            System.out.println("Receipt created successfully: " + fileName);
        } catch (IOException e) {
            System.out.println("Error creating receipt: " + e.getMessage());
        }
    }
}

