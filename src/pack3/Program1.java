package pack3;

import java.util.Scanner;

	public class Program1 {
		public static void main(String[] args)
		{
			Scanner scanner = new Scanner(System.in);

	        // Read four variables from user input
	        System.out.print("Enter value for a: ");
	        int a = scanner.nextInt();
	        System.out.print("Enter value for b: ");
	        int b = scanner.nextInt();
	        System.out.print("Enter value for c: ");
	        int c = scanner.nextInt();
	        System.out.print("Enter value for d: ");
	        int d = scanner.nextInt();
	        
	        int sumAB = a + b;
	        int sumCD = c + d;

	        // Check if sum of a and b is greater than sum of c and d
	        if (sumAB > sumCD) {
	            System.out.println("The sum of a and b is greater than the sum of c and d.");
	        } else {
	            System.out.println("The sum of a and b is not greater than the sum of c and d.");
	        }
	        scanner.close();
		}


}
