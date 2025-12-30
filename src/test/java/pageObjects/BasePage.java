package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utillities.ActionUtility;

public class BasePage {

	WebDriver driver;
	WebDriverWait wait;
	ActionUtility actionUtils;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
		actionUtils = new ActionUtility(driver);
	}
	

}
