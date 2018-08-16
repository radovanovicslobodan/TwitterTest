package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProfilePage extends PageObjectModel {

	@FindBy(css = ".ProfileSidebar .ProfileHeaderCard h1 a")
	WebElement username;
	
	public ProfilePage(WebDriver driver) {
		super(driver);
	}

	public WebElement getUsername() {
		wait.until(ExpectedConditions.visibilityOf(username));
		return username;
	}
}
