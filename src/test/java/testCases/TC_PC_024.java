package testCases;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import testBase.BaseClass;

public class TC_PC_024 extends BaseClass {

	@Test(groups= {"Master"})
	public void validateCrossbrowserFun() {

		//logger.info("**************Starting ***TC_PC_024   ********************");

		LandingPage lp = new LandingPage(driver);
		lp.search("iMac");
		lp.clickButton();

		lp.clickcompareProd();
		lp.clickCompareProductlnk();

	}

}
