package testCases;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.Product_Comparison_Page;
import testBase.BaseClass;
import utillities.Helper;

public class TC_PC_019_Product_Compare extends BaseClass {

	@Test(groups = { "Sanity", "Master" })
	public void validateTC_PC_019() {
		logger.info("Started********TC_PC_019_Product_Compare*******");
		LandingPage lp = new LandingPage(driver);
		Product_Comparison_Page pcp = new Product_Comparison_Page(driver);
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

		lp.clearSearchField();
		lp.search("MacBook Pro");
		lp.clickButton();
		lp.clickmacBookPro();
		lp.clickcompareProd();
		pcp.clickLinkProductComaparison();

		List<String> displayedProducts = Helper.getTextFromElements(pcp.getProductNames());
		// System.out.println("Products displayed: " + displayedProducts);

		// Validate exactly 4 products displayed
		Assert.assertEquals(displayedProducts.size(), 4, "Exactly 4 products should be displayed!");
		// Validate first added product is removed

		Assert.assertFalse(displayedProducts.contains("iMac"),
				"First product should be auto removed when 5th is added!");

		// Validate latest 4 products (example: iPhone → MacBook Pro)
		List<String> expectedProducts = Arrays.asList("iPhone", "MacBook Air", "MacBook", "MacBook Pro");
		Assert.assertEquals(displayedProducts, expectedProducts, "Latest 4 products are not displayed correctly!");

		  // Step 3: Validate Add to Cart and Remove buttons count
        Assert.assertEquals(pcp.getAddToCartButtons().size(), 4,
                "Each product should have Add to Cart button");
        Assert.assertEquals(pcp.getRemoveButtons().size(), 4,
                "Each product should have Remove button");
	}
}
