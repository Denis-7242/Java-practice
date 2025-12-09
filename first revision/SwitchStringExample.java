public class SwitchStringExample {
    public static void main(String[] args) {
        String grade = "B";

        switch (grade) {
            case "A":
                System.out.println("Excellent!");
                break;
            case "B":
                System.out.println("Good job!");
                break;
            case "C":
                System.out.println("Well done.");
                break;
            case "D":
                System.out.println("You passed.");
                break;
            case "F":
                System.out.println("Try again next time.");
                break;
            default:
                System.out.println("Invalid grade.");
        }
    }
}
// //🧾 Expected Output 
// /*Good job!*/