package jpack;

public class OverloadingMainDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Inside main method");
		main(9);
		main(6.5);
		
	}
	
	public static void main(int a) {
		
		System.out.println("Inside overloaded main method "+a);
		
	}
	
	public static void main(double b) {
		
		System.out.println("Inside second overloaded main method "+b);
		
	}

}
