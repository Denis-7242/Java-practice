/*The while Loop
 What it does:

The while loop runs as long as a condition is true.
It’s used when you don’t know exactly how many times to loop — like waiting for user input or checking a condition dynamically. */

// 💡 Syntax:

/*while (condition) {
    // code to be executed
}*/

public class WhileLoopExample {
    public static void main(String[] args) {
        int count = 1;

        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }
    }
}

//💡 What You Learn from This:
/*How to set up and use a while loop
How the condition controls loop execution
How to manage loop variables to avoid infinite loops */