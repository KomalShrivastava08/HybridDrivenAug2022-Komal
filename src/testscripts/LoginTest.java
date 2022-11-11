package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.PredefinedActions;
import pages.LoginPage;

public class LoginTest {

	WebDriver driver;
	
	@Test
	public void tc1() {
		System.out.println("Launch Broweser and load the URL");
		PredefinedActions.start("kshrivastava-trials77.orangehrmlive.com");
		
		LoginPage loginPage = new LoginPage();
		loginPage.login("admin", "Xl2ga9MMA@");
		
		String expectedTitle = "Employee Management";
		String actualTitle = loginPage.getPageTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle, "Expected Title was " + expectedTitle + " but Actual title is " + actualTitle);
		PredefinedActions.closeBrowser();
		
	}
}
