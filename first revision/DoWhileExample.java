/*The do...while Loop
 What it does:

This loop is like a while loop, but it will always run the code block at least once,
because the condition is checked after the code runs. */

// 💡 Syntax:

/*do {
    // code to be executed
} while (condition);*/

public class DoWhileExample {
    public static void main(String[] args) {
        int count = 1;

        do {
            System.out.println("Count: " + count);
            count++;
        } while (count <= 5);
    }
}

//💡 What You Learn from This:
/*How to set up and use a do...while loop
How the post-condition check works
How to ensure code runs at least once before checking a condition */