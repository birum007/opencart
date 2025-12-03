package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import testBase.BaseClass;

public class TC_SF_010 extends BaseClass{
	
	@Test(groups= {"master"})
	public void validateTC_SF_010()
	{
		logger.info("***********************STARTING   TC_SF_010   ************** ");
		
		LandingPage lp = new LandingPage(driver);
		lp.clickButton();
		lp.setKeyword("iMac");
		lp.selectFromDropdownByText("Desktops");
		lp.clickOnsearchButton();
		
		Assert.assertEquals(lp.ShownoMatchSearch(), "There is no product that matches the search criteria.");

		lp.clickCheckBoxsubCategory();
		lp.clickOnsearchButton();
		Assert.assertEquals(lp.ShowsearchResultImac(), true);
	}

}
