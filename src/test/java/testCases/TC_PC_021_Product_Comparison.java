package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.Product_Comparison_Page;
import testBase.BaseClass;

public class TC_PC_021_Product_Comparison extends BaseClass {
	@Test(groups= {"Sanity","Master"})
	public void validateRemoveButton()
	{
		logger.info("***TC_PC_021_Product_Comparison***Started***");
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
		productComparisonPage.clickLinkProductComaparison();
		
		WebDriverWait  wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table//tbody//a[@class='btn btn-danger btn-block")));

		productComparisonPage.removeIMac();
		

		
		
		//Assert.assertFalse(productComparisonPage.confirmProductiMac(), "Imac Displayed?");
	}

}
