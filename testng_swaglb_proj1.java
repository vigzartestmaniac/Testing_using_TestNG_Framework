package TestNG_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testng_swaglb_proj1 {
	WebDriver driver;
	
	@BeforeSuite
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwvi\\OneDrive\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(chromeOptions);
	}
		
	
	@Test(priority=1)
	public void login() throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement user=driver.findElement(By.id("user-name"));
		user.click();
		user.sendKeys("standard_user");
		Thread.sleep(2000);
		
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pass.click();
		pass.sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void add_to_cart() throws InterruptedException {
		WebElement prodselect=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
		prodselect.click();
		Thread.sleep(2000);
		
		WebElement addcart=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		addcart.click();
		Thread.sleep(2000);
		
		WebElement cart=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		cart.click();
		Thread.sleep(2000);
		
		WebElement checkout=driver.findElement(By.id("checkout"));
		checkout.click();
		Thread.sleep(2000);
		
		WebElement checkinfofname=driver.findElement(By.id("first-name"));
		checkinfofname.click();
		checkinfofname.sendKeys("vignesh");
		Thread.sleep(2000);
		
		WebElement checkinfolname=driver.findElement(By.id("last-name"));
		checkinfolname.click();
		checkinfolname.sendKeys("vs");
		Thread.sleep(2000);
		
		WebElement checkinfozip=driver.findElement(By.id("postal-code"));
		checkinfozip.click();
		checkinfozip.sendKeys("695028");
		Thread.sleep(2000);
		
		WebElement checkinfocont=driver.findElement(By.xpath("//*[@id=\"continue\"]"));
		checkinfocont.click();
		Thread.sleep(2000);
		
		WebElement finish=driver.findElement(By.xpath("//*[@id=\"finish\"]"));
		finish.click();
		Thread.sleep(2000);
		
		WebElement backhome=driver.findElement(By.xpath("//*[@id=\"back-to-products\"]"));
		backhome.click();
		Thread.sleep(2000);
		
	}
	@AfterSuite
	public void close_browser() {
		driver.quit();
	}
	}


