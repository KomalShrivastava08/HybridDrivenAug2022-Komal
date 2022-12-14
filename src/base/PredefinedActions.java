package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PredefinedActions {
	protected static WebDriver driver;
	
	final static public WebDriver start(String url) {
		System.setProperty("webdriver.chrome.driver",".//drivers/chromedriver_106.exe" );
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void closeBrowser() {
		driver.close();
	}
}