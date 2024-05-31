package com.pluralsight;
import java.util.Scanner;

class AddSandwichScreen {
    private Order order;
    private Scanner scanner;

    public AddSandwichScreen(Order order, Scanner scanner) {
        this.order = order;
        this.scanner = scanner;
    }

    public void display() {
        System.out.println("Add Sandwich:");
        System.out.println("Select your bread:");
        System.out.println("1) White");
        System.out.println("2) Wheat");
        System.out.println("3) Rye");
        System.out.println("4) Wrap");
        System.out.print("Enter your choice: ");
        int breadChoice = scanner.nextInt();
        String breadType;
        switch (breadChoice) {
            case 1:
                breadType = "White";
                break;
            case 2:
                breadType = "Wheat";
                break;
            case 3:
                breadType = "Rye";
                break;
            case 4:
                breadType = "Wrap";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to White bread.");
                breadType = "White";
                break;
        }

        System.out.println("Select sandwich size:");
        System.out.println("1) 4\"");
        System.out.println("2) 8\"");
        System.out.println("3) 12\"");
        System.out.print("Enter your choice: ");
        int sizeChoice = scanner.nextInt();
        String sandwichSize;
        switch (sizeChoice) {
            case 1:
                sandwichSize = "4\"";
                break;
            case 2:
                sandwichSize = "8\"";
                break;
            case 3:
                sandwichSize = "12\"";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to 8\" size.");
                sandwichSize = "8\"";
                break;
        }

        System.out.println("Select your toppings:");
        System.out.println("1) Meat");
        System.out.println("2) Cheese");
        System.out.println("3) Other toppings");
        System.out.print("Enter your choice: ");
        int toppingChoice = scanner.nextInt();
        // Handle toppings based on choice

        System.out.println("Select sauces:");
        // Handle sauces selection

        System.out.print("Would you like the sandwich toasted? (yes/no): ");
        String toastedChoice = scanner.next();
        boolean toasted = toastedChoice.equalsIgnoreCase("yes");

        Sandwich sandwich = new Sandwich(sandwichSize, breadType, toasted);
        order.addItem(sandwich);

        System.out.println("Sandwich added to the order:");
        System.out.println(sandwich);
    }
}
