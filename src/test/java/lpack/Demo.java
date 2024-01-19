package lpack;

public class Demo {

	public static void main(String[] args) {
		
		ClassOne cOne = new ClassOne();
		System.out.println(cOne.a);
		System.out.println(cOne.b);
		cOne.sampleOne();
		
		ClassTwo cTwo = new ClassTwo();
		System.out.println(cTwo.c);
		cTwo.sampleTwo();
		System.out.println(cTwo.a);
		System.out.println(cTwo.b);
		cTwo.sampleOne();
		
		
	}

}
