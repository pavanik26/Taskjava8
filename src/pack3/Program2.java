package pack3;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

        // Read four variables from user input
        System.out.print("Enter an Integer ");
        int number = scanner.nextInt();
        

        // Check if sum of a and b is greater than sum of c and d
        if (number %2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        scanner.close();
	}

}
