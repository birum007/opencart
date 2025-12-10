package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	//Test caseTC_ATC_003
	
	@FindBy(xpath="//span[normalize-space()='Add to Cart']")
	private WebElement btnAddToCart;
	
	@FindBy(xpath="//span[@id='cart-total']")
	private WebElement btnItem;
	
	@FindBy(xpath="//*[@id='cart']/ul/li[2]/div/p/a[1]/strong")
	private WebElement btnViewcart;
	@FindBy(xpath="//*[@id='product-search']/div[1]")
	private WebElement msgAddedTocart;
	@FindBy(xpath="//*[@id='content']/form/div/table/tbody/tr/td[2]/a")
	private WebElement cnfprdImac;
	
	//TC_ATC_004
	@FindBy(xpath="//*[text()='Apple Cinema 30\"']")
	private WebElement clickprdAppleCinema;
	@FindBy(xpath="//*[@id='content']/div[2]/div[1]/div/div[3]/button[1]")
	private WebElement AddTocartIphone;
	@FindBy(xpath="//*[@id='product-product']/div[1]")
	private WebElement msgsuccessIphone;
	@FindBy(xpath="//*[text()='shopping cart']")
	private WebElement lnkshoppingCart;
	@FindBy(xpath="//*[@id='content']/form/div/table/tbody/tr/td[2]/a")
	private WebElement prdIphone;
	
	//TC_ATC_005
	
	@FindBy(xpath="//*[text()='Desktops']")
	private WebElement menuDesktops;
	@FindBy(xpath="//*[text()='Show AllDesktops']")
	private WebElement showAllDesktops;
	@FindBy(xpath="//*[@id='column-left']/div/a[3]")
	private WebElement leftMac;
	@FindBy(xpath="//span[text()='Add to Cart']")
	private WebElement btnMacAddtocart;
	@FindBy(xpath="//*[@id='product-category']/div[1]")
	private WebElement msgAfterCart;
	@FindBy(xpath="//*[text()='shopping cart']")
	private WebElement lnkShoapingcart;
	@FindBy(xpath="//*[@id='content']/form/div/table/tbody[1]/tr/td[2]/a")
	private WebElement prdConfirmationImac;
	
	//TC_ATC_006
	@FindBy(xpath="//*[@id='content']/div[2]/div[1]/div/div[3]/button[1]")
	private WebElement prdMacBook;
	@FindBy(xpath="//*[text()='shopping cart']")
	private WebElement lnkShoapingverify;
	@FindBy(xpath="//span[contains(text(),'***')]/preceding-sibling::a")
	private WebElement macBookprdVrf;
	
	//TC_ATC_008
	
	@FindBy(xpath="//*[contains(text(),' 1 item(s)')]")
	private WebElement itemsCount;
	
	public boolean getTextitem()
	{
		return itemsCount.getText().contains("1 item(s)");
	}
	
	
	
	
	public void clickTocart() {
		addTocartButton.click();

	}
	public String getTextAddTocart() {
		return addTocartButton.getText();

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
	
	public void clickAddTocart()
	{
		btnAddToCart.click();
	}
	public void clickbtnItem()
	{
		btnItem.click();
	}
	public void clickbtnViewcart()
	{
		btnViewcart.click();
	}
	public boolean msgAddedTocart()
	{
		return msgAddedTocart.isDisplayed();
	}
	
	public boolean displaycnfprdImac()
	{
		return cnfprdImac.isDisplayed();
	}
	public void clickprdAppleCinema()
	{
		clickprdAppleCinema.click();
	}
	
	public void clickAddTocartIphone()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", AddTocartIphone);
		AddTocartIphone.click();

	}
	
	public boolean displaymsgsuccessIphone()
	{
		return msgsuccessIphone.isDisplayed();
	}
	public void clicklnkshoppingCart()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView", lnkshoppingCart);
		lnkshoppingCart.click();
	}
	public boolean DisplayprdIphone()
	{
		return prdIphone.isDisplayed();
	}
	
	//TC_ATC_005
	
	public void mouseHoverActions()
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(menuDesktops).perform();
	}
	
	public void clickshowAllDesktops()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement showAllDesktops= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Show AllDesktops']")));
		showAllDesktops.click();
	}
	public void clickleftMac()
	{
		leftMac.click();
	}
	public void clickbtnMacAddtocart()
	{
		btnMacAddtocart.click();
	}
	public boolean displayMsgSuccess()
	{
		return msgAfterCart.isDisplayed();
	}
	public void clicklnkShoapingcart()
	{
		lnkShoapingcart.click();
	}
	public boolean displayprdConfirmationImac()
	{
		return prdConfirmationImac.isDisplayed();
	}
	public void clickprdMacBook()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView", prdMacBook);
		prdMacBook.click();
	}
	public void clicklnkShoapingverify()
	{
		lnkShoapingverify.click();
	}
	public boolean displaymacBookprdVrf()
	{
		return macBookprdVrf.isDisplayed();
	}
}
