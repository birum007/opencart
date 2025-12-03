package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utillities.DataProviders;

/*Data is valid -login success-test pass- logout
 * data is valid --login failed
 * 
 * data is invalid--login success-test fail--logout
 * 					login fail-test pass
 * 
 * 
 */
public class TC003_LoginDDT extends BaseClass {
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)//getting data providers from diffrent class
	public void verify_loginDDT(String email, String pwd, String exp)
	{
		logger.info("*******starting TC_003");
		try {
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		//Login Page
		LoginPage login=new LoginPage(driver);
		login.setEmailAddress("username");
		login.setPassword("password");
		login.clickLogin();
		
		MyAccountPage map=new MyAccountPage(driver);
		boolean targetpage=map.isMyAccountPageExist();
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetpage==true)
			{
				map.clickLogout();
				Assert.assertTrue(true);
				
			}
			else
			{
				Assert.assertTrue(false);
				
			}
		}
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(targetpage==true)
			{
				map.clickLogout();
				Assert.assertTrue(false);
			}
		}
		else
		{
			Assert.assertTrue(true);
		}
		}catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("********Finished TC_003_LoginDDT");
	}
	
	
	
}
