package com.pluralsight;

import java.util.HashMap;
import java.util.Map;

public class Toppings {
    private final Map<String, Double> regularToppings;
    private final Map<String, Double> premiumToppings;

    public Toppings() {
        regularToppings = new HashMap<>();
        premiumToppings = new HashMap<>();
        initializeToppings();
    }

    private void initializeToppings() {
        // Initialize regular toppings
        regularToppings.put("Lettuce", 0.50);
        regularToppings.put("Tomato", 0.50);
        regularToppings.put("Onion", 0.50);
        // Add more regular toppings as needed

        // Initialize premium toppings
        premiumToppings.put("Meat", 1.50);
        premiumToppings.put("Cheese", 1.00);
        // Add more premium toppings as needed
    }

    public Map<String, Double> getRegularToppings() {
        return regularToppings;
    }

    public Map<String, Double> getPremiumToppings() {
        return premiumToppings;
    }

    // Example method to demonstrate usage
    public void configureSandwich() {
        System.out.println("Configuring sandwich toppings...");
        // Assume this method is used to configure toppings for a sandwich order
        // Access regular and premium toppings
        Map<String, Double> regularToppings = getRegularToppings();
        Map<String, Double> premiumToppings = getPremiumToppings();

        // Display available toppings
        System.out.println("Regular Toppings:");
        for (String topping : regularToppings.keySet()) {
            System.out.println(topping + ": $" + regularToppings.get(topping));
        }

        System.out.println("\nPremium Toppings:");
        for (String topping : premiumToppings.keySet()) {
            System.out.println(topping + ": $" + premiumToppings.get(topping));
        }
    }

    public static void main(String[] args) {
        Toppings toppings = new Toppings();
        toppings.configureSandwich(); // Using the configureSandwich method
    }
}
