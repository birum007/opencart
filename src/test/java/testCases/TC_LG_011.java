package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_LG_011 extends BaseClass{
	
	@Test(groups = { "Sanity", "Master" })
	public void verify_logout() {

		logger.info("*********TC_LG_003 _Logout_test*****");

		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();

		// Login Page
		LoginPage login = new LoginPage(driver);
		login.setEmailAddress(p.getProperty("email"));
		login.setPassword(p.getProperty("password"));
		login.clickLogin();

		MyAccountPage map = new MyAccountPage(driver);
		map.clickLogout();
		Assert.assertTrue(hp.isAccountLogout());
		

		logger.info("********Finished TC_LG_003 _Logout_testt**********");
	}
}


