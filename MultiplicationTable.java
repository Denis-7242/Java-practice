//A program to display the multiplication table of a given number
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = input.nextInt();

        System.out.println("\nMultiplication Table of " + number + ":");

        // Generate and display the table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        input.close();
    }
}
