package opack;

public class LocalGlobalSameNameDemo {
	
	static int a = 10; // Global Variable
	
	public static void main(String[] args) {
		
		int a = 20;  // Local Variable
		System.out.println(a);
		
	}

}
