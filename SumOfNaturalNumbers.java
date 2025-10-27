import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a positive integer (N): ");
        int n = input.nextInt();

        int sum = 0;

        // Calculate the sum using a for loop
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Display the result
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

        input.close();
    }
}
