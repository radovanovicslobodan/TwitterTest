package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectModel {
	public WebDriver driver;
	public WebDriverWait wait;
	
	public PageObjectModel(WebDriver driver) {
		this.driver = driver;
		
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}
}