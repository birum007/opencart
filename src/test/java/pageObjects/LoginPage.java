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
	private WebElement txtEmailAddress;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement txtPass;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement btnLogin;

	// TC_LF_001

	@FindBy(xpath = "//*[@id='account-login']/ul/li[3]")
	private WebElement loginPagemsg;
	@FindBy(xpath = "//*[@id='content']/h2[1]")
	private WebElement myAccountPagemsg;

	// TC_LF_002

	@FindBy(xpath = "//*[text()='Warning: No match for E-Mail Address and/or Password.']")
	private WebElement loginWarningmsg;

	// TC_LF_006

	@FindBy(xpath = "//*[@class='form-group']/a")
	private WebElement lnkForgotpassword;
	@FindBy(xpath="//*[@id='content']/h1")
	private WebElement headingForgotPassword;
	
	//TC_LF_010
	
	@FindBy(xpath="//*[@id='top-links']/ul/li[2]/a/span")
	private WebElement btnMyaccount;
	
	@FindBy(xpath="//*[@id='top-links']/ul/li[2]/ul/li[5]")
	private WebElement btnLogout;
	
	

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
	
	public void clickLogin(int n) {
		for(int i = 0;i<=n;i++)
		{
			btnLogin.click();
		}
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
		public void click_btnMyaccount()
		{
			btnMyaccount.click();
		}
		public void click_btnLogout()
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[5]")));
			btnLogout.click();
		}
		public String getAttributePass()
		{
			return txtPass.getAttribute("type");
		}
}
