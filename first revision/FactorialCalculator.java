//Calculate the factorial of a number
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a non-negative integer: ");
        int n = input.nextInt();

        // Factorial of 0 and 1 is 1
        long factorial = 1;

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial using a for loop
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            // Display the result
            System.out.println("The factorial of " + n + " is: " + factorial);
        }

        input.close();
    }
}
