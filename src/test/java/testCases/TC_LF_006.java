package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LF_006 extends BaseClass {
	
	@Test(groups= {"master"})
	public void validate_TC_LF_006() {
		HomePage hp = new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		//Er1
		Assert.assertTrue(lp.display_lnkForgotpassword(),"forgot passwor link displayed !");
		
		lp.click_lnkForgotpassword();
		Assert.assertTrue(lp.display_headingForgotPassword(),"Forgot Password Massage Displayed !");
		
		
		
	}

}
