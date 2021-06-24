package Activity;

public class Car {
	
	String Color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	Car(){
		tyres=4;
		doors=4;
	}
	public void displayCharacteristics() {
		
		System.out.println("The transmission of car is "+ transmission);
		System.out.println("The color of car is "+ Color);
		System.out.println("Make of car is "+ make);
		System.out.println("Number of tyres of car is "+ tyres);
		System.out.println("Number of doors of car is "+ doors);
	}

   public  void accelarate() {
		
		System.out.println("The Car is moving");
	}
   
   public  void brake() {
		
		System.out.println("The Car has stopped");
	}
}
