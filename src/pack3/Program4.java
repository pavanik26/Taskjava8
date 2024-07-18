package pack3;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two numbers from user input
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Print original values
        System.out.println("Before swapping:");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);

        // Swap the numbers using an additional variable
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        // Print swapped values
        System.out.println("After swapping:");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);

        scanner.close();
    }


}
