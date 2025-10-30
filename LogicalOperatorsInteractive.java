/*Here’s an interactive version of the Java Logical Operators program — it uses the Scanner 
class so the user can input values like age, ID possession, ticket availability, and weather 
to see how logical operators work in real time. */

import java.util.Scanner;

public class LogicalOperatorsInteractive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Java Logical Operators Interactive Program ===\n");

        // ---------- User Inputs ----------
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Do you have an ID? (true/false): ");
        boolean hasID = input.nextBoolean();

        System.out.print("Do you have a ticket? (true/false): ");
        boolean hasTicket = input.nextBoolean();

        System.out.print("Is it raining outside? (true/false): ");
        boolean isRaining = input.nextBoolean();

        System.out.print("Is it the weekend? (true/false): ");
        boolean isWeekend = input.nextBoolean();

        System.out.print("Do you have homework? (true/false): ");
        boolean hasHomework = input.nextBoolean();

        System.out.print("Enter your exam score (0–100): ");
        int score = input.nextInt();

        System.out.print("Did you submit your project? (true/false): ");
        boolean submittedProject = input.nextBoolean();


        System.out.println("\n=== Results ===\n");

        // ---------- AND (&&) Operator ----------
        if (age >= 18 && hasID) {
            System.out.println("✔ You are an adult and have an ID. Access granted.");
        } else {
            System.out.println("❌ Either you are under 18 or don’t have an ID. Access denied.");
        }

        // ---------- OR (||) Operator ----------
        if (hasTicket || hasID) {
            System.out.println("✔ You can enter because you have a ticket or an ID.");
        } else {
            System.out.println("❌ You need at least a ticket or an ID to enter.");
        }

        // ---------- NOT (!) Operator ----------
        if (!isRaining) {
            System.out.println("✔ It's not raining. You can go outside!");
        } else {
            System.out.println("☔ It's raining. Better stay indoors.");
        }

        // ---------- Combining Logical Operators ----------
        if ((isWeekend && !hasHomework) || (age >= 18 && hasID)) {
            System.out.println("🎉 You can go out and have fun!");
        } else {
            System.out.println("📚 You should finish your homework first.");
        }

        // ---------- Complex Example ----------
        boolean passedExam = (score >= 50);

        if (passedExam && submittedProject) {
            System.out.println("🏆 Congratulations! You passed the course.");
        } else if (passedExam || submittedProject) {
            System.out.println("⚠️ You did one part right, but not everything.");
        } else if (!passedExam && !submittedProject) {
            System.out.println("❌ You failed both the exam and the project.");
        }

        System.out.println("\n=== End of Program ===");

        input.close();
    }
}
