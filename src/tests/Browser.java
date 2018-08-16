package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class Browser {
	
	static WebDriver driver;
	
	@BeforeSuite
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void clearCookies() {
		((ChromeDriver) driver).getLocalStorage().clear();
	}
	
	@AfterSuite
	public void afterClass() {
		driver.close();
	}

}