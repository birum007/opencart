package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LF_016 extends BaseClass {
	
	@Test(groups= {"master"})
	public void validate_TC_LF_016()
	{
		logger.info("Starting******************TC_LF_016************************************");
		
		HomePage hp = new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		try {
		Assert.assertNotEquals(lp.displaymyAccountPagemsg(),"My Account","Is Confirmation massage Displayed!");
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		logger.info("*********************ER 1 completed*******************************************");
		
		lp.setEmailAddress(p.getProperty("email1"));
		lp.setPassword(p.getProperty("password1"));
		lp.clickLogin();
		lp.click_lnkchangePassword();
		lp.enterNewPassword("newpassword");
		lp.enterconfirmChangePassword("newpassword");
		lp.click_btnContinou();
		lp.click_btnMyaccount();
		lp.click_btnLogout();
		
		hp.clickMyAccount();
		hp.clickLogin();
		
		lp.setEmailAddress(p.getProperty("email1"));
		lp.setPassword(p.getProperty("newpassword"));
		lp.clickLogin();
		Assert.assertEquals(lp.displaymyAccountPagemsg(),"My Account","Is Confirmation massage Displayed!");
		

		
		
		
	}

}
