package javasessions;

public class ConditionalStatements_12142023 {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		System.out.println(x > y);

		if (x > y) {
			System.out.println("pass");
		} else {
			System.out.println("Fail");
		}

		//
		if (true) {
			System.out.println("pass");

		} else
			System.out.println("Fail");

		//
		boolean flag = false;
		if (flag) {
			System.out.println("pass");

		} else {
			System.out.println("Fail");
		}

		//
		int t1 = 100;
		int t2 = 100;
		if (t1 >= t2) {
			System.out.println("t1 and t2 are gr then or equal");
		}

		//
		int p1 = 100;
		int p2 = 200;
		if (p1 != p2) {
			System.out.println("selenium");
		}

		/*
		 * // String browser = "opera"; 
		 * if(browser.equals("chrome")) {
		 * System.out.println("lauch chrome browser"); 
		 * } if(browser.equals("firefox")) {
		 * System.out.println("Lauch firefox browser"); } if(browser.equals("edge")) {
		 * System.out.println("Launch edge browser"); } else {
		 * System.out.println("lanuch right browser"); }
		 */

		String browser = "edge";
		
		if (browser.equals("Chrome")) {
			System.out.println("Launch chrome browser");
		} else if (browser.equals("firefox")) {
			System.out.println("Launch safari browser");
		} else if (browser.equals("firefox")) {
			System.out.println("Launch firefox browser");
		} else if (browser.equals("edge")) {
			System.out.println("Launch edge browser");
		} else {
			System.out.println("Launch correct browser");
		}
		
		
		
		
		
		

	}

}
