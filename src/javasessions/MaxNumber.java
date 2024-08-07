package javasessions;

public class MaxNumber {

	public static void main(String[] args) {
		 int a = 500;
		 int b = 200;
		 int c = 300;

		 if (a>b && a>c) {
			 System.out.println("a is the greatest");
		 }else if (b>c) {
			 System.out.println("b is the greatest");
		 }else 
			 System.out.println("c is the greatest");
		 
		 //
		 
		 int a1 = 500;
		 int b1 = 200;
		 int c1 = 300;
		 int d1 = 300;
		 
		 if(a1>b1 && a1>c1 && a1>d1) {
			 System.out.println("a1 is greater");
		 }else if(b1>c1 && c1>d1) {
			 System.out.println("b1 is greater");
		 }else if (c1>d1) {
			 System.out.println("c1 is the greater");
		 }else 
			 System.out.println("d1 is the greater");
		 
		 //
		 int marks = 85;
		 if (marks <=100) {
			 if (marks >=80 && marks<=90) {
				 System.out.println("Grade A");
			 }
			 else 
				 System.out.println("grade b");
		 }
	}

}
