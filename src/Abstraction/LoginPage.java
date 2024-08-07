package Abstraction;

public class LoginPage extends Page {

	@Override
	public void title() {
		System.out.println("LP------Title");
	}

	@Override
	public void url() {
		System.out.println("LP------URL");
	}
		
	@Override
	public void pageLoadingTime() {
		System.out.println("Page-------loading timeout 5 secs");
	}
	
	public void doLogin(String un, String pwd) {
		
		System.out.println("login with: " + un + " " + pwd);
	}
}
