package com.pluralsight;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Sauce {
    private final Map<String, Double> sauces;
    private final Scanner scanner;

    public Sauce(Scanner scanner) {
        this.scanner = scanner;
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

    public void selectSauce() {
        System.out.println("Select Sauce Screen");
        displayAvailableSauces();
        String sauceChoice = promptForSauceChoice();
        if (validateSauceChoice(sauceChoice)) {
            System.out.println("Sauce selected: " + sauceChoice);
            // You can add further logic here if needed
        } else {
            System.out.println("Invalid sauce choice. Please select from the available options.");
            selectSauce(); // Prompt user to select again
        }
    }

    private void displayAvailableSauces() {
        System.out.println("Available sauces:");
        for (String sauce : sauces.keySet()) {
            System.out.println(sauce + ": $" + sauces.get(sauce));
        }
    }

    private String promptForSauceChoice() {
        System.out.print("Enter your choice of sauce: ");
        return scanner.nextLine();
    }

    private boolean validateSauceChoice(String sauceChoice) {
        return sauces.containsKey(sauceChoice);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sauce sauce = new Sauce(scanner);
        sauce.selectSauce();
        scanner.close();
    }
}
