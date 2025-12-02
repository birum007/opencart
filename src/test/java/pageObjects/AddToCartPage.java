package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends BasePage {

	public AddToCartPage(WebDriver driver) {

		super(driver);
	}

	// Locators

	@FindBy(xpath = "//*[@id='button-cart']")
	WebElement addTocartButton;

	@FindBy(xpath = "//*[@id='product-product']/div[1]")
	WebElement successMsg;

	@FindBy(xpath = "//*[@id='product-product']/div[1]/a[2]")
	WebElement lnkShoapingCart;
	
	@FindBy(xpath="//*[@id='content']//table//tbody//td[2]/a")
	WebElement prdvrfImac;
	
	@FindBy(xpath="//button[@data-original-title='Add to Wish List']")
	WebElement btnAddWishlist;
	
	@FindBy(xpath="//*[text()='Wish List (1)']")
	WebElement btnWishList;
	
	@FindBy(xpath="//*[@data-original-title='Add to Cart']")
	WebElement btnAddtoCartOfwishlist;
	
	@FindBy(xpath="//*[@id='account-wishlist']/div")
	WebElement msgSuccess;
	
	@FindBy(xpath="//*[@id=\"account-wishlist\"]/div[1]/a[2]")
	WebElement lnkShoapingCartWishlst;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a")
	WebElement prdValidateImacWishPage;

	public void clickTocart() {
		addTocartButton.click();

	}

	public boolean ShowMsg() {

		return successMsg.isDisplayed();

	}

	public void clickLnkShoapCart() {
		lnkShoapingCart.click();
	}

	public boolean prdVerificationImac() {
		return prdvrfImac.isDisplayed();
	}
	
	public void clickbtnAddWishlist() {
		btnAddWishlist.click();
	}
	
	public void clickbtnWishList()
	{
		btnWishList.click();
	}
	public void clickbtnAddtoCartOfwishlist()
	{
		btnAddtoCartOfwishlist.click();
	}
	
	public boolean ShowmsgSuccess() {
		return msgSuccess.isDisplayed();
	}
	
	public void clicklnkShoapingCartWishlst() {
		lnkShoapingCartWishlst.click();
	}
	
	public boolean ShowprdValidateImacWishPage() {
		return prdValidateImacWishPage.isDisplayed();
	}
}
