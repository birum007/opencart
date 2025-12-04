package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import testBase.BaseClass;

public class TC_SF_013 extends BaseClass {
	
	@Test(groups= {"master"})
	public void validateProductComparePage()
	{
		logger.info("**********STARTING TC_SF_013 *********************************");
		
		LandingPage lp = new LandingPage(driver);
		lp.search("iMac");
		lp.clickButton();
		lp.clickLink();
		String expected ="Product Comparison";
		Assert.assertEquals(lp.ShowProductComparisonmsg(), expected);
		
		
		logger.info("*******Ending of TC_SF_013 *******************************************");
	}

}
