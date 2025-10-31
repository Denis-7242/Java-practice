/*1️⃣ What Is an Array?

An array in Java is a container that holds multiple values of the same data type.

👉 Think of it like a row of boxes, where each box holds one value — but all boxes must store the same type (e.g., all integers, all strings, etc.)

🔹 2️⃣ Why Use Arrays?

✅ To store many values in a single variable
✅ To avoid creating many separate variables
✅ To loop through data easily

Example:

int[] numbers = {10, 20, 30, 40, 50};


Instead of:

int num1 = 10;
int num2 = 20;
int num3 = 30;

🔹 3️⃣ Declaring an Array

You can declare arrays in two ways:

(a) Declare and initialize directly:
int[] numbers = {10, 20, 30, 40};

(b) Declare first, then assign values:
int[] numbers = new int[4]; // creates space for 4 integers
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;


💡 Note: Array indexes start from 0
➡ numbers[0] = 10
➡ numbers[3] = 40

🔹 4️⃣ Accessing Array Elements

You use the index number to access elements.

System.out.println(numbers[0]);  // prints 10
System.out.println(numbers[2]);  // prints 30

🔹 5️⃣ Looping Through Arrays

You can use a for loop or for-each loop to go through all array elements.

(a) Using a normal for loop:
public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + " = " + numbers[i]);
        }
    }
}


Output:

Element at index 0 = 10
Element at index 1 = 20
Element at index 2 = 30
Element at index 3 = 40
Element at index 4 = 50

(b) Using a for-each loop (simpler way):
public class ForEachExample {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Mango"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}


Output:

Apple
Banana
Mango

🔹 6️⃣ Array Length

Use .length to get how many items are in the array:

System.out.println("Total items: " + fruits.length);


Output:

Total items: 3

🔹 7️⃣ Changing Array Elements
fruits[1] = "Orange";
System.out.println(fruits[1]); // Output: Orange

🔹 8️⃣ Multi-Dimensional Arrays

You can also have arrays inside arrays (like a table):

int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};


To access:

System.out.println(matrix[1][2]); // prints 6

🧾 Summary Table
Concept	Example	Meaning
Declare	int[] arr;	Creates an array reference
Initialize	arr = new int[5];	Creates array with 5 elements
Access	arr[0]	Access 1st element
Length	arr.length	Number of items
For loop	for(int i=0; i<arr.length; i++)	Loops through all elements
For-each	for(int x : arr)	Simpler loop */