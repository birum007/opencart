package testCases;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import testBase.BaseClass;

public class TC_SF_005 extends BaseClass {
	@Test(groups = { "master" })
	public void validateTC_SF_005() {
		logger.info("**********STARTING   TC_SF_005   *****************");

		LandingPage lp = new LandingPage(driver);
		lp.clickButton();
		lp.setKeyword("Mac");
		lp.clickOnsearchButton();
		
		List<String> names= lp.getMacProductsSearchresult();
		Assert.assertEquals(names, "Mac","More than one products should be displayed in the search results page");
		
	}

}
