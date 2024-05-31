package com.pluralsight;

import java.util.Scanner;

public class HomeScreen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderScreen orderScreen = new OrderScreen();

        boolean exit = false;
        while (!exit) {
            displayOptions();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    orderScreen.startOrder();
                    break;
                case 0:
                    System.out.println("Exiting the application.");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void displayOptions() {
        System.out.println("Home Screen");
        System.out.println("1) New Order");
        System.out.println("0) Exit");
        System.out.print("Enter your choice: ");
    }
}
