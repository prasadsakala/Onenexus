package CallByReference;

public class CallByRef {
	public String name;
	int age;
	public int sal;
	
	public  void getinfo() {
		//name = "test";
		System.out.println(name);
		
	}

	public static void main(String[] args) {
		CallByRef ref = new CallByRef();
		ref.age = 45;
		ref.sal = 343;
		
		ref.getinfo();
		
	}

}
