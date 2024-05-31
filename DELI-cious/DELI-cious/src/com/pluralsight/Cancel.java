package com.pluralsight;
import java.util.Scanner;

public class Cancel {
    private final Scanner scanner;

    public Cancel(Scanner scanner) {
        this.scanner = scanner;
    }

    public void display() {
        System.out.println("Order canceled. Returning to Home Screen...");
        // Optionally, you can add a delay or clear screen here before returning to the Home Screen
        // For simplicity, we will just wait for user input before returning
        System.out.println("Press Enter to continue...");
        scanner.nextLine(); // Consume newline character after previous input
        scanner.nextLine(); // Wait for user input
        HomeScreen homeScreen = new HomeScreen(scanner);
        homeScreen.display();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cancel cancelScreen = new Cancel(scanner);
        cancelScreen.display();
        scanner.close();
    }
}
