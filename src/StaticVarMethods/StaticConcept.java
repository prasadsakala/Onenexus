package StaticVarMethods;

public class StaticConcept {
	
	static String name;
	int price;
	
	//static method
	public static void getstaticname() {
		System.out.println("get static name");
	}
	
	//non-static method
	
	public void getnonstaticname() {
		System.out.println("get non static name");
	}
	
	public static void main(String[] args) {
		
		//static method called by class name
		
		//how to call static variable nam
		
		String name = StaticConcept.name = "prasad";
		System.out.println("static name is: " + name);
		
		
		//non static method called by object name
		//how to call non static variable
		// call by object name
		
		StaticConcept obj = new StaticConcept();
		int pri = obj.price = 10;
		System.out.println("price is :" + pri);
		obj.getnonstaticname();
		
		
		
		

	}

}
