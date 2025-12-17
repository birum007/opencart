package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LF_008 extends BaseClass {
	
	@Test(groups= {"master"})
	public void validate_TC_LF_008()
	{
		logger.info("Starting ************************TC_LF_008***********************");
		HomePage hp = new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		Assert.assertEquals(lp.getPlaceholderEmail(), "E-Mail Address","Mismatch !");
		Assert.assertEquals(lp.getPlaceholderPwd(), "Password","Mismatch !");
		
	}

}
