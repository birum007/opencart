package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LG_008 extends BaseClass{
	
	@Test(groups= {"master"})
	public void validate_TC_LG_008()
	{
		logger.info("Starting ***************************TC_LG_008*******************************");
		HomePage hp = new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
	
		
		lp.setEmailAddress(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		lp.click_btnMyaccount();
		lp.click_btnLogout();
		//er1
		
		hp.clickMyAccount();
		hp.clickLogin();
		lp.setEmailAddress(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		Assert.assertEquals(lp.displaymyAccountPagemsg(), "My Account", "Acccount page displayed !");
		
		
		
		
	}

}
