package qpack;

public class DemoC {

	public static void main(String[] args) {
		
		Car hamz = new Car();
		
		hamz.company = "Honda";
		hamz.model = "Amaze";
		hamz.price = 900000;
		hamz.milage = 14.37;
		hamz.color = "Grey";
		
		hamz.startCar();
		hamz.stopCar();
		hamz.carDetails();
		
		Car hyi20 = new Car();
		
		hyi20.company = "Hyundai";
		hyi20.model = "i20";
		hyi20.price = 1200000;
		hyi20.milage = 11.45;
		hyi20.color = "White";
		
		hyi20.startCar();
		hyi20.stopCar();
		hyi20.carDetails();
		
		

	}

}
