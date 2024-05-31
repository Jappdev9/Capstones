package com.pluralsight;
import java.util.HashMap;
import java.util.Map;

public class Toppings {
    private Map<String, Double> regularToppings;
    private Map<String, Double> premiumToppings;

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
}
