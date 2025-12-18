package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LF_010 extends BaseClass{
	
	@Test(groups= {"master"})
	public void validate_TC_LF_010()
	{
		logger.info("**********Started**********TC_LF_010*****************************");
		HomePage hp = new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		//Assert.assertTrue(lp.displayloginPagemsg());
		//ER1
		
		
		
		lp.setEmailAddress(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		lp.click_btnMyaccount();
		lp.click_btnLogout();
		
		lp.browserBack();
		Assert.assertEquals(lp.displaymyAccountPagemsg(), "My Account");
	}

}
