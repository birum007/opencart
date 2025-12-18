package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LF_012 extends BaseClass {
	
	@Test(groups= {"master"})
	public void validate_TC_LF_012()
	{
		logger.info("Started *******************TC_LF_012*************************");
		HomePage hp = new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		

		lp.setEmailAddress(p.getProperty("wrongEmail"));
		lp.setPassword(p.getProperty("wrongPassword"));
		lp.clickLogin(5);
		
		Assert.assertEquals(lp.getloginWarningmsg(), "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.");
	}

}
