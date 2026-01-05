package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.WishListTestCase;
import testBase.BaseClass;

public class TC_WL_005 extends BaseClass{
	
	@Test(groups= {"master"})
	public void validate_TC_WL_005()
	{
		logger.info("Starting *********************************TC_WL_005*****************************");
		
		HomePage hp = new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		lp.setEmailAddress(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		LandingPage ldp = new LandingPage(driver);
		ldp.search("iMac");
		ldp.clickButton();
		
		WishListTestCase wtc = new WishListTestCase(driver);
		
		wtc.clickAddTowishBtn();
		Assert.assertTrue(wtc.msgDisplayed(), "Is Success Msg Displayed ?");
		wtc.click_lnkWishList();
		Assert.assertTrue(wtc.displayProduct(),"Product Displayed ?");
		
		
	}

}
