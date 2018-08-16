package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.Util;
import pages.LoginPage;
import pages.ProfilePage;

public class LoginPageTest extends Browser {
	
	LoginPage login;
	ProfilePage profile;
	
	@BeforeMethod
	public void setUp() {
		driver.get(Util.url);
		login = new LoginPage(driver);
		profile = new ProfilePage(driver);
	}
	
	@Test(priority = 0)
	public void unsuccessfulLogin() {
		login.getLoginBtn().click();
		login.logMeIn(Util.username + "x", Util.password);
		
		assertTrue(login.getLoginErrorMsg().isDisplayed());
	}
	
	@Test(priority = 1)
	public void successfulLogin() {
		login.getLoginBtn().click();
		login.logMeIn(Util.username, Util.password);
		
		assertTrue(profile.getUsername().isDisplayed());
	}
	
}
