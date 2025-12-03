package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import testBase.BaseClass;

public class TC_SF_002_Search_Functionality extends BaseClass {
	
	@Test(groups= {"Sanity","Master"})
	public void verify_Search() {

		logger.info("****Starting TC_SF_002_Search_Functionality***");

		LandingPage lp = new LandingPage(driver);
		lp.search("Fitbit");
		lp.clickButton();
		
		try {
			Assert.assertEquals(lp.foundPrd(), "Fitbit");
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
