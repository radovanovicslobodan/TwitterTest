package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObjectModel {
	
	@FindBy(className = "StaticLoggedOutHomePage-buttonLogin")
	WebElement loginBtn;
	
	@FindBy(css = ".js-username-field.email-input")
	WebElement loginEmail;
	
	@FindBy(css = ".js-password-field")
	WebElement loginPassword;
	
	@FindBy(css = "button[type='submit']")
	WebElement loginSubmitBtn;
	
	@FindBy(css = ".alert-messages .message")
	WebElement loginErrorMsg;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public WebElement getLoginEmail() {
		return loginEmail;
	}

	public WebElement getLoginPassword() {
		return loginPassword;
	}

	public WebElement getLoginSubmitBtn() {
		return loginSubmitBtn;
	}

	public WebElement getLoginErrorMsg() {
		return loginErrorMsg;
	}
	
	public void logMeIn(String email, String password) {
		getLoginEmail().clear();
		getLoginPassword().clear();
		getLoginEmail().sendKeys(email);
		getLoginPassword().sendKeys(password);
		getLoginSubmitBtn().click();		
	}

}
