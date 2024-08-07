package arrays;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

			ArrayList ar = new ArrayList();
			
			ar.add(100); //0
			ar.add(200); //1
			
			System.out.println(ar.size());	
			
			
			
			
		ArrayList<Integer> Markslist = new ArrayList<Integer>();	
		
		Markslist.add(100);
		Markslist.add(200);
		
		//empnames
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("Name");
		str.add("age");
		str.add("sex");
		
		System.out.println(str);
		System.out.println(str.size());
		
		
		ArrayList<Object> emp = new ArrayList<Object>();
		emp.add("durga");
		emp.add(45);
		emp.add('M');
		emp.add(true);
		
		System.out.println(emp);
		
		
		

		
		}

}
