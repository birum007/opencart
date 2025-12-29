package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LG_006 extends BaseClass{
	
	@Test(groups= {"master"})
	public void validate_TC_LG_006()

	{
		logger.info("Strating*************************************TC_LG_006***********************");
		
		HomePage hp = new HomePage(driver);
		LoginPage lp = new LoginPage(driver);
		hp.clickMyAccount();
		logger.info("---------clicked on MyAccount--------");
		hp.clickRegister();
		logger.info("------clicked on register link----");
		
		Assert.assertFalse(lp.isLogoutPresent(),"Logout present on right side of the register page !");
	}
}
