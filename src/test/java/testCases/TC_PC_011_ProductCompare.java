package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LandingPage;
import testBase.BaseClass;

public class TC_PC_011_ProductCompare extends BaseClass {
	@Test(groups = { "Sanity", "Master" })
	public void Validate_Working_Continue_Button() throws InterruptedException {
		logger.info("**TC_PC_011_ProductCompare started***");
		
		//Actions action=new Actions(driver);
				LandingPage lp=new LandingPage(driver);
				lp.hoverToDesktops();
				Thread.sleep(3000);
				lp.clickShowAllDesktop();
				lp.clicklnkcomparetotal();
				lp.clickbtnContinue();
				
				//confirmation of home page
				HomePage hm=new HomePage(driver);
				
				Assert.assertEquals(true, hm.logoDisplay());
				
				
	}

}
