package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.PredefinedActions;

public class LoginPage extends PredefinedActions{

	public void login(String username, String password) {
		enterUserName(username);
		enterPassword(password);
		clickLoginButton();
	}
	
	public void enterUserName(String username) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}
	
	public void clickLoginButton() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public boolean isUsernameErrorMessageDisplayed() {
		return driver.findElement(By.id("txtUsername-error")).isDisplayed();
	}
	
	public boolean isPasswordErrorMessageDisplayed() {
		return driver.findElement(By.id("txtPassword-error")).isDisplayed();
	}
	
	public boolean isLogoDisplayed() {
		return driver.findElement(By.cssSelector("div.organization-logo shadow>img")).isDisplayed();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
}
