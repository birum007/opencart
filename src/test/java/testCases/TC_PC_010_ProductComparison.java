package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import testBase.BaseClass;

public class TC_PC_010_ProductComparison extends BaseClass{
	@Test(groups= {"Sanity","Master"})
	public void validateProductComparePage() throws InterruptedException
	
	
	{
		logger.info("******TC_PC_010_ProductComparison******");
		
		//Actions action=new Actions(driver);
		LandingPage lp=new LandingPage(driver);
		lp.hoverToDesktops();
		Thread.sleep(3000);
		lp.clickShowAllDesktop();
		lp.clicklnkcomparetotal();
		
		//validation of the massage
		
		Assert.assertEquals(true, lp.msgproductComparisonDisplay());
		
	}
	
	

}
