package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
	

	public LoginPage(WebDriver driver) {
		
		super(driver);
		
		
	}

	// locator

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmailAddress;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPass;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement btnLogin;

	// TC_LF_001

	@FindBy(xpath = "//*[@id='account-login']/ul/li[3]")
	WebElement loginPagemsg;
	@FindBy(xpath = "//*[@id='content']/h2[1]")
	WebElement myAccountPagemsg;

	// TC_LF_002

	@FindBy(xpath = "//*[text()='Warning: No match for E-Mail Address and/or Password.']")
	WebElement loginWarningmsg;

	// TC_LF_006

	@FindBy(xpath = "//*[@class='form-group']/a")
	WebElement lnkForgotpassword;
	@FindBy(xpath="//*[@id='content']/h1")
	WebElement headingForgotPassword;
	
	//TC_LF_009
	
	

	// Action Methods

	public void setEmailAddress(String email) {
		txtEmailAddress.sendKeys(email);
	}

	public void setPassword(String pwd) {
		txtPass.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
	}

	public boolean displayloginPagemsg() {
		return loginPagemsg.isDisplayed();
	}

	public String displaymyAccountPagemsg() {
		return myAccountPagemsg.getText();
	}

	public String getloginWarningmsg() {
		return loginWarningmsg.getText();
	}

	public boolean display_lnkForgotpassword() {
		return lnkForgotpassword.isDisplayed();
	}
	public void click_lnkForgotpassword()
	{
		lnkForgotpassword.click();
	}
	public boolean display_headingForgotPassword()
	{
		return headingForgotPassword.isDisplayed();
	}
	
	public void keyPadAction()
	{
		//Actions action = new Actions(driver);
		for(int i =0 ;i<24;i++)
		{
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-email']")));
		
	}
	public void singleTabAction()
	{
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-password']")));
	}
	
	public void doubleTabAction()
	{
		for(int i =0;i<3;i++)
		{
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Login']")));
		}
	}

		public void enterAction()
		{
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Login']")));
		}
		
		public String getPlaceholderEmail()
		{
			return txtEmailAddress.getAttribute("placeholder");
		}
		public String getPlaceholderPwd()
		{
			return txtPass.getAttribute("placeholder");
		}
		
		public void browserBack()
		{
			driver.navigate().back();
		}
}
