import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
		// Ask the user to enter a number
		System.out.print("Please enter a number: ");
		int num = input.nextInt();
		input.nextLine();
		
		

		System.out.println("Number" + "     " + "Squared" + "     " + "Cubed");

		// For loop to create the table
		for (int i = 1; i <= num; i++) {
			System.out.println(i + "          " + (Math.pow(i, 2)) + "          " + (Math.pow(i, 3)));
		}
		System.out.println("Would you like to continue and test another number. If yes enter y or no enter n");
		System.out.print("Enter y or n: ");
		choice = input.nextLine();
		}
		System.out.print("Program terminated");
		
		input.close();
	}

}
