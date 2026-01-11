package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.WishListTestCase;
import testBase.BaseClass;

public class TC_WL_012 extends BaseClass {
	
	@Test(groups= {"master"})
	public void validate_TC_WL_012()
	{
		logger.info("Starting *********************************TC_WL_012*********************************");
		
		HomePage hp = new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		lp.setEmailAddress(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		logger.info("User is Logged In ********************TC_WL_012***********************");

		WishListTestCase wtc = new WishListTestCase(driver);
		wtc.click_lnkModifyWishList();
		
		Assert.assertEquals(wtc.getPageTitle(), "My Wish List");
		logger.info("**************Assertion of Page title**********************");
		
		Assert.assertTrue(wtc.getURL().contains("route=account/wishlist"));
		
		logger.info("********************Assertion of URL**********************");

		Assert.assertEquals(wtc.getHeading(), "Qafox.com");
		
		logger.info("**********************************Assertion of Page Heading**********************");

		
		
		
	}

}
