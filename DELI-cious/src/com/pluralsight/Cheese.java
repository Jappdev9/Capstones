package com.pluralsight;
import java.util.HashMap;
import java.util.Map;

public class Cheese {
    private Map<String, Double> cheeses;

    public Cheese() {
        cheeses = new HashMap<>();
        initializeCheeses();
    }

    private void initializeCheeses() {
        // Initialize cheeses
        cheeses.put("Cheddar", 1.00);
        cheeses.put("Swiss", 1.25);
        cheeses.put("Provolone", 1.50);
        // Add more cheese options as needed
    }

    public Map<String, Double> getCheeses() {
        return cheeses;
    }

    public void addCheese(String cheeseName, double price) {
        cheeses.put(cheeseName, price);
    }

    public void removeCheese(String cheeseName) {
        cheeses.remove(cheeseName);
    }
}
