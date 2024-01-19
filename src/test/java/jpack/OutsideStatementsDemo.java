package jpack;

public class OutsideStatementsDemo {
	
	int a;
	
	
	public static void main(String[] args) {
		
		System.out.println("Inside main method");
		System.out.println("Inside Class");
		
	}
	
	public void sampleOne() {
		
		a = 5;
		int b = a + 6;
		System.out.println("Inside sampleOne method");
		
	}

}
