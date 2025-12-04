package testCases;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.Product_Comparison_Page;
import testBase.BaseClass;

public class TC_PC_022_Compare_Product extends BaseClass {
	@Test(groups = { "Sanity", "Master" })
	public void validatePageHeading() {
		logger.info("Started***TC_PC_022_Compare_Product***");
		LandingPage landingpage = new LandingPage(driver);
		landingpage.search("iMac");
		landingpage.clickButton();
		landingpage.clickcompareProd();

		Product_Comparison_Page productComparisonPage = new Product_Comparison_Page(driver);
		
		
		productComparisonPage.clickLinkProductComaparison();

		WebDriverWait  wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.urlContains("product/compare"));

//	    String actualHeading = "Product Comparison";
//		
	//	Assert.assertEquals(actualHeading, productComparisonPage.getHeading());
		
//		String actualTitle="Product Comparison";	
//		
//		String actualUrl="https://tutorialsninja.com/demo/index.php?route=product/compare";
//		Assert.assertEquals(actualUrl, productComparisonPage.getURL());
//		Assert.assertEquals(actualHeading, productComparisonPage.getHeading());
//		Assert.assertEquals(actualTitle, productComparisonPage.getTitle());
	    String expectedHeading = "Product Comparison";
	    String expectedTitle   = "Product Comparison";
	    String expectedUrl     = "https://tutorialsninja.com/demo/index.php?route=product/compare";

//		
		Assert.assertEquals(productComparisonPage.getURL(), expectedUrl, "URL mismatch!");
		Assert.assertEquals(productComparisonPage.getHeading(), expectedHeading, "Heading mismatch!");
		Assert.assertEquals(productComparisonPage.getTitle(), expectedTitle, "Page title mismatch!");
		

	
	}

}
