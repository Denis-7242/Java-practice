//Simple Array Example (Declaration + Printing)

public class SimpleArray {
    public static void main(String[] args) {
        // Declare and initialize array
        int[] numbers = {10, 20, 30, 40, 50};

        // Print array elements
        System.out.println("Array Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + i + ": " + numbers[i]);
        }
    }
}

