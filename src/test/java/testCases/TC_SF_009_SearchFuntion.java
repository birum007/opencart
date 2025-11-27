package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import testBase.BaseClass;

@Test(groups = { "Sanity", "Master" })
public class TC_SF_009_SearchFuntion extends BaseClass {

	public void producSearch() throws InterruptedException {
		logger.info("***TC_SF_009_SearchFuntion*****Started****");

		LandingPage lp = new LandingPage(driver);
		lp.clickButton();
		lp.setKeyword("iMac");
		lp.selectFromDropdownByText("27");
		lp.clickOnsearchButton();

//correct search
		String iMacProd = lp.getProdiMac();
		Assert.assertEquals(iMacProd, "iMac");

//incorrect search
		
		
		
		

	}

}
