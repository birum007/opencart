package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.Product_Comparison_Page;
import testBase.BaseClass;

public class TC_PC_014_Product_Comparison extends BaseClass {

	@Test(groups= {"Sanity","Master"})
	public void validateProductComparison() {
		logger.info("****Started*****TC_PC_014_Product_Comparison***");
		LandingPage lp=new LandingPage(driver);
		
		lp.search("iMac");
		lp.clickButton();
		lp.clickImac();
		lp.clickcompareProd();
		
		Product_Comparison_Page lcp=new Product_Comparison_Page(driver);
		lcp.clickLinkProductComaparison();
		boolean v1=lcp.iMacDisplay();
		boolean v2 =lcp.isImageDisplayed();
		boolean v3=lcp.isBrandDisplayed();
		boolean v4=lcp.isdimensionDisplayed();
		boolean v5=lcp.isSummaryDisplayed();
		boolean v10 =lcp.isweightDisplayed();
		boolean v6=lcp.isdimensionDisplayed();
		boolean v7=lcp.isPriceDisplayed();
		boolean v8=lcp.isAddCartBtnDisplayed();
		boolean v9=lcp.isRemovebtnDisplayed();
		
		Assert.assertEquals(true, v1);
		Assert.assertEquals(true, v2);
		Assert.assertEquals(true, v3);
		Assert.assertEquals(true, v4);
		Assert.assertEquals(true, v5);
		Assert.assertEquals(true, v6);
		Assert.assertEquals(true, v7);
		Assert.assertEquals(true, v8);
		Assert.assertEquals(true, v9);
		Assert.assertEquals(true, v10);
	
	}

}
