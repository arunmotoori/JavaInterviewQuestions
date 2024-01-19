package jpack;

import java.util.Scanner;

public class NextNextLineDifference {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter some sentance:");
		String userInput = scanner.nextLine();
		System.out.println(userInput);
		System.out.println("Enter another sentance:");
		String userInputTwo = scanner.next();
		System.out.println(userInputTwo);
		scanner.close();
	}

}
