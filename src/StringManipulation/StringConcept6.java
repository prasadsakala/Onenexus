package StringManipulation;

public class StringConcept6 {

	public static void main(String[] args) {
		
		//split method always give the string array 
		String pop = "javascript;java;python;ruby";
		
		String p[] = pop.split(";");  //Split string array
		
		System.out.println(p.length);
		System.out.println(p[0]);  //javascript
		System.out.println(p[1]);  //java
		System.out.println(p[2]);  //python
		System.out.println(p[3]);  //ruby
		
		System.out.println("*******************************************");
		
		String rest = "xXHellowSeliniumxxXPythonXxXAutomationXxXLabs";
		String rs[] = rest.split("xX");
		System.out.println(rs[0].length());
		System.out.println(rs[0]);
		System.out.println(rs[1]);
		System.out.println(rs[2]);
		System.out.println(rs[3]);
		System.out.println(rs[4]);
		
		System.out.println("*******************************************");
		
		String empdata = "durga;prasad;40;Virginia;AshbyOakct";
		
		String empdata1 = empdata.replace(";", "||");
		System.out.println(empdata1);
		String emp[] = empdata1.split("\\|\\|");
		System.out.println(emp[0]);
		System.out.println(emp[1]);
		System.out.println(emp[2]);
		System.out.println(emp[3]);




		
		

		
		
		
		
		
	}
}
