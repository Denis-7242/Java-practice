import java.util.Scanner;

public class SwitchInteractive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (1–7) for day of the week: ");
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number!");
        }

        input.close();
    }
}
//💡 What You Learn from This:
/*How to use the switch statement
How to handle multiple cases with switch
How to take user input with the Scanner class
How to implement default case handling */

/*When to Use switch

Use a switch statement when:

You’re comparing one variable against many constant values

Each case has distinct actions

You want cleaner, faster, more readable code than if...else if */