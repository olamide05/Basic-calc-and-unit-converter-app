

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        
        // Loop to ensure valid input
        while (!validInput) {
            System.out.println("Hello, thanks for using our basic calculator.");
            System.out.println("Would you like to add, subtract, divide, or multiply?: ");
            String choiceCalc = scanner.nextLine().toLowerCase(); // Get operation choice
            
            // Ask how many values the user wants to calculate
            System.out.println("How many values would you like to calculate? ");
            int valuesNum = scanner.nextInt();
            scanner.nextLine(); // Consume leftover newline
            
            // Ensure the user enters at least 2 values
            if (valuesNum < 2) {
                System.out.println("You have to choose at least 2 values.");
                return;
            }

            // Enter the first number and initialize result with this number
            System.out.println("Enter the first number: ");
            double result = scanner.nextDouble(); // The result starts with the first number

            // Loop through the remaining numbers based on the number of values
            for (int i = 2; i <= valuesNum; i++) {
                System.out.println("Enter number " + i + ": ");
                double nextNum = scanner.nextDouble(); // Get the next number

                // Perform the chosen operation
                switch (choiceCalc) {
                    case "add":
                        result += nextNum; // Add next number to result
                        break;

                    case "subtract":
                        result -= nextNum; // Subtract next number from result
                        break;

                    case "multiply":
                        result *= nextNum; // Multiply result by next number
                        break;

                    case "divide":
                        if (nextNum == 0) { // Handle division by zero
                            System.out.println("Division by zero isn't allowed.");
                            return;
                        } else {
                            result /= nextNum; // Divide result by next number
                        }
                        break;

                    default:
                        // Handle invalid operations
                        System.out.println("Invalid operation. Please enter 'add', 'subtract', 'multiply', or 'divide'.");
                        return;
                }
            }

            // End the loop after valid input is processed
            validInput = true;

            // Display the final result
            System.out.println("The result is: " + result);
        }
    }
}
