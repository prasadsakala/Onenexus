package arrays;

import java.util.Arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {

//Scenario 1. using new keyword
		
		System.out.println("scenairo1");
		int i[] = new int[5]; //5-1=4
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println(i[4]);
		
		
		
		//Scenario 2. array.tosting
		System.out.println("scenario 2");
		System.out.println(Arrays.toString(i));
		
		
		//Scenario 3. Print the values from arry : for loop
		
		System.out.println("*********Scenario 3.  Print the values from arry : for loop");
		
		for(int r=0;r<i.length;r++) {
			System.out.println(i[r]);
			if(i[r] == 20) {
				System.out.println("hi");
				//break;
			}
			System.out.println("Bye");
		}
		
			
		//Scenario 4. Length
		
				System.out.println("*********Scenario 4.  Length");
				
				System.out.println(i.length); //
				
		//Scenario 5 : short		
				
				System.out.println("Scenario 5 : short");
		
				short sh[] = new short[5];   // 0 to 3		
					System.out.println("Length= " + sh.length);  //Length
					System.out.println("Lowest Index = " + 0);
					System.out.println("HIghest Index = " + (sh.length-1));
					System.out.println(Arrays.toString(sh));  //by defualt it will take zero
					
					sh[0] = 10;
					System.out.println(sh[0]);
					System.out.println(Arrays.toString(sh));
					sh[2] = 20;
					System.out.println(sh[2]);
					System.out.println(Arrays.toString(sh));
				
					sh[4] = 40;
					System.out.println(Arrays.toString(sh));
					sh[3] = 30;
					System.out.println(Arrays.toString(sh));
					
					System.out.println("****************");
					
					for(short r1=0;r1<sh.length;r1++) {
						System.out.println(sh[r1]);
					}
					
					char ch[] = new char[4];
					ch[2] = 'A';
					ch[0] = 'b';
					ch[1] = 'c';
					ch[3] = 65;
					
					System.out.println(Arrays.toString(ch));
					
					//char for loop**********#################******
					System.out.println("char for loop******###########*****");
					for(char h=0;h<ch.length;h++) {
						System.out.println(ch[h]);
						
					}
					
					
					System.out.println("float arrya&&&&&&&&&&&&&&&&");
					float fl[] = new float[3]; //0-3 = 2
					
					fl[0] = 2.2f;
					fl[1] = 2.2f;
					fl[2] = 2.3f;
					
					for(int l=0;l<fl.length;l++) {
						System.out.println(fl[l]);
					}
					
				
		// object array
					System.out.println("Scenaro 6 : object array");
					Object obj[] = new Object[5];
					obj[0] = "durga";
					obj[1] = 30;
					obj[2] = 'M';
					obj[3] = true;
					
					System.out.println(Arrays.toString(obj));
					System.out.println(obj.length);
					
					for(int row=0; row<obj.length; row++) {
						System.out.println(obj[row]);
					}
					
		//String Array
					
					System.out.println("#########################################String Array");
					
					String product[] = new String[3];
					product[0] = "iphone-14";
					product[1] = "MacBook";
					product[2] = "ipad-Air";
					
					for(int row=0; row<product.length; row++) {
						System.out.println(product[row]);
						if(product[row].equals("ipad-Air")){
							System.out.println("outofstock");
						}
					}
					
					
					for (int row1=product.length-1; row1>=0; row1--) {
						System.out.println(product[row1]);
					}
							
							
							
					
					
		//Scenario 3. /* 
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		//at arrays.SingleDimensionalArray.main(SingleDimensionalArray.java:31)

				System.out.println("scenairo3");
				int j[] = new int[4]; // 4-1=3
				j[0] = 10;
				j[1] = 20;
				j[2] = 30;
				j[3] = 40;
		//		j[4] = 50;
				
				System.out.println(j[0]);  //0 index
				System.out.println(j[1]);  //1 index
				System.out.println(j[2]);  //2 index
				System.out.println(j[3]);  //3 index
			//	System.out.println(j[4]);  //4 index  //Index 4 out of bounds for length 4
				
			
		
//Scenario 4. /* 	
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		System.out.println("scenairo4");
		int k[] = new int[5]; //5-1 = 4
		k[0] = 10;
		k[1] = 20;
		k[2] = 30;
		k[3] = 40;
		k[4] = 50;
		
		System.out.println(i.length);
		System.out.println(k[0]);  //0 index
		System.out.println(k[1]);  //1 index
		System.out.println(k[2]);  //2 index
		System.out.println(k[3]);  //3 index
		System.out.println(k[4]);  //4 index
	//	System.out.println(k[5]);  //5 index  // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
		
		
		
	}

}
