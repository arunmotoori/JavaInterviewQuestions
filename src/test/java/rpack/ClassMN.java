package rpack;

public class ClassMN {
	
	int a;
	int b;
	
	public void sampleOne() {
		
		System.out.println("Inside sampleOne");
		
	}
	
	public void sampleTwo() {
		
		System.out.println("Inside sampleTwo");
		
	}
	
	public void sampleThree() {
		
		ClassMN c = new ClassMN();
		c.a = 10;
		c.b = 20;
		c.sampleOne();
		c.sampleTwo();
		
		
	}

}
