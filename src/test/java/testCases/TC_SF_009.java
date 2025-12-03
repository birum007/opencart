package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import testBase.BaseClass;

public class TC_SF_009 extends BaseClass{
	
	@Test(groups= {"master"})
	public void validateTC_SF_009()
	{
		logger.info("**********STARTING  TC_SF_009 ****************************");
		
		LandingPage lp = new LandingPage(driver);
		lp.clickButton();
		lp.setKeyword("iMac");
		lp.selectFromDropdownByText("Mac");
//		
//		try {
//			Thread.sleep(5);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
		lp.clickOnsearchButton();
		
		Assert.assertEquals(lp.ShowsearchResultImac(), true);
		
		lp.selectFromDropdownByText("PC");
//		try {
//			Thread.sleep(5);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		lp.clickOnsearchButton();
		
		Assert.assertEquals(lp.ShownoMatchSearch(), "There is no product that matches the search criteria.");
	
	}

}
