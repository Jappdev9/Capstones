package com.pluralsight;

import java.util.List;

public class Checkout {
    public static void displayOrderDetails(Order order) {
        System.out.println("Order Details:");
        List<Sandwich> sandwiches = order.getSandwiches();
        for (Sandwich sandwich : sandwiches) {
            System.out.println("Sandwich:");
            System.out.println("Size: " + sandwich.getSize());
            System.out.println("Bread: " + sandwich.getBread());
            System.out.println("Toppings: " + sandwich.getToppings());
            System.out.println("Toasted: " + (sandwich.isToasted() ? "Yes" : "No"));
            System.out.println("Price: $" + sandwich.calculatePrice());
            System.out.println();
        }

        List<Drink> drinks = order.getDrinks();
        for (Drink drink : drinks) {
            System.out.println("Drink:");
            System.out.println("Size: " + drink.getSize());
            System.out.println("Flavor: " + drink.getFlavor());
            System.out.println();
        }

        List<Chips> chips = order.getChips();
        for (Chips chip : chips) {
            System.out.println("Chips:");
            System.out.println("Type: " + chip.getType());
            System.out.println();
        }

        System.out.println("Total Price: $" + order.calculateTotalPrice());
    }
}

