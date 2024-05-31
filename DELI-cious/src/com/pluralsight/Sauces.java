package com.pluralsight;
import java.util.HashMap;
import java.util.Map;

public class Sauce {
    private Map<String, Double> sauces;

    public Sauce() {
        sauces = new HashMap<>();
        initializeSauces();
    }

    private void initializeSauces() {
        // Initialize sauces
        sauces.put("Mayonnaise", 0.50);
        sauces.put("Mustard", 0.50);
        sauces.put("BBQ Sauce", 0.75);
        // Add more sauce options as needed
    }

    public Map<String, Double> getSauces() {
        return sauces;
    }

    public void addSauce(String sauceName, double price) {
        sauces.put(sauceName, price);
    }

    public void removeSauce(String sauceName) {
        sauces.remove(sauceName);
    }
}
