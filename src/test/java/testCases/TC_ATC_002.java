package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddToCartPage;
import pageObjects.HomePage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_ATC_002 extends BaseClass {
	
	@Test(groups= {"master"})
	public void verifyWishlist() throws InterruptedException
	{
		logger.info("*********************STARTING TC_ATC_002 EXECUTION****************************");
		
		HomePage hp = new HomePage(driver);
		
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmailAddress(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		Thread.sleep(10);
		
		LandingPage lap = new LandingPage(driver);
		lap.search("iMac");
		lap.clickButton();

		AddToCartPage atp=new AddToCartPage(driver);
		atp.clickbtnAddWishlist();
		atp.clickbtnWishList();
		atp.clickbtnAddtoCartOfwishlist();
		
		Assert.assertEquals(atp.ShowmsgSuccess(), true);
		
		atp.clicklnkShoapingCartWishlst();
		Assert.assertEquals(atp.ShowprdValidateImacWishPage(), true);
	}

}
