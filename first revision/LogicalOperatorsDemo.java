public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        // Example variables
        int age = 20;
        boolean hasID = true;
        boolean hasTicket = false;

        System.out.println("=== Java Logical Operators Example ===\n");

        // ---------- AND (&&) Operator ----------
        System.out.println("1️⃣ AND Operator (&&):");
        if (age >= 18 && hasID) {
            System.out.println("✔ You are an adult and have an ID. Access granted.");
        } else {
            System.out.println("❌ Either you are under 18 or have no ID. Access denied.");
        }

        // ---------- OR (||) Operator ----------
        System.out.println("\n2️⃣ OR Operator (||):");
        if (hasTicket || hasID) {
            System.out.println("✔ You can enter because you have a ticket or an ID.");
        } else {
            System.out.println("❌ You cannot enter. You need at least a ticket or an ID.");
        }

        // ---------- NOT (!) Operator ----------
        System.out.println("\n3️⃣ NOT Operator (!):");
        boolean isRaining = false;
        if (!isRaining) {
            System.out.println("✔ It's not raining. You can go outside!");
        } else {
            System.out.println("☔ It's raining. Better stay indoors.");
        }

        // ---------- Combining Logical Operators ----------
        System.out.println("\n4️⃣ Combining Operators:");
        boolean isWeekend = true;
        boolean hasHomework = false;

        if ((isWeekend && !hasHomework) || (age >= 18 && hasID)) {
            System.out.println("🎉 You can go out and have fun!");
        } else {
            System.out.println("📚 You need to finish your work first.");
        }

        // ---------- Complex Example ----------
        System.out.println("\n5️⃣ Complex Example:");
        int score = 85;
        boolean passedExam = (score >= 50);
        boolean submittedProject = true;

        if (passedExam && submittedProject) {
            System.out.println("🏆 Congratulations! You passed the course.");
        } else if (passedExam || submittedProject) {
            System.out.println("⚠️ You did one part right, but not everything.");
        } else if (!passedExam && !submittedProject) {
            System.out.println("❌ You failed both the exam and the project.");
        }

        System.out.println("\n=== End of Program ===");
    }
}

//🧾 Expected Output

/* === Java Logical Operators Example ===

1️⃣ AND Operator (&&):
✔ You are an adult and have an ID. Access granted.

2️⃣ OR Operator (||):
✔ You can enter because you have a ticket or an ID.

3️⃣ NOT Operator (!):
✔ It's not raining. You can go outside!

4️⃣ Combining Operators:
🎉 You can go out and have fun!

5️⃣ Complex Example:
🏆 Congratulations! You passed the course.

=== End of Program ===*/

//STEP BY STEP EXPLANATION

/*Java Logical Operators

Logical operators are used to combine two or more conditions inside an if statement.
They return either true or false depending on the logic.

🔹 1. AND (&&)

✅ Returns true only if both conditions are true.

int age = 20;
boolean hasID = true;

if (age >= 18 && hasID) {
    System.out.println("You are allowed to enter.");
}


🧠 Explanation:

age >= 18 → true

hasID → true

true && true → ✅ true

Output:

You are allowed to enter.


If either condition were false, the whole expression would be false.

🔹 2. OR (||)

✅ Returns true if at least one condition is true.

int age = 17;
boolean hasParentalConsent = true;

if (age >= 18 || hasParentalConsent) {
    System.out.println("You can join the program.");
}


🧠 Explanation:

age >= 18 → false

hasParentalConsent → true

false || true → ✅ true

Output:

You can join the program.

🔹 3. NOT (!)

✅ Reverses the logical result (makes true → false and false → true).

boolean isRaining = false;

if (!isRaining) {
    System.out.println("Let's go outside!");
}


🧠 Explanation:

isRaining = false

!isRaining = true

✅ The condition passes

Output:

Let's go outside!

✅ Example Program Using All Logical Operators
public class LogicalOperators {
    public static void main(String[] args) {
        int age = 22;
        boolean hasLicense = true;
        boolean hasCar = false;

        // AND
        if (age >= 18 && hasLicense) {
            System.out.println("You can drive.");
        }

        // OR
        if (hasLicense || hasCar) {
            System.out.println("You are ready for a trip.");
        }

        // NOT
        if (!hasCar) {
            System.out.println("You need to borrow a car.");
        }
    }
}


Output:

You can drive.
You are ready for a trip.
You need to borrow a car. */
