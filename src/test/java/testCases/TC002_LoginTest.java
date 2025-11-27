package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
	
	@Test(groups={"Sanity","Master"})
	public void verify_login()
	{
		logger.info("*********starting TC002_Login test*****");
		//home page
		try {
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		//Login Page
		LoginPage login=new LoginPage(driver);
		login.setEmailAddress(p.getProperty("email"));
		login.setPassword(p.getProperty("password"));
		login.clickLogin();
		
		MyAccountPage map=new MyAccountPage(driver);
		boolean targetpage=map.isMyAccountPageExist();
		Assert.assertTrue(targetpage);
		//Assert.assertEquals(targetpage,true,"Login Failed");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("********Finished TC002_LoginTest*****");
	}
	
	
	
	

}
