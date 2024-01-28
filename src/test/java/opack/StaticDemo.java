package opack;

public class StaticDemo {
	
	int a = 10;
	
	public static void sample() {
		
		StaticDemo sd = new StaticDemo();
		System.out.println(sd.a);
		sd.demo();
		
	}
	
	public void demo() {
		
		System.out.println("Inside demo");
		
	}

}
