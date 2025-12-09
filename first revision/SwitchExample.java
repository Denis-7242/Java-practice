/*Java Switch Statement

The switch statement is an alternative to using many if...else if conditions.
It’s used when you want to execute different code blocks based on a single variable’s value. */

//Basic Syntax

/*switch (variable) {
    case value1:
        // code to execute if variable == value1
        break;

    case value2:
        // code to execute if variable == value2
        break;

    default:
        // code to execute if no case matches
}
 */
//Example Usage

public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;

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
                System.out.println("Invalid day!");
        }
    }
}
//🧾 Expected Output

/*Wednesday*/