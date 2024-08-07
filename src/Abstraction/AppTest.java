package Abstraction;

public class AppTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.pageLoadingTime();
		lp.doLogin("admin", "admin");
		Page.displaylogo();
		lp.footers();
		System.out.println("------------------------------");
		
		//top casting:
// child class object can be reffered by parentabs..class ref variable
		Page pg =new LoginPage();
		pg.title();
		pg.url();
		pg.pageLoadingTime();
		pg.footers();
		pg.displaylogo();
		
		System.out.println("------------------------------");
		
		//downcasting : NA
		
	}

}
