package jpack;

import java.util.Scanner;

public class ScannerInputDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = scanner.nextLine();
		scanner.close();
		System.out.println("Welcome "+name);
		

	}

}
