package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import testBase.BaseClass;

public class TC_SF_001_SearchFunctionalityTest extends BaseClass {

	@Test(groups = { "Sanity", "Master" })
	public void searchProduct()

	{
		logger.info("**********TC_SF_001_SearchFunctionalityTest started***");

		LandingPage lp = new LandingPage(driver);
		lp.search("iMac");
		lp.clickButton();;
		try {
			Assert.assertTrue(lp.prdDisplayed());
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
