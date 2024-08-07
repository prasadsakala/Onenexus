package Inheritance;

public class Car extends Vehicle {
	
	int maxspeed = 1000;
	
	static int price = 1000;
	
	public void start() {
		System.out.println("Car ----- Start");
	}
	
	public void stop() {
		System.out.println("Car ---- Stop");
	}
	
	public void refuel() {
		System.out.println("Car ---- refuel");
	}
	
	public static void carshow() {
		System.out.println("car-------------display method");
	}
	
	private void show() {
		System.out.println("car---------cycle");
	}
	
	public static final void loadcar() {
		System.out.println("car---------loadcar");
		
	}

}
