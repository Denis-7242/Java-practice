//Find the Sum of Array Elements

public class SumArray {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of elements = " + sum);
    }
}
