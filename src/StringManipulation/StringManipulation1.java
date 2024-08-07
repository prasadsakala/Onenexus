package StringManipulation;

public class StringManipulation1 {

	public static void main(String[] args) {
		
		String str = "This is important for eating";    
			
		////Length = 28
		//Highest Index = Length -1 = 28-1 = 27
		//List Index = 0
		
		System.out.println("String Length is: " + str.length());  // String Length 28
		System.out.println("Hightest Index : " + (str.length()-1)); // String Index Length 28-1 = 27
		System.out.println(str.charAt(0));  //T  //
		System.out.println(str.indexOf("T")); //0
		
		}
}
