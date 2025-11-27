package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.Product_Comparison_Page;
import testBase.BaseClass;

public class TC_PC_015_Product_Compare extends BaseClass {

	@Test(groups = { "Sanity", "Master" })
	public void validateTC_PC_015() {

		logger.info("**TC_PC_015_Product_Compare***Started**");

		LandingPage lp = new LandingPage(driver);

		lp.search("iMac");
		lp.clickButton();
		lp.clickImac();
		lp.clickcompareProd();

		// clear searchfield
		lp.clearSearchField();
		lp.search("iPhone");
		lp.clickButton();

		lp.iphoneClickLnk();
		lp.clickcompareProd();

		Product_Comparison_Page lcp = new Product_Comparison_Page(driver);
		lcp.clickLinkProductComaparison();
		boolean v1 = lcp.iMacDisplay();
		boolean v2 = lcp.isImageDisplayed();
		boolean v3 = lcp.isBrandDisplayed();
		boolean v4 = lcp.isdimensionDisplayed();
		boolean v5 = lcp.isSummaryDisplayed();
		boolean v10 = lcp.isweightDisplayed();
		boolean v6 = lcp.isdimensionDisplayed();
		boolean v7 = lcp.isPriceDisplayed();
		boolean v8 = lcp.isAddCartBtnDisplayed();
		boolean v9 = lcp.isRemovebtnDisplayed();

		// iphone
		boolean i1 = lcp.isIphoneDisplayed();
		boolean i2 = lcp.isiphonePriceDisplayed();
		boolean i3 = lcp.isiphoneModelDisplayed();
		boolean i4 = lcp.isIphoneSummaryDisplayed();
		boolean i5 = lcp.isIphoneWeightDisplayed();
		boolean i9 = lcp.isIphoneAddcartBtnDisplayed();
		boolean i6 = lcp.isIphoneDimensionDisplayed();
		boolean i7 = lcp.isIphoneRemovebtnDisplayed();
		boolean i8 = lcp.isRemovebtnDisplayed();
		
		logger.info("***TC_PC_015_Product_Compare****Finished***");
		
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

		Assert.assertEquals(true, i1);
		Assert.assertEquals(true, i2);
		Assert.assertEquals(true, i3);
		Assert.assertEquals(true, i4);
		Assert.assertEquals(true, i5);
		Assert.assertEquals(true, i6);
		Assert.assertEquals(true, i7);
		Assert.assertEquals(true, i8);
		Assert.assertEquals(true, i9);

	}

}
