package com.pluralsight;
import java.util.Scanner;

class AddDrink {
    private Order order;
    private Scanner scanner;

    public AddDrink(Order order, Scanner scanner) {
        this.order = order;
        this.scanner = scanner;
    }

    public void display() {
        System.out.println("Add Drink:");
        System.out.println("Select drink size:");
        System.out.println("1) Small");
        System.out.println("2) Medium");
        System.out.println("3) Large");
        System.out.print("Enter your choice: ");
        int sizeChoice = scanner.nextInt();
        String drinkSize;
        switch (sizeChoice) {
            case 1:
                drinkSize = "Small";
                break;
            case 2:
                drinkSize = "Medium";
                break;
            case 3:
                drinkSize = "Large";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Medium size.");
                drinkSize = "Medium";
                break;
        }

        System.out.println("Select drink flavor:");
        System.out.println("1) Cola");
        System.out.println("2) Lemonade");
        System.out.println("3) Iced Tea");
        System.out.print("Enter your choice: ");
        int flavorChoice = scanner.nextInt();
        String drinkFlavor;
        switch (flavorChoice) {
            case 1:
                drinkFlavor = "Cola";
                break;
            case 2:
                drinkFlavor = "Lemonade";
                break;
            case 3:
                drinkFlavor = "Iced Tea";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Cola flavor.");
                drinkFlavor = "Cola";
                break;
        }

        Drink drink = new Drink(drinkSize, drinkFlavor);
        order.addItem(drink);

        System.out.println("Drink added to the order:");
        System.out.println(drink);
    }
}
