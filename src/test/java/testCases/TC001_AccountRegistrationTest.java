package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

	@Test(groups={"Regression","Master"})
	public void verify_account_registration() {
		
		logger.info("*******Starting  TC001_AccountRegistrationTest**********");
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		logger.info("---------clicked on MyAccount--------");
		hp.clickRegister();
		logger.info("------clicked on register link----");

		AccountRegistrationPage agp = new AccountRegistrationPage(driver);
		
		logger.info("-----providing customer details------");
		agp.setFirstName(randomString().toUpperCase());
		agp.setLastName(randomString().toUpperCase());

		agp.setEmail(randomString() + "@gmail.com");
		agp.setTelephoneNumber(randomNumber());

		String password = randomAlphaNumeric();
		agp.setPassword(password);
		agp.setCnfPassword(password);
		agp.setPrivacyPolicy();

		agp.clickContinue();
		
		logger.info("--validating confirmation message-----");
		String confmsg = agp.getConfirmationMsg();
		try {
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
	}
		catch(Exception e)
		{
			logger.error("Test failed");
			logger.debug("Debug");
			Assert.fail();
		}

}
}
