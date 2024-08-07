package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsJava {

	private static final ArrayList<String> UserList1 = null;

	//cann't create function/method inside a function
	//Methods are parallal to each other
	//but can call function to another function
	
	
	//1st function - no input and no return
	
	public void add() {
		int a=20;
		int b=20;
		int c = a+b;
		System.out.println(c);
	}
	//2nd functoin - some input and no return
	
	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
		
	}
	
	//3rd function - some input and return
	
	public int add1(int a, int b) {
		int c = a+b;
		return c;
	}
	
	//4th function ----no input and return
	
	public boolean add4 () {
		return true;
	}
	
	//Array
	public String[] getdevices() {
		String devices[] = {"apple", "macbood", "ipad"};
		return devices;
	}
	
	//array list
	public ArrayList<String> userslist() {
		ArrayList<String> UsersList1 = new ArrayList<String>();
		UsersList1.add("siva");
		UsersList1.add("hellow");
		return UsersList1;
	}
	
	public static void main(String[] args) {
		
		FunctionsJava obj1 = new FunctionsJava();
		obj1.add();
		
		obj1.add(2, 3);
		
		int d = obj1.add1(4, 5);
		System.out.println(d);
		
		int d1 = obj1.add1(5, 8);
		System.out.println(d1*8);
		
		if (obj1.add4()== true) {
			System.out.println(true);
			
		}
		
		String mydevices[] = obj1.getdevices();
		System.out.println(Arrays.toString(mydevices));
		
		ArrayList<String> mylist = obj1.userslist();
		System.out.println(mylist);
		System.out.println(mylist.size());
	}

}
