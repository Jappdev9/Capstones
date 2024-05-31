package com.pluralsight;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Cheeses {
    private Map<String, Double> cheeses = Map.of();
    private Scanner scanner = null;

    public void Cheese(Scanner scanner) {
        this.scanner = scanner;
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

    public void selectCheese() {
        System.out.println("Select Cheese Screen");
        displayAvailableCheeses();
        String cheeseChoice = promptForCheeseChoice();
        if (validateCheeseChoice(cheeseChoice)) {
            System.out.println("Cheese selected: " + cheeseChoice);
            // You can add further logic here if needed
        } else {
            System.out.println("Invalid cheese choice. Please select from the available options.");
            selectCheese(); // Prompt user to select again
        }
    }

    private void displayAvailableCheeses() {
        System.out.println("Available cheeses:");
        for (String cheese : cheeses.keySet()) {
            System.out.println(cheese + ": $" + cheeses.get(cheese));
        }
    }

    private String promptForCheeseChoice() {
        System.out.print("Enter your choice of cheese: ");
        return scanner.nextLine();
    }

    private boolean validateCheeseChoice(String cheeseChoice) {
        return cheeses.containsKey(cheeseChoice);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cheese cheese = new Cheese(scanner);
        cheese.selectCheese();
        scanner.close();
    }
}
