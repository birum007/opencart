package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.Product_Comparison_Page;
import testBase.BaseClass;

public class TC_PC_001_ProductComparison extends BaseClass {
	@Test(groups = { "Sanity", "Master" })
	public void productComparison() throws InterruptedException {
		logger.info("***TC_PC_001_ProductComparison started***");

		// Landing page object

		LandingPage lp = new LandingPage(driver);
		lp.search("iMac");
		lp.clickButton();

		lp.clickImac();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		Actions actions = new Actions(driver);

		WebElement tooltip = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id='content']/div[1]/div[2]/div[1]/button[2]")));
		
		
		
		actions.moveToElement(tooltip).perform();
		String actualTooltip = tooltip.getAttribute("data-original-title");
		Assert.assertEquals(actualTooltip, "Compare this Product");
		lp.clickcompareProd();
		Thread.sleep(2000);
		//success massage
		Assert.assertEquals(true, lp.displaySuccessMassage());
		
		Product_Comparison_Page pcp=new Product_Comparison_Page(driver);
		pcp.clickLinkProductComaparison();	
		Assert.assertEquals(true, pcp.displayProductComparison());
		Thread.sleep(2000);
		
		Assert.assertEquals(true, pcp.confirmProduct());
		
		
	}

}
