package Abstraction;

public abstract class Page {

	//We can not create the object of abstract class
	//We can have abs..methods and no abs..methods
	// no default methods allowed in abstract class.
	//abs class can have only non abs methods also.
		
	
	public abstract void title();
	public abstract void url();
				
	
	public void pageLoadingTime() {
		System.out.println("Page-------loading timeout 20sec");
	}
	
	//We can't override if it is static method
	public static void displaylogo() {
		System.out.println("Page----------display logo");
	}
	
	// final can't override, copy the child class with same final method. 
	public final void footers() {
		System.out.println("page-----------footers");
	}
}
