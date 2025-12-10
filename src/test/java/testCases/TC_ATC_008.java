package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddToCartPage;
import pageObjects.LandingPage;
import testBase.BaseClass;

public class TC_ATC_008 extends BaseClass{
	
	@Test(groups= {"master"})
	public void validate_TC_ATC_008()
	{
		logger.info("Starting ************************TC_ATC_008**********************************");
		LandingPage lp = new LandingPage(driver);
		AddToCartPage atp=new AddToCartPage(driver);

		lp.search("iMac");
		lp.clickButton();

		lp.clickImac();
		Assert.assertEquals(atp.getTextAddTocart(), "Add to Cart","Is Correct !");
		
		
		atp.clickTocart();
		Assert.assertTrue(atp.getTextitem(), "1 Item Added !");
		
		
		atp.clickLnkShoapCart();
		
		
	}

}
