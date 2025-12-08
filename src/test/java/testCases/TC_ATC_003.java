package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddToCartPage;
import pageObjects.LandingPage;
import testBase.BaseClass;

public class TC_ATC_003 extends BaseClass {
	
	@Test(groups= {"master"})
	public  void addToCart_TC_ATC_003() throws InterruptedException
	{
		logger.info("Starting ************TC_ATC_003******************");
		
		LandingPage lap = new LandingPage(driver);
		lap.search("iMac");
		lap.clickButton();

		AddToCartPage atp=new AddToCartPage(driver);
		atp.clickAddTocart();
		Assert.assertTrue(atp.msgAddedTocart(),"Success massage is displayed !");
		Thread.sleep(3000);
		atp.clickbtnItem();
		Thread.sleep(3000);
		atp.clickbtnViewcart();
		Assert.assertTrue(atp.displaycnfprdImac(),"Imac Displayed !");
		
	}

}
