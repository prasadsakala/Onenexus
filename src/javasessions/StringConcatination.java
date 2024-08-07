package javasessions;

public class StringConcatination {

	public static void main(String[] args) {
		
		//String - Class in JAVA
		String s = "hellow world";
		String s1 = "100";
		String s2 =  "s";
		
		String x = "Hellow";
		String y = "Selenium";
		
		int a = 100;
		int b= 200;
		
		System.out.println(a+b);     //300
		System.out.println(x+y);     //hellow selinium
		System.out.println(x+a);     //hellow100
		System.out.println(a+b+x+y); //300hellowselenium
		System.out.println(x+y+a+b); //hellowselenium100200
		System.out.println(x+y+a+b+x+y); //hellowselenium100200hellowselinium
		
		

	}

}
