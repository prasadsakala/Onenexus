package Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		
		Car.carshow();
		BMW.carshow();
		
		Car.loadcar();
		
		
		BMW b = new BMW();
		b.start();  //overridden
		b.stop();   //inherited
		b.refuel(); // inherited
		b.auotparking(); //individual
		b.engine(); // inherited
		
		Car.loadcar();
		b.loadcar();
		
		System.out.println("_____________________");
		
		
		
		//parent class
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();//inherited
		
	
		
		System.out.println("---------------");
		Audi au =new Audi();
		au.start(); //Inherited
		au.stop(); //Inherited
		au.refuel(); //Inherited
		au.thefsafety(); //individual
		au.engine(); //overridden.
		
		System.out.println("----------------");
		Truck tr = new Truck();
		tr.loading();
		
		
		
		System.out.println(Car.price);
		System.out.println(BMW.price);
		
		
	}

}

