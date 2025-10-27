//A program to Print Fibonacci Series
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user how many terms to display
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = input.nextInt();

        int first = 0, second = 1;

        System.out.println("\nFibonacci Series up to " + n + " terms:");

        // Print the first two numbers
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Calculate the next term
            int next = first + second;
            first = second;
            second = next;
        }

        input.close();
    }
}
