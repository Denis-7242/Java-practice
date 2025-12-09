//Input Array Values from User (Using Scanner)

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5]; // array size 5

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nYou entered:");
        for (int num : numbers) {
            System.out.println(num);
        }

        sc.close();
    }
}
