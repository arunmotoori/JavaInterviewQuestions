package opack;

public class InstanceMethodDemo {
	
	static int a = 10;
	int b = 20;
	
	public static void sampleOne() {
		
		//static method can only access static stuff directly
		System.out.println(a);
		sampleFour();
		InstanceMethodDemo id = new InstanceMethodDemo();
		System.out.println(id.b);
		id.sampleTwo();
		
	}
	
	public void sampleTwo() {
		
		//instance methods can access both static and non-static stuff directly
		System.out.println(a);
		sampleOne();
		System.out.println(b);
		sampleThree();
		
	}
	
	public void sampleThree() {
		
		
	}
	
	public static void sampleFour() {
		
		
	}

}
