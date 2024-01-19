package npack;

import java.util.Scanner;

public class DivisibleProgram {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = scanner.nextInt();
		
		divisibleBy2And3(n);
		
		scanner.close();

	}
	
	public static void divisibleBy2And3(int num) {
		
		if(num%2==0 && num%3==0) {
			
			System.out.println("Given number is divisible by both 2 and 3");
			
		}else {
			
			System.out.println("Given number is not divisible by 2 or 3");
			
		}
		
	}

}
