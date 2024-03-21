package TestNG_package;

import org.testng.annotations.Test;

public class testng_dependsonmethods_proj1 {
	@Test(enabled=true)
	public void highschool() {
		System.out.println("high school");
	}
	
	@Test(dependsOnMethods="highschool")
	public void highersecondary() {
		System.out.println("highersecondary");
	}
	@Test(dependsOnMethods="highersecondary")
	public void college() {
		
		System.out.println("college");
	}
}

