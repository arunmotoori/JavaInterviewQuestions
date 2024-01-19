package jpack;

public class UnreachableCodeDemo {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			
			break;
			
			//System.out.println(i);
			
		}
		
		System.out.println("End of this program");
		
	}

}
