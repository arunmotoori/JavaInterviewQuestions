package jpack;

import java.util.Scanner;

public class DifferentInputScannerDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any sentance:");
		String userInputOne = scanner.nextLine();
		
		  System.out.println(userInputOne);
		  System.out.println("Enter your favourite color:"); String userInputTwo =
		  scanner.next();
		  System.out.println("Favourite color of the User is: "+userInputTwo);
		 
		System.out.println("Enter your favourite number:"); int userInputThree =
		scanner.nextInt();
		System.out.println("Favourite number of the User is: "+userInputThree);
		System.out.println("You like Milk? Type true or false:");
		boolean userInputFour = scanner.nextBoolean();
		if(userInputFour) {
			System.out.println("User like milk");
		}else {
			System.out.println("User doesn't like milk");
		}
		System.out.println("What is the milage of your car?");
		double userInputFive = scanner.nextDouble();
		System.out.println("Milage of the Users car is "+userInputFive);
		scanner.close();

	}

}
