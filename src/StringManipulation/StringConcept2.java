package StringManipulation;

public class StringConcept2 {

	public static void main(String[] args) {
		String str = "This is important for eating"; 
		
		System.out.println("i 1st occrance:  " + str.indexOf("i"));  //3
	//	System.out.println(str.indexOf("i", 3)); // manual 2nd Occurance
		System.out.println("i 2nd occrance:  " + str.indexOf("i", str.indexOf("i")+1)); //automate 2nd Occurance  ====5
		System.out.println("i 3rd occrance:  " +str.indexOf("i", str.indexOf("i", str.indexOf("i")+1)+1));  // 3rd occurance === 8
		System.out.println("i 4th occrance:  " +str.indexOf("i", str.indexOf("i", str.indexOf("i", str.indexOf("i")+1)+1)+1));  //4th occurance===25
		
		
		
	}

}
