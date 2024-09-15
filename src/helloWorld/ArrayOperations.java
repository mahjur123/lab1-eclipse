package helloWorld;

public class ArrayOperations {
	 public static void main(String[] args) {
	 int[] numbers = new int[10];
	 // Populate the array with numbers 1 to 10
	 for (int i = 0; i < numbers.length; i++) {
	 numbers[i] = i + 1;
	 }
	 // Display the array
	 System.out.println("Original Array:");
	 for (int index = 0; index < numbers.length; index++) {
	 System.out.print(numbers[index] + " ");
	 }
	 System.out.println();
	 // Calculate and display the sum of the array
	 int totalSum = 0;
	 for (int index = 0; index < numbers.length; index++) {
	 totalSum += numbers[index];
	 }
	 System.out.println("Sum of the Array: " + totalSum);
	 // Reverse and display the array
	 System.out.println("Reversed Array:");
	 for (int index = numbers.length - 1; index >= 0; index--) {
	 System.out.print(numbers[index] + " ");
	 }
	 System.out.println();
	 }
	}

