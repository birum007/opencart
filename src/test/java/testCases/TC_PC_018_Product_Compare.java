package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.Product_Comparison_Page;
import testBase.BaseClass;

public class TC_PC_018_Product_Compare extends BaseClass {

	@Test(groups= {"Sanity","Master"})
	public void validateTC_PC_018_Product() {
		logger.info("*********Started*****TC_PC_018_Product_Compare**********");

		LandingPage lp = new LandingPage(driver);

		lp.search("iMac");
		lp.clickButton();
		lp.clickImac();
		lp.clickcompareProd();

		lp.clearSearchField();
		lp.search("iPhone");
		lp.clickButton();
		lp.iphoneClickLnk();
		lp.clickcompareProd();

		lp.clearSearchField();
		lp.search("MacBook Air");
		lp.clickButton();
		lp.macbookairClick();
		lp.clickcompareProd();

		lp.clearSearchField();
		lp.search("MacBook");
		lp.clickButton();
		lp.clickMacBook();
		
		
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

		// MacBook Air

		boolean m1 = lcp.ismacbookAirDisplayed();
		boolean m2 = lcp.imageMacBookDisplay();
		boolean m3 = lcp.priceMacBookDisplay();
		boolean m4 = lcp.modelMacBookDisplay();
		boolean m5 = lcp.brandMacBookDisplay();
		boolean m6 = lcp.summaryMacBookDisplay();
		boolean m7 = lcp.weightMacbookDisplay();
		boolean m8 = lcp.isDimensionDetailsDisplayed();
		boolean m9 = lcp.isbtnAddtoCartDisplayed();
		boolean m10 = lcp.isbtnRemoveDisplayed();
		
		//MacBook
		
		boolean k1 = lcp.prdmacBookDisplay();
		boolean k2 = lcp.imgmacBookDisplay();
		boolean k3 = lcp.pricemacBookDisplay();
		boolean k4 = lcp.modelmacBookDisplay();
		boolean k5 = lcp.isBrandDisplayed();
		boolean k6 = lcp.summarymacbookDisplay();
		boolean k7 = lcp.weightmacBookDisplay();
		boolean k8 = lcp.dimensionmacBookDisplay();
		boolean k9 = lcp.btnAddcartmacbookDisplay();
		boolean k10 = lcp.btnRemoveMacBookDisplay();

		logger.info("*********RUNNING*****TC_PC_018_Product_Compare**********");

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

		Assert.assertEquals(true, m1);
		Assert.assertEquals(true, m2);
		Assert.assertEquals(true, m3);
		Assert.assertEquals(true, m4);
		Assert.assertEquals(true, m5);
		Assert.assertEquals(true, m6);
		Assert.assertEquals(true, m7);
		Assert.assertEquals(true, m8);
		Assert.assertEquals(true, m9);
		Assert.assertEquals(true, m10);
		
		Assert.assertEquals(true, k1);
		Assert.assertEquals(true, k2);
		Assert.assertEquals(true, k3);
		Assert.assertEquals(true, k4);
		Assert.assertEquals(true, k5);
		Assert.assertEquals(true, k6);
		Assert.assertEquals(true, k7);
		Assert.assertEquals(true, k8);
		Assert.assertEquals(true, k9);
		Assert.assertEquals(true, k10);

		logger.info("*********FINISHED*****TC_PC_018_Product_Compare**********");

	}

}
