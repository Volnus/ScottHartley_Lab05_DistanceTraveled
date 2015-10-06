import java.util.Scanner;

public class SHartley_Lab05_DistanceTraveled {
	public static void main(String[] args) 
	{
	// Declare Strings
	double mph, hours;
		
	// Declare Scanner
	Scanner keyboard = new Scanner (System.in);
	
	// Ask How Many Hours They Traveled For
		System.out.println("How Many Hours Did You Travel? ");
		hours = keyboard.nextDouble();
		
		// Setup Loop If Number Is Less Than 1
		while (hours < 1) {
			System.out.println("Your number has to be greater than 1");
			
			// Ask How Many Hours They Traveled For
			System.out.println("How Many Hours Did You Travel? ");
			hours = keyboard.nextDouble();
		}

	// Ask How Fast They Were Traveling
		System.out.println("How Fast Were You Travelling? ");
		mph = keyboard.nextDouble();
				
		// Setup Loop If Number Is Negative
		while (mph < 0) {
			System.out.println("Your number has to be a positive");
			
			System.out.println("Please enter a positive number");
			mph = keyboard.nextDouble();
		}

	// Calculate speed
		System.out.println("Your Distance Travelled Was: " + (mph*hours));

		keyboard.close();
	}
}
