package Webdriver_Arch;

import javasessions.SwitchCaseConcept;

public class AmazonTest {
	
	 //static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//SafariDriver driver = new SafariDriver();
		
		String browser = "safarI";
		
		WebDriver driver = null;
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
				driver = new ChromeDriver();			
			break;
		case "firefox":
			driver = new FirefoxDriver();			
		break;
		case "safari":
			driver = new SafariDriver();			
		break;
		default:
			System.out.println("pelease pass the right browser");
			break;
		}
	
		
		driver.get("https://www.amazon.com");
	
		String title = driver.gettitle();
		System.out.println("title: " + title);
		
		if (title.equals("amazon")) {
			System.out.println("Title is passed");
		}
		else {
			System.out.println("Title is Failed");
		}
		
		String url = driver.geturl();
		System.out.println("URL : " + url);
		
		driver.findelement("logo");
		
				
		
		
		driver.sendkey("username", "durga");
		driver.sendkey("password", "dura.sakala@fda.hhs.gov");
		
		driver.click("loginbutton");
		
		driver.close();

	}

}
