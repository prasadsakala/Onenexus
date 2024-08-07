package arrays;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {
		
		System.out.println("*************INT***********");

		int i[] = {10, 20, 30, 40}; //4-1 = 3
		
		System.out.println(i.length);
		System.out.println(Arrays.toString(i));
		
		for(int ind=0; ind<i.length; ind++) {
			System.out.println(i[ind]);
		}
		
		System.out.println("*************char***********");

		
		char ch[] = {'a', 'b', 'c', 'd'};
		
		System.out.println(Arrays.toString(ch));
		System.out.println(ch.length);
		
		for(int row1=0; row1<ch.length; row1++ ) {
			System.out.println(ch[row1]);
		}
		
		System.out.println("*************string***********");
		
		String str[] = {"DURGA", "PRASAD", "SAKALA"};
		
		System.out.println(Arrays.toString(str));
		
		for(int row1=0; row1<str.length; row1++) {
			System.out.print(str[row1] + " ");
		}
		System.out.println();
		
		System.out.println("******************byte*****************");
		
		Byte by[] = {'7', '8'};
		System.out.println (Arrays.toString(by));
		for(int row3=0; row3<by.length; row3++) {
			System.out.println(by[row3]);
		}
		System.out.println(by.length);
		for(int row3=by.length-1; row3>0; row3--) {
			System.out.println(by[row3]);
			
		}
		
		System.out.println("*******************boolean**************");
		
		
		
	
	}
}

