package qpack;

public class DemoS {
	
	SampleC sc = new SampleC();

	public static void main(String[] args) {
		
		DemoS ds = new DemoS();
		ds.mSample();

	}
	
	public void mSample() {
		
		System.out.println(sc.a);
		System.out.println(sc.b);
		sc.methodOne();
		sc.methodOne();
		
	}

}
