package arrays;

public class ForEachLoop {

	public static void main(String[] args) {

			int i[] = {10, 20, 30, 40, 50};
			
			for(int ind=0; ind<i.length; ind++) {
				System.out.println(i[ind]);
			}
			
			System.out.println("*****int********for each******");
			
			
			for(int e : i) {
				System.out.println(e);
			}
			
			System.out.println("*****double********for each******");
			
			double arr[] = {1.23, 4.56};
			
			for(int ind1=0; ind1<arr.length; ind1++) {
				System.out.println(arr[ind1]);
				
			}
			
			for(double e : arr) {
				System.out.println(e);
				
			}
			
			System.out.println("*****string********for each******");
			
			String str[] = {"durga", "prasad"};
			
			for(String e : str) {
				System.out.println(e);
			}
			System.out.println("*****object********for each******");
			Object data[] = {"durga", 45, 'M'};
			
			for(Object e : data) {
				System.out.println(e);
			
				
			}
			
			System.out.println("reverse order");
			
			int num[] = {10, 20, 30, 40, 50};
			int count = num.length-1;
			for(int  e : num) {
				e=count;
				System.out.println(e +"----" + num[e]);
		

				count = count-1;
			}

			
			

		
	}

}
