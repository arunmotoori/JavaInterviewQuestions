package upack;

public class DemoS {

	public static void main(String[] args) {
		
		ClassS cs = new ClassS();
		cs.b = 20;
		cs.sampleTwo();
		
		ClassS.a = 10;
		ClassS.sampleOne();

	}

}
