package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LF_013 extends BaseClass {
	
	@Test(groups= {"master"})
	public void validate_TC_LF_013()
	{
		logger.info("Starting ***************** TC_LF_013**************************");
		
		HomePage hp = new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		

		lp.setEmailAddress(p.getProperty("wrongEmail"));
		lp.setPassword(p.getProperty("wrongPassword"));
		
		Assert.assertEquals(lp.getAttributePass(), "password","Is type Password or field !");
	}

}
