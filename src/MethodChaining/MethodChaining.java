package MethodChaining;

public class MethodChaining {
	
	//Non static method
	public static void m1() {
		System.out.println("Call m1 static  method");
		m2();
	}
	
	//Non static method
	public static void m2() {
		System.out.println("Call m2 static method");
		m3();
	}
	
	//Non static method
	public static void m3() {
		System.out.println("Call m3 static method");
		
		//	NS1();
	}
	//Static Method
	public void NS1() {
		System.out.println("Call NS1 nonstatic method");
		NS2();
	}
	//Static Method
	public void NS2() {
		System.out.println("Call NS2 nonstatic method");
		NS3();
	}
	//Static Method
	public void NS3() {
		System.out.println("Call NS3 nonstatic method");
		m1();
	}

	public static void main(String[] args) {
		
		MethodChaining.m1();
		
		MethodChaining NS = new MethodChaining();
		NS.NS1();
	}

}
