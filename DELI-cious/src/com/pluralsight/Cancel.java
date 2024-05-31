package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cancel cancel = new Cancel(scanner);

        System.out.println("Cancel Screen");
        if (cancel.confirmCancellation()) {
            cancel.displayCancelScreen();
        } else {
            System.out.println("Order cancellation aborted.");
        }

        scanner.close();
    }
}

class Cancel {
    private Scanner scanner;

    public Cancel(Scanner scanner) {
        this.scanner = scanner;
    }

    public void displayCancelScreen() {
        System.out.println("Order canceled. Returning to Home Screen.");
    }

    public boolean confirmCancellation() {
        System.out.println("Are you sure you want to cancel the order? (Y/N)");
        String input = scanner.nextLine().trim().toUpperCase();
        return input.equals("Y");
    }
}
