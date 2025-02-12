package org.example;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuePurchasing = true;

        while (continuePurchasing) {
            // Display Menu
            System.out.println("Welcome to the Vending Machine!");
            System.out.println("1. Chips - $1.50");
            System.out.println("2. Soda - $1.25");
            System.out.println("3. Candy - $1.00");
            System.out.println("4. Water - $0.75");
            System.out.println("Enter the number of the item you want to buy:");

            // User Selection
            int itemNumber = scanner.nextInt();
            double price = 0.0;
            String itemName = "";

            switch (itemNumber) {
                case 1:
                    price = 1.50;
                    itemName = "Chips";
                    break;
                case 2:
                    price = 1.25;
                    itemName = "Soda";
                    break;
                case 3:
                    price = 1.00;
                    itemName = "Candy";
                    break;
                case 4:
                    price = 0.75;
                    itemName = "Water";
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    continue;
            }

            // Handle Payment
            System.out.println("Enter the amount you are inserting: ");
            double amountInserted = scanner.nextDouble();

            if (amountInserted >= price) {
                double change = amountInserted - price;
                System.out.println("Thank you! Dispensing " + itemName + ".");
                System.out.println("Your change: $" + String.format("%.2f", change));
            } else {
                System.out.println("Insufficient amount! Please insert more money or cancel the purchase.");
                continue;
            }

            // Loop Until Exit
            System.out.println("Would you like to make another purchase? (yes/no): ");
            String userResponse = scanner.next();

            if (!userResponse.equalsIgnoreCase("yes")) {
                continuePurchasing = false;
                System.out.println("Thank you for using the Vending Machine. Goodbye!");
            }
        }
    }
}