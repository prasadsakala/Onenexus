package Inheritance;

public class BMW extends Car{
	
	int maxspeed = 200;
	//static int price = 5000;
	
	//method overridding : poly+morphism (run time - dynamic binding)
	//When you have a method in parent class and the same method in child class also 
	//with the same method
	//with the same number of parameters - zero parameters
	//with same number of parameters
	//same type of parameters
	//same sequence of parameters
	//same return type
	
	@Override
	public void start() {
		System.out.println("BMW--------start");
	}
	

	
	
	public void auotparking() {
		
		System.out.println("BMW--------AUTOPARKING");
		
	}
	
	//Static method cann't be overridden
	//method hiding --
	public static void carshow() {
		System.out.println("BMW-------------display method");
	}
	
	
	
	
	
	

}
