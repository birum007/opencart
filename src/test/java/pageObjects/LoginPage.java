package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	@FindBy(xpath = "//*[@id='content']/h1")
	private WebElement headingForgotPassword;

	// TC_LF_010

	@FindBy(xpath = "//*[@id='top-links']/ul/li[2]/a/span[1]")
	private WebElement btnMyaccount;

	@FindBy(xpath = "//*[@id='top-links']/ul/li[2]/ul/li[5]")
	private WebElement btnLogout;

	// TC_LF_016
	@FindBy(xpath = "//*[text()='Change your password']")
	private WebElement lnkchangePassword;
	@FindBy(xpath = "//*[@id='input-password']")
	private WebElement enterChangePassword;
	@FindBy(xpath = "//*[@id='input-confirm']")
	private WebElement confirmChangePassword;
	@FindBy(xpath = "//*[@value='Continue']")
	private WebElement btnContinou;
	@FindBy(xpath = "//*[text()='Continue']")
	private WebElement btnContinue;
	// TC_LG_001
	@FindBy(xpath = "//*[@id='content']/h1")
	private WebElement headingAccountLogout;
	@FindBy(xpath = "//*[@id='logo']/h1/a")
	private WebElement logoHomePage;

	// TC_LG_002

	@FindBy(xpath = "//*[@id='column-right']/div/a[13]")
	private WebElement sideColoumnLogout;
	
	//TC_LG_005
	
	@FindBy(xpath="//*[@class='dropdown-menu dropdown-menu-right']/li")
	private List<WebElement> dropDownMyaccount;
	
	//TC_LG_009
	
	@FindBy(xpath="//*[@class='breadcrumb']/li/a")
	private List<WebElement> breadcrumbElement;
	//TC_LG_006
	
	@FindBy(xpath="//*[@id='column-right']/div/a")
	private List<WebElement> rightColoumnOptions;
	//TC_LG_004
	@FindBy(xpath="//*[@id='column-right']/div/a[1]")
	private WebElement myAccount;
	@FindBy(xpath="//*[text()='Returning Customer']")
	WebElement loginMassage;

	// Action Methods
	
//	/TC_LG_004
	public boolean display_loginMassage()
	{
		return loginMassage.isDisplayed();
	}
	public void click_myAccount()
	{
		myAccount.click();
	}
	public void browserBackAfterLogout()
	{
		driver.navigate().back();
	}
	
	public boolean isLogoutPresent()
	{
		boolean target=true;
		for(WebElement element : rightColoumnOptions )
		{
			if(element.getText()=="Logout")
			{
				target=true;
			}
		}
		return false;
	}
	
	public boolean getElement()
	{
		for(WebElement el :breadcrumbElement)
		{
			String trg = el.getText();
			if(trg.contains("Logout") || trg.contains("Account"))
			{
				return true;
			}
		}
		return false;
		
	}
	
	public boolean diaplay_dropDownMyaccount()
	
	{
		for(WebElement values : dropDownMyaccount)
		{
			String target =values.getText();
			if(target.contains("Logout"))
			{
				return true;
			}
			
		}
		return false;
		 
	}

	public void click_sideColoumnLogout() {
		sideColoumnLogout = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='column-right']/div/a[13]")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", sideColoumnLogout);
		//sideColoumnLogout = wait
			//	.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='column-right']/div/a[13]")));
		//sideColoumnLogout.click();
		js.executeScript("arguments[0].click()", sideColoumnLogout);
	}

	public boolean display_logoHomePage() {
		return logoHomePage.isDisplayed();
	}

	public void click_btnContinue() {
		btnContinue.click();
	}

	public boolean display_headingAccountLogout() {
		return headingAccountLogout.isDisplayed();
	}
	public String conf_headingAccountLogout() {
		return headingAccountLogout.getText();
	}
	
	public String  getTitleOfLogoutPage()
	{
		return driver.getTitle();
	}
	
	public String getLogoutPageUrl()
	{
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public void click_btnContinou() {
		btnContinou.click();
	}

	public void enterconfirmChangePassword(String cpass) {
		confirmChangePassword.sendKeys(cpass);
	}

	public void enterNewPassword(String npass) {
		enterChangePassword.sendKeys(npass);
	}

	public void click_lnkchangePassword()

	{
		lnkchangePassword = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Change your password']")));
		lnkchangePassword.click();
	}

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
		for (int i = 0; i <= n; i++) {
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

	public void click_lnkForgotpassword() {
		lnkForgotpassword.click();
	}

	public boolean display_headingForgotPassword() {
		return headingForgotPassword.isDisplayed();
	}

	public void keyPadAction() {
		// Actions action = new Actions(driver);
		for (int i = 0; i < 24; i++) {
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-email']")));

	}

	public void singleTabAction() {
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-password']")));
	}

	public void doubleTabAction() {
		for (int i = 0; i < 3; i++) {
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Login']")));
		}
	}

	public void enterAction() {
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Login']")));
	}

	public String getPlaceholderEmail() {
		return txtEmailAddress.getAttribute("placeholder");
	}

	public String getPlaceholderPwd() {
		return txtPass.getAttribute("placeholder");
	}

	public void browserBack() {
		driver.navigate().back();
	}

	public void click_btnMyaccount() {
		btnMyaccount.click();
	}

	public void click_btnLogout() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[5]")));
		btnLogout.click();
	}

	public String getAttributePass() {
		return txtPass.getAttribute("type");
	}
}
