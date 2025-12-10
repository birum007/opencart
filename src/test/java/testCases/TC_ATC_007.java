package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.Product_Comparison_Page;
import testBase.BaseClass;

public class TC_ATC_007 extends BaseClass {

	@Test(groups = { "master" })
	public void validate_TC_ATC_007() {
		logger.info("**********************STARTING*****************TC_ATC_007*******************");
		LandingPage lp = new LandingPage(driver);
		lp.search("iMac");
		lp.clickButton();

		// product compare page

		Product_Comparison_Page pcp = new Product_Comparison_Page(driver);

		pcp.clickcomapareImac();
		pcp.clicklnkproductComparison();

		pcp.clickbtnAddToCart();
		Assert.assertTrue(pcp.DisplaysuccessAddTocartmsg(),"Success Massage diplayed !");
		
		pcp.clicklnkShoapingcart();
		Assert.assertTrue(pcp.displayiMacproductcnf(),"Imac Displayed !");
	}

}
