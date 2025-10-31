//Access and Modify Array Elements

public class ModifyArray {
    public static void main(String[] args) {
        String[] colors = {"Red", "Blue", "Green"};
        
        // Print original array
        System.out.println("Before change: " + colors[1]);
        
        // Modify one element
        colors[1] = "Yellow";
        
        // Print modified array
        System.out.println("After change: " + colors[1]);
    }
}
