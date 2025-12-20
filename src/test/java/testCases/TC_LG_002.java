package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LG_002 extends BaseClass {
	@Test(groups= {"master"})
	public void validate_TC_LG_002()
	{
		logger.info("Starting ***********************TC_LG_002**************************");
		HomePage hp = new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
	
		
		lp.setEmailAddress(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		//er1
		lp.click_sideColoumnLogout();
		Assert.assertTrue(lp.display_headingAccountLogout());
		//er2
		
		lp.click_btnContinue();
		Assert.assertTrue(lp.display_logoHomePage(),"Home logo displayed !");

	}

}
