package TestNG_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class assertion {
	
	public class assert2 {
		WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	       
			System.setProperty("webdriver.chrome.driver","C:\\Users\\wwwvi\\OneDrive\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
	        ChromeOptions chromeOptions = new ChromeOptions();
	    	 chromeOptions.addArguments("--remote-allow-origins=*");
	    	 driver=new ChromeDriver(chromeOptions);
	    }
		
			@Test
			public void testAssertFunctions() {
				
				driver.get("https://www.browserstack.com/");
				String ActualTitle = driver.getTitle();
				System.out.println(ActualTitle);

			String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
				Assert.assertEquals(ExpectedTitle, ActualTitle);
				boolean v1=true;
				System.out.println(v1);
				String Expected = "Most Reliable App & Cross Browser";
				Assert.assertNotEquals(ActualTitle, Expected);
				

				
			}
			}

}
