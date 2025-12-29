package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListTestCase extends BasePage {
//Constructor
	public WishListTestCase(WebDriver driver) {
		super(driver);
	}

	// TC_WL_002
	@FindBy(xpath = "//*[@class='caption']/h4/a")
	private WebElement prdImac;
	@FindBy(xpath = "//*[@id='content']/div[2]/div/div/div[3]/button[2]")
	private WebElement btnWishTocart;
	@FindBy(xpath = "//*[text()=' Success: You have added ']")
	private WebElement msgSuccess;
	@FindBy(xpath = "//*[@id='product-product']/div[1]/a[2]")
	private WebElement linkWishList;
	@FindBy(xpath = "//*[text()='Apple Cinema 30\"']")
	private WebElement prdDisplayconfrm;

	public void clickImac() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", prdImac);
		prdImac.click();
	}

	public void scrollAndclick() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView", btnWishTocart);
		btnWishTocart.click();
	}

	public boolean displayMsg() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView", msgSuccess);
		String msg = msgSuccess.getText();
		return msg != null & msg.contains("Success");

	}

	public void clickLinkwishList() {
		linkWishList.click();
	}

	public boolean prdDisplayconfirmation() {
		return prdDisplayconfrm.isDisplayed();
	}

}
