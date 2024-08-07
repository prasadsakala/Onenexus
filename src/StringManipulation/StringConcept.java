package StringManipulation;

public class StringConcept {

	public static void main(java.lang.String[] args) {
		
		String str = "helow This is my java code and i am so happy i";
		
		
		
		System.out.println(str.length());
		
		//Li = 0
		//Hi = 37
		//len = Hi + 1 = 38
		//hi= len-1
	
	//	System.out.println(str.charAt(38)); //String index out of range: 38
		
	//	System.out.println(str.charAt(-1));  //String index out of range: -1
		
		System.out.println(str.indexOf("T")); 
		System.out.println(str.indexOf("i")); //1st occurance of i
				
		System.out.println(str.indexOf("i", str.indexOf("i")+1)); //2nd occurance of i
		

		
		System.out.println(str.indexOf("i", str.indexOf("i", str.indexOf("i")+1)+1));
		
		System.out.println(str.indexOf("i", str.indexOf("i", str.indexOf("i", str.indexOf("i")+1)+1)+1));
		
		
		System.out.println("**************");
		String msg = "this is my java code";
		
		System.out.println(msg.indexOf("java")); //11
		System.out.println(msg.indexOf("pyton"));
		
		String m = "Welcome ssss";
		
		if (m.indexOf("admin") == 8) {
			System.out.println("correct message");
		}
		else {
			System.out.println("incorret message");
		}
			if(m.indexOf("admin") == -1) {
				System.out.println("incorrect msg - fail");
			
		}
			
			System.out.println("*********trim**********");
			String test = " helooo world  ";
			System.out.println(test.trim());
			
			String dob = "01-01-1990";
			System.out.println(dob.replace("-", "/"));
			
			String top = " helooo world  ";
			System.out.println(top.replace(" ", ""));
			
			System.out.println(top.replaceAll(" ", ""));
			
			String mg = "python ruby seleinum";
			System.out.println(mg.replace("python", "java"));
			System.out.println(mg.replaceAll("python", "JAVA"));
			

	}

}
