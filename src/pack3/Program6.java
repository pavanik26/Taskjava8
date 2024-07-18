package pack3;

import java.util.Scanner;

public class Program6 {
	public static long iterativeFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Input validation
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long iterativeResult = iterativeFactorial(number);
            System.out.println("Factorial of " + number + " (Iterative): " + iterativeResult);
            
        }

        scanner.close();
        
	}
}
