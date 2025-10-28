public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;

        a += 5;  // a = 15
        a -= 3;  // a = 12
        a *= 2;  // a = 24
        a /= 4;  // a = 6
        a %= 5;  // a = 1

        System.out.println("Final value of a: " + a);
    }
}

/*Java Assignment Operators

Assignment operators in Java are used to assign values to variables.
They can also combine arithmetic operations with assignment for shorter, cleaner code.

🔹 1. Basic Assignment (=)

Assigns the value on the right to the variable on the left.

int x = 10;


✅ x is now 10.

🔹 2. Add and Assign (+=)

Adds a value to a variable and assigns the result back to it.

int x = 5;
x += 3;   // same as x = x + 3;


✅ x becomes 8.

🔹 3. Subtract and Assign (-=)

Subtracts a value from a variable.

int y = 10;
y -= 4;   // same as y = y - 4;


✅ y becomes 6.

🔹 4. Multiply and Assign (*=)

Multiplies and assigns the result.

int z = 7;
z *= 2;   // same as z = z * 2;


✅ z becomes 14.

🔹 5. Divide and Assign (/=)

Divides and assigns the result.

int a = 20;
a /= 4;   // same as a = a / 4;


✅ a becomes 5.

🔹 6. Modulus and Assign (%=)

Finds the remainder and assigns it.

int b = 10;
b %= 3;   // same as b = b % 3;


✅ b becomes 1. */