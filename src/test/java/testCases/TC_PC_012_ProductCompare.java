package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LandingPage;
import testBase.BaseClass;

public class TC_PC_012_ProductCompare extends BaseClass {

	@Test(groups= {"Sanity","Master"})
	public void validateBreadCrumb() {

		logger.info("*****Started TC_PC_012_ProductCompare********");

		LandingPage lp=new LandingPage(driver);
		lp.hoverToDesktops();
		lp.clickShowAllDesktop();
		lp.clicklnkcomparetotal();
		
		HomePage hm=new HomePage(driver);
		boolean status=hm.displayMyAccount();
		Assert.assertEquals(true, status);
		
	}

}
