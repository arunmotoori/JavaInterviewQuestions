package qpack;

public class ClassG {
	
	int b = 20; // Instance Global Variable
	static int c = 30; // Static Global Variable
	
	public void sampleOne() {
		
		int a = 10; // Local Variable 
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public void sampleTwo() {
		
		System.out.println(b);
		
	}

}
