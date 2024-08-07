package StringManipulation;

public class StringConcept4 {

	public static void main(String[] args) {
		
		String str = "    hellow world     ";
		//remove space before and after
		System.out.println(str.trim());  //hellow world
		//replace spaces
		System.out.println(str.replace(" ", ""));
		//replace all
		System.out.println(str.replaceAll(" ", ""));
		
		//replace selenium instead of Java
		String str1 = "Java Ruby Python";
		System.out.println(str1.replace("Java", "Selenium")); //Selenium Ruby Python
		
		System.out.println(str1.replace(" ", "||"));  //Java||Ruby||Python
		
		}
}
