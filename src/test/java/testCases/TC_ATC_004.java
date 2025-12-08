package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddToCartPage;
import pageObjects.LandingPage;
import testBase.BaseClass;

public class TC_ATC_004 extends BaseClass{
	
	@Test(groups= {"master"})
	public void validateTC_ATC_004()
	{
		logger.info("Starting ***************TC_ATC_004****************************");
		
		LandingPage lap = new LandingPage(driver);
		lap.search("Apple Cinema 30");
		lap.clickButton();
		

		AddToCartPage atp=new AddToCartPage(driver);
		atp.clickprdAppleCinema();
		atp.clickAddTocartIphone();
		Assert.assertTrue(atp.displaymsgsuccessIphone(),"Iphone succes msgDisplay !");
		
		atp.clickLnkShoapCart();
		Assert.assertTrue(atp.DisplayprdIphone(),"Iphone Product Is added!");
	}

}
