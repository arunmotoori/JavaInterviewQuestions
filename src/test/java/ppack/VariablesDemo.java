package ppack;

public class VariablesDemo {
	
	static int b = 20; // static Global Variable
	int c = 30; // Instance Global Variable
	
	public void sampleOne() {
		
		int a = 10; // Local Variable
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public void sampleTwo() {
		
		//System.out.println(a);
		System.out.println(b);
		
	}
	
	public void sampleThree() {
		
		System.out.println(b);
	
	}

}
