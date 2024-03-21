package TestNG_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testng_browertimetaken_proj1 {
	public class tesng {
		WebDriver driver;
		long starttime;
		long endtime;
		long totaltime;
		
		@BeforeSuite
		public void launchbrowser() {
			 starttime =System.currentTimeMillis();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwvi\\OneDrive\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			 chromeOptions.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(chromeOptions);
			
		}
		@Test
		public void opengoogle() {
			
			driver.get("https://www.google.com/");
			
			
		 }
		@Test
	 public void openbing() {
		
			driver.get("https://www.bing.com/");
			
		 }
		@Test
	 public void openyahoo() {
			
			driver.get("https://www.yahoo.com/");
			
			
	}
	    @AfterSuite
		public void closebrowser() {
	    	
	    	driver.quit();
	    	endtime=System.currentTimeMillis();
			 totaltime=endtime-starttime;
			System.out.println(totaltime);
			
	}
	}
}
