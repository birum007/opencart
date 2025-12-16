package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LF_001 extends BaseClass {
	
	@Test(groups= {"master"})
	public void validate_TC_LF_001()
	{
		logger.info("Starting *******************TC_LF_001**********************");
		
		try {
		HomePage hp = new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		Assert.assertTrue(lp.displayloginPagemsg());
		//ER1
		
		
		
		lp.setEmailAddress(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		Assert.assertEquals(lp.displaymyAccountPagemsg(), "My Account","my account heading displayed !");
		
	}
		catch(Exception e) {
			Assert.fail();
		}
		
		logger.info("********Finished *******************TC_LF_001**********************");
	
	}

}
