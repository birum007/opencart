package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import testBase.BaseClass;

public class TC_SF_005_Search_Functionality extends BaseClass {
	@Test(groups = { "Sanity", "Master" })
	public void verifySearchResult() {
		logger.info("***Starting TC_SF_005_Search_Functionality***");

		logger.info("****Starting TC_SF_002_Search_Functionality***");

		LandingPage lp = new LandingPage(driver);

		lp.clickButton();
		lp.setKeyword("Mac");
		lp.clickOnsearchButton();
		int result = lp.getNumberOfResult();
		Assert.assertTrue(result > 1, "Expected Multiple producs , but found :"+result);
		

	}
}
