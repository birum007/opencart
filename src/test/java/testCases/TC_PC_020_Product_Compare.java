package testCases;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.Product_Comparison_Page;
import testBase.BaseClass;

public class TC_PC_020_Product_Compare extends BaseClass {
	@Test(groups= {"Sanity","Master"})
	public void verifyAddToCartFromComparisonPage() {
		logger.info("Started ****TC_PC_020_Product_Compare**");

		LandingPage lp = new LandingPage(driver);
		Product_Comparison_Page productComparisonPage = new Product_Comparison_Page(driver);
		lp.search("iMac");
		lp.clickButton();
		lp.clickCompareThisProductAtSearch();
		lp.clickCompareProductlnk();
		//Adding product to cart
		productComparisonPage.clickbtnAddToCart();
		

	}

}
