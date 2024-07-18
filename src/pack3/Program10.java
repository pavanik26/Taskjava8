package pack3;

import java.util.Scanner;

public class Program10 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Count digits using absolute value to handle negative numbers
        int count = countDigits(Math.abs(number));

        System.out.println("Number of digits: " + count);
        scanner.close();

  }
	public static int countDigits(int num) {
	    return String.valueOf(Math.abs(num)).length();
	}

}
