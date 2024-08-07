package CollectionHYR;

import java.util.*;

public class VectorPractice {

	public static void main(String[] args) {
	//size : number of elements present in list
	//capacity : Array capacity
	//Vector : 10,20,40,80...... array capacity

		//scenario 1
		Vector v1= new Vector();
		v1.add("Ravi0");
		v1.add("Ravi1");
		v1.add("Ravi2");
		v1.add("Ravi3");
		v1.add("Ravi4");
		v1.add("Ravi5");
		v1.add("Ravi6");
		v1.add("Ravi7");
		v1.add("Ravi8");
		v1.add("Ravi9");
		v1.add("Ravi10");
		v1.add("Ravi10");  // allowed duplicate values

		System.out.println(v1);
		System.out.println("array size: " + v1.size());
		System.out.println("array Capacity: " + v1.capacity());
		
		//scenario 2
		Vector v2= new Vector();
		v2.add("Ravi");
		v2.add("2");
		v2.add("3");
		v2.add("4");
		v2.add("5");
		v2.add("6");
		v2.add("7");
		v2.add("8");
		v2.add("9");
		v2.add(1, "10");
		v2.add(2, "11");
		System.out.println(v2);
		
		
		System.out.println("***********************************");
		//scenario 3
		
		Vector v3= new Vector();
		v3.add("Ravi0");
		v3.add("Ravi1");
		v3.add("Ravi2");
		
		Vector v4= new Vector();
		v4.add("ramesh0");
		v4.add("ramesh1");
		v4.add("ramesh2");
	/*	
		System.out.println(v3);
		for(int i=0;i<v4.size();i++) {
			v3.add(v4.get(i));

		}
		System.out.println(v3);
	*/	
		//or
		
	//	v3.addAll(v4);
	//	System.out.println(v3);
		
		v3.addAll(2,v4);
		System.out.println(v3);
		
		//retrival
		v3.get(2);
		System.out.println(v3);
		
		//remove
		v3.remove("ramesh0");
		System.out.println(v3);		
	}

}
