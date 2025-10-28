public class ComparisonOperators {
    public static void main(String[] args) {
        int x = 10, y = 20;

        System.out.println("x == y: " + (x == y));  // false
        System.out.println("x != y: " + (x != y));  // true
        System.out.println("x > y: " + (x > y));    // false
        System.out.println("x < y: " + (x < y));    // true
        System.out.println("x >= y: " + (x >= y));  // false
        System.out.println("x <= y: " + (x <= y));  // true
    }
}

/*Comparison (or relational) operators in Java are used to compare two values.
They return a boolean result — either true or false.

🔹 1. Equal to (==)

Checks if two values are equal.

int a = 5, b = 5;
System.out.println(a == b); // true


✅ Because 5 is equal to 5.

🔹 2. Not equal to (!=)

Checks if two values are not equal.

int a = 5, b = 8;
System.out.println(a != b); // true


✅ Because 5 is not equal to 8.

🔹 3. Greater than (>)

Checks if the left value is greater than the right.

int a = 10, b = 7;
System.out.println(a > b); // true


✅ Because 10 is greater than 7.

🔹 4. Less than (<)

Checks if the left value is less than the right.

int a = 3, b = 9;
System.out.println(a < b); // true


✅ Because 3 is less than 9.

🔹 5. Greater than or equal to (>=)

Checks if the left value is greater than or equal to the right.

int a = 10, b = 10;
System.out.println(a >= b); // true


✅ Because 10 is equal to 10.

🔹 6. Less than or equal to (<=)

Checks if the left value is less than or equal to the right.

int a = 6, b = 8;
System.out.println(a <= b); // true


✅ Because 6 is less than 8.*/