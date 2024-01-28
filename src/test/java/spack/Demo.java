package spack;

public class Demo {
	
	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.a = 10;
		System.out.println(s.a);
		s.methodOne();
		
	}
	
	public void nMethod() {
		
		Sample sOne = new Sample();
		sOne.a = 20;
		sOne.methodOne();
		
		
	}

}
