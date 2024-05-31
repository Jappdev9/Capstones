package com.pluralsight;
import java.util.HashMap;
import java.util.Map;

public class Meat {
    private Map<String, Double> meats;

    public Meat() {
        meats = new HashMap<>();
        initializeMeats();
    }

    private void initializeMeats() {
        // Initialize meats
        meats.put("Ham", 1.50);
        meats.put("Turkey", 1.75);
        meats.put("Roast Beef", 2.00);
        // Add more meats as needed
    }

    public Map<String, Double> getMeats() {
        return meats;
    }
}
