package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddToCartPage;
import pageObjects.LandingPage;
import testBase.BaseClass;

public class TC_ATC_001 extends BaseClass {

	@Test(groups = { "Master" })
	public void verifyAddToCart() {
		logger.info("*************STARTING TEST TC_ATC_001************** ");
		LandingPage lp = new LandingPage(driver);
		AddToCartPage atp=new AddToCartPage(driver);

		lp.search("iMac");
		lp.clickButton();

		lp.clickImac();
		atp.clickTocart();
		Assert.assertEquals(atp.ShowMsg(), true); //condition 1
		
		atp.clickLnkShoapCart();
		
		Assert.assertEquals(atp.prdVerificationImac(), true);
		
		
		

	}

}
