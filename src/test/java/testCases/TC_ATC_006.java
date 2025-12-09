package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddToCartPage;
import testBase.BaseClass;

public class TC_ATC_006 extends BaseClass{
	
	@Test(groups= {"master"})
	public void validate_TC_ATC_006() throws InterruptedException
	{
		logger.info("starting ********TC_ATC_006************");
		AddToCartPage atc = new AddToCartPage(driver);
		atc.clickprdMacBook();
		Thread.sleep(3000);
		atc.clicklnkShoapingverify();
		Assert.assertTrue(atc.displaymacBookprdVrf(),"MacBook Displayed !");
		
		
	}

}
