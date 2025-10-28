public class IfStatementExamples {
    public static void main(String[] args) {
        int number = 10;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}

//If statements in Java are used to execute a block of code based on a condition.
/*Java Conditions and If Statements

Conditions and if statements in Java are used to make decisions in your code —
they let your program execute certain parts only when specific conditions are true.

🔹 1. The if Statement

Used to run a block of code only if a condition is true.

int age = 18;

if (age >= 18) {
    System.out.println("You are an adult.");
}


✅ Output:

You are an adult.

🔹 2. The if...else Statement

Used when you want two possible paths — one if true, another if false.

int age = 16;

if (age >= 18) {
    System.out.println("You are an adult.");
} else {
    System.out.println("You are a minor.");
}


✅ Output:

You are a minor.

🔹 3. The if...else if...else Ladder

Used when there are multiple conditions to test.

int marks = 75;

if (marks >= 80) {
    System.out.println("Grade: A");
} else if (marks >= 60) {
    System.out.println("Grade: B");
} else if (marks >= 40) {
    System.out.println("Grade: C");
} else {
    System.out.println("Fail");
}


✅ Output:

Grade: B

🔹 4. Nested if Statements

An if statement inside another if — used for checking multiple related conditions.

int age = 25;
boolean hasID = true;

if (age >= 18) {
    if (hasID) {
        System.out.println("Access granted.");
    } else {
        System.out.println("ID required.");
    }
} else {
    System.out.println("Access denied. Underage.");
}


✅ Output:

Access granted.

🔹 5. Short-Hand (Ternary Operator)

A quick way to write simple if...else statements.

int age = 20;
String result = (age >= 18) ? "Adult" : "Minor";
System.out.println(result);


✅ Output:

Adult
 */