package TestNG_package;

import org.testng.annotations.Test;

public class testngpriorityintroproj1 {
	@Test(priority=0)
	public void firsttestcase(){
		System.out.println("this is my first test case");
	}
	@Test(priority=2)
	public void secondtestcase() {
		System.out.println("this is my second test case");
		
	}
	@Test(priority=1)
	public void thirdtestcase() {
		System.out.println("this is my third test case");
	}
	@Test(priority=3)
	public void fourthclass() {
		System.out.println("this is my fourth test case");
	}

}
