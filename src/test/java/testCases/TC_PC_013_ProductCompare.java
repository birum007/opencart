package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.Product_Comparison_Page;
import testBase.BaseClass;

public class TC_PC_013_ProductCompare extends BaseClass{
	@Test(groups= {"Sanity","Master"})
	public void validateTC_PC_013() {
		logger.info("Started****TC_PC_013_ProductCompare *****");
		LandingPage lp=new LandingPage(driver);
		lp.search("iMac");
		lp.clickButton();
		lp.clickImac();
		lp.clickcompareProd();
		boolean sucessStatus=lp.displaySuccessMassage();
		
		//product compare page
		
		Product_Comparison_Page pcp=new Product_Comparison_Page(driver);
		pcp.clickiMacLnk();
		boolean status=pcp.iMacDisplay();
		//validation
		
		Assert.assertEquals(true, sucessStatus);
		Assert.assertEquals(true, status);
	}

}
