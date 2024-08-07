package Webdriver_Arch;

public class FirefoxDriver implements WebDriver{
	
	public FirefoxDriver() {
		System.out.println("chrome is launched");
	}

	@Override
	public void findelement(String elename) {
		System.out.println("find element" + elename);
	}

	@Override
	public void findelements() {
		System.out.println("find elements on the page");
	}

	@Override
	public void get(String url) {
		System.out.println("Launch URL" + url);
	}

	@Override
	public String gettitle() {
		return "amazon";
	}

	@Override
	public String geturl() {
		return "https://www.amazon.com";
	}

	@Override
	public void click(String elenanme) {
		System.out.println("click an element" + elenanme);		
	}

	@Override
	public void sendkey(String elename, String value) {
		System.out.println("entering value in " + elename + "value" + value);
	}

	@Override
	public void close() {
		System.out.println("Browser closed");
	}


}
