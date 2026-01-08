package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.WishListTestCase;
import testBase.BaseClass;

public class TC_WL_007 extends BaseClass{
	@Test(groups= {"master"})
	public void validate_TC_WL_007()
	{
		logger.info("***************Starting ************************TC_WL_007**************************");
		HomePage hp = new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		lp.setEmailAddress(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		logger.info("**********************User is Logged in********************************************");
		
		LandingPage ldp = new LandingPage(driver);
		ldp.search("iMac");
		ldp.clickButton();
		
		WishListTestCase wtc = new WishListTestCase(driver);
		wtc.click_searchResultImac();
		wtc.click_rightBtnAddToWishList();
		logger.info("**********************Product is added in the wishList cart*************************");
		
		wtc.clickWishListHeader();
		logger.info("**********************WishList Page validation*************************");

		Assert.assertTrue(wtc.displayheaderWishList(),"WishList page Displayed ?");
		
		
	}

}
