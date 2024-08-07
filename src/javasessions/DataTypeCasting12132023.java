package javasessions;

public class DataTypeCasting12132023 {

	public static void main(String[] args) {
		
		byte t = 100;
		int k = t;
	//	System.out.println(k);
		
		int p = 150;
		byte q = (byte)p;
	//	System.out.println(q); //-106   wrong data
		
	//	long l = p;
	//	System.out.println(l);
		
		long l1 = 1000;
		float f1 = l1;
	//	System.out.println(f1);
		
		//1. 
/*		
		float b = 12.85f;
		
		byte b1 = (byte)b;
		int a = (int)b;
		short s = (short)b;
		int i = (int)b;
		long l = (long)b;
		double d = b;
		float f = b;
		
		System.out.println(b1);
		System.out.println(a);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(d);
		System.out.println(f);
		
		*/
		
		
		float b = 34.56f;
		int i = (int)b;
		
		long l = 72750441;
		int i1 = (int)l;
		
		double f2= 3.3;
		int f3 = (int) f2;
		
		
		System.out.println(f3);
		

		

	}

}
