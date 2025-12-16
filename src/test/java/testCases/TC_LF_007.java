package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LF_007 extends BaseClass{
	@Test(groups= {"master"})
	public void validate_TC_LF_007()
	{
		logger.info("started ***************TC_LF_007*************************");
		HomePage hp = new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		lp.keyPadAction();
		lp.setEmailAddress(p.getProperty("email"));
		lp.singleTabAction();
		lp.setPassword("password");
		lp.doubleTabAction();
		lp.enterAction();
		
		Assert.assertTrue(lp.displayloginPagemsg());
		//ER1
		
		logger.info("finished ***************TC_LF_007*************************");
	}

}
