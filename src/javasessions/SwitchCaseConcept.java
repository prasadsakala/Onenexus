package javasessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		String browser = "   Chrome     ";

		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Launch chrome browser");
			break;
		case "firefox":
			System.out.println("Launch firefox browser");
			break;
		case "safari":
			System.out.println("Launch safari browser");
			break;
		case "edge":
			System.out.println("Launch edge browser");
			break;

		default:
			System.out.println("Launch right browser");
			break;
		}

		//
		int marks = 100;
		switch (marks) {
		case 100:
			System.out.println("a++");
			break;

		default:
			break;
		}

	}

}
