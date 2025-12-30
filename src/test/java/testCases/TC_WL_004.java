package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.WishListTestCase;
import testBase.BaseClass;

public class TC_WL_004 extends BaseClass{
	
	@Test(groups= {"master"})
	public void validate_TC_WL_004()
	{
		logger.info("Starting **********************************TC_WL_004****************************************");
		HomePage hp = new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		lp.setEmailAddress(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		WishListTestCase wtc = new WishListTestCase(driver);
		wtc.hoverOverElement();
		wtc.click_MacLeftSubMenu();
		wtc.click_addTocartButton();
		Assert.assertTrue(wtc.displayMsg(),"Success ! massage displayed ?");
		wtc.click_linkWish();
		Assert.assertTrue(wtc.display_productWishList(),"Imac Dipslayed?");
	}

}
