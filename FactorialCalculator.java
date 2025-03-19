import java.util.Scanner;

public class FactorialCalculator {
    // Main method
     static void main(String[] args) {
        // Get a non-negative integer from the user
        int number = getNonNegativeInteger();

        // Calculate the factorial of the number
        long factorial = calculateFactorial(number);

        // Display the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    // Method to get a valid non-negative integer input from the user
    public static int getNonNegativeInteger() {
        Scanner input = new Scanner(System.in);
        int number = -1;

        // Loop until a valid non-negative integer is provided
        while (true) {
            try {
                // Prompt the user to enter a non-negative integer
                System.out.print("Enter a non-negative integer: ");
                number = Integer.parseInt(input.nextLine());

                // Validate if the number is non-negative
                if (number >= 0) {
                    break; // Valid input, exit the loop
                } else {
                    System.out.println("Invalid input. Please enter a non-negative integer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        return number;
    }

    // Method to calculate the factorial of a non-negative integer
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        }

        long factorial = 1;

        // Loop to calculate factorial from 1 to n
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
