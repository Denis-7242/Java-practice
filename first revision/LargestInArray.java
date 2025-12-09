//Find the Largest Element in an Array

public class LargestInArray {
    public static void main(String[] args) {
        int[] numbers = {25, 85, 12, 99, 63};
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest number is: " + largest);
    }
}
