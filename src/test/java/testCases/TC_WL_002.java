package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.WishListTestCase;
import testBase.BaseClass;

public class TC_WL_002 extends BaseClass{
	@Test(groups= {"master"})
	public void validate_TC_WL_002() throws InterruptedException
	{
		logger.info("Starting *****************TC_WL_002********************");
		HomePage hp = new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
	
		
		lp.setEmailAddress(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		LandingPage lnp = new LandingPage(driver);
		lnp.search("iMac");
		Thread.sleep(2000);
		lnp.clickButton();
		WishListTestCase wtc = new WishListTestCase(driver);
		wtc.clickImac();
		wtc.scrollAndclick();
		Assert.assertTrue(wtc.displayMsg(),"Success Displayed ?");
		
		Assert.assertTrue(wtc.prdDisplayconfirmation(),"Product displayed?");
	}

}
