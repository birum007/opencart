package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	//Constructor coming from parent class
	public HomePage(WebDriver driver) {
		super(driver);

	}
	//Locators
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement LnkMyaccount;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement txtLogin;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement LnkRegister;
	
	@FindBy(xpath="//*[@id='content']/h1")
	WebElement msglogout;
	
	@FindBy(xpath="//*[@id='logo']/h1/a")
	WebElement logolnk;
	
	
	//Action methods
	
	public boolean logoDisplay() {
		
		return logolnk.isDisplayed();
		
	}
	
	public void clickMyAccount()
	{
		LnkMyaccount.click();
	}
	public boolean displayMyAccount()
	{
		return LnkMyaccount.isDisplayed();
	}

	
	public void clickRegister()
	{
		LnkRegister.click();
	}
	public void clickLogin()
	{
		txtLogin.click();
	}
	public boolean isAccountLogout()
	{
		try {
		return msglogout.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	
	
}
