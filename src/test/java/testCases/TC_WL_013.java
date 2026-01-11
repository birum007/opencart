package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.WishListTestCase;
import testBase.BaseClass;

public class TC_WL_013 extends BaseClass {
	
	@Test(groups= {"master"})
	public void validate_TC_WL_013()
	{
		logger.info("Starting **************TC_WL_013********************************");
		
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
		
		Assert.assertEquals(wtc.getEmptymsg(), "Your wish list is empty.","Massage matched ?");
		wtc.clickOnbtnContinou();
		Assert.assertTrue(wtc.display_accountPagemsg(),"Account page dipslayed ?");
		
	}

}
