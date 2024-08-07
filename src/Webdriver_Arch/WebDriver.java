package Webdriver_Arch;

public interface WebDriver extends SearchContext {

		public void get(String url);
		public String gettitle();
		public String geturl();
		public void click(String elenanme);
		public void sendkey(String elename, String value);
		public void close();
		
		@Override
		public void findelement(String elename);
		
		@Override
		public void findelements();


		
}
