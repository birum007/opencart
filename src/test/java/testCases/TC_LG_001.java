package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

@Test(groups= {"master"})
public class TC_LG_001 extends BaseClass {
	
	public void validate_TC_LG_001()
	{
		logger.info("Starting ********************TC_LG_001******************************");
		
		HomePage hp = new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
	
		
		lp.setEmailAddress(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		lp.click_btnMyaccount();
		lp.click_btnLogout();
		
		//Er1
		Assert.assertTrue(lp.display_headingAccountLogout(),"Account logout massage Displayed!");
		
		lp.click_btnContinue();
		lp.display_logoHomePage();
	}

}
