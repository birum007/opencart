package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.WishListTestCase;
import testBase.BaseClass;

public class TC_WL_003 extends BaseClass{
	@Test(groups= {"master"})
	public void validate_TC_WL_003()
	{
		logger.info("Starting **************************************TC_WL_003****************************************");
		
		HomePage hp = new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		lp.setEmailAddress(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		WishListTestCase wtc = new WishListTestCase(driver);
		wtc.clickLogo();
		Assert.assertTrue(wtc.displayLogo(),"Homepage Logo displayed ?"); //Er1
		
		wtc.click_wishToCartFeature();
		Assert.assertTrue(wtc.displayMsg(),"Success massage displayed !"); //ER2
		
		wtc.click_linkwishlistfeature();
		Assert.assertEquals(wtc.displayPrd(), "MacBook","MacBook displayed or not");
	}

}
