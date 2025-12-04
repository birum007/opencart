package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import testBase.BaseClass;

public class TC_SF_014 extends BaseClass{
	
	@Test(groups= {"master"})
	public void  validateProductSort() throws InterruptedException
	{
		logger.info("starting ********** TC_SF_014 *********");
		
		LandingPage lp = new LandingPage(driver);
		lp.search("Mac");
		lp.clickButton();
		lp.clickBtnList();
		
		Assert.assertEquals(lp.getProductResultSize(), true);
		
		logger.info("*************ER1 is completed***********************");
		
		lp.selectDropdown("Name (A - Z)");
		Thread.sleep(5);
		Assert.assertFalse(lp.validateSorting("Name (A - Z)"));
		
	}

}
