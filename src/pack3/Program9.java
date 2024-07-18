package pack3;

import java.util.Scanner;

public class Program9 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

        // Read age from user input
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        // Check if sum of a and b is greater than sum of c and d
        if (age >= 60) {
            System.out.println("Person is senior citizen.");
        } else {
            System.out.println("Person is not senior citizen.");
        }
        scanner.close();
	}


}
