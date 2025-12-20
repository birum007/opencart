package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LG_005 extends BaseClass{
	
	@Test(groups= {"master"})
	public void validate_TC_LG_005()
	{
		logger.info("Starting ***************************TC_LG_005******************");
		HomePage hp = new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		hp.clickMyAccount();
		Assert.assertFalse(lp.diaplay_dropDownMyaccount());
	}

}
