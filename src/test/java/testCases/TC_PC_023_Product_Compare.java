package testCases;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.Product_Comparison_Page;
import testBase.BaseClass;

public class TC_PC_023_Product_Compare extends BaseClass{
	
	@Test(groups= {"Sanity","Master"})
	public void validateTC_PC_023_Product_Compare()
	{
		logger.info("Started***TC_PC_023_Product_Compare***");
		
		LandingPage landingpage=new LandingPage(driver);
		landingpage.search("iMac");
		landingpage.clickButton();
		landingpage.clickcompareProd();
		
		Product_Comparison_Page productComparisonPage=new Product_Comparison_Page(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actualTitle="Product Comparison";
		String actualHeading="Product Comparison";
		String currentUrl="https://tutorialsninja.com/demo/index.php?route=product/compare";
		
		
		productComparisonPage.clickLinkProductComaparison();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("product/compare"));
		
		Assert.assertEquals(actualTitle, productComparisonPage.getTitle());
		
		Assert.assertEquals(actualHeading, productComparisonPage.getHeading());
		
		Assert.assertTrue(productComparisonPage.displayAddToCartButton());
		
		Assert.assertTrue(productComparisonPage.displayremoveButton());

		
	}

}
