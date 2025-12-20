package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LG_009 extends BaseClass{
	@Test(groups= {"master"})
	public void validate_TC_LG_009()
	{
		logger.info("Starting ********************TC_LG_009***************************");
		
		HomePage hp = new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
	
		
		lp.setEmailAddress(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		lp.click_btnMyaccount();
		lp.click_btnLogout();
		//er1
		Assert.assertEquals(lp.conf_headingAccountLogout(), "Account Logout","Heading matching !");
		logger.info("Heading assertions");
		Assert.assertEquals(lp.getTitleOfLogoutPage(), "Account Logout","Title matching !");
		logger.info("Title assertions");

		Assert.assertEquals(lp.getLogoutPageUrl(), "https://tutorialsninja.com/demo/index.php?route=account/logout" ,"URL matching !");
		logger.info("URL assertions");

		Assert.assertTrue(lp.getElement());
		logger.info("Breadcrumb assertions");

	}

}
