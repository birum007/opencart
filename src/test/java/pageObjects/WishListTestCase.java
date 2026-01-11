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
	
	//TC_WL_003
	@FindBy(xpath="//*[text()='Qafox.com']")
	private WebElement pageLogo;
	@FindBy(xpath="//*[@id='content']/div[2]/div[1]/div/div[3]/button[2]")
	private WebElement wishToCartFeature;
	@FindBy(xpath="//*[@id='common-home']/div/a[2]")
	private WebElement linkwishlistfeature;
	@FindBy(xpath="//*[@id='content']/div[1]/table/tbody/tr/td[2]/a")
	private WebElement wishListprdDisplay;
	
	//TC_WL_004
	
	@FindBy(xpath="//*[text()='Desktops']")
	private WebElement menuDesktops;
	@FindBy(xpath="//*[text()='Show AllDesktops']")
	private WebElement showAllDesktops;
	@FindBy(xpath="//*[@id='column-left']/div/a[3]")
	private WebElement MacLeftSubMenu;
	@FindBy(xpath="//button[@data-original-title='Add to Wish List']")
	private WebElement addTocartButton;
	@FindBy(xpath="//*[text()='wish list']")
	private WebElement linkWish;
	@FindBy(xpath="//*[@id='content']/div[1]/table[1]/tbody[1]/tr/td[2]/a")
	private WebElement productWishList;
	
	
	//TC_WL_005
	@FindBy(xpath="//*[@data-original-title='Add to Wish List']")
	private WebElement btnwishList;
	@FindBy(xpath="//*[text()=' Success: You have added ']")
	private WebElement msgAfterClickwish;
	@FindBy(xpath="//*[@id='product-search']/div[1]/a[2]")
	private WebElement lnkWishList;
	@FindBy(xpath="//*[@id='content']/div[1]/table/tbody/tr/td[2]")
	private WebElement wishListedPrd;
	
	
	//TC_WL_006
	@FindBy(xpath="//*[@id='content']/div[3]/div/div/div/a")
	private WebElement searchResultImac;
	@FindBy(xpath="//*[@id='content']/div/div[2]/div/button[1]")
	private WebElement rightBtnAddToWishList;
	@FindBy(xpath="//*[text()='wish list']")
	private WebElement lnkWishListRight;
	@FindBy(xpath="//*[@id='content']/h2")
	private WebElement headerWishListPage;
	
	//TC_WL_007
	@FindBy(xpath="//*[@id='wishlist-total']")
	private WebElement totalWishlistHeaderbtn;
	@FindBy(xpath="//h2[text()='My Wish List']")
	private WebElement headerWishList;
	
	//TC_WL_008
	@FindBy(xpath="//*[@id='column-right']/div/a[5]")
	private WebElement rightColoumnWishListbtn;
	
	//TC_WL_009
	@FindBy(xpath="//*[@id='column-right']/div/a[1]")
	private WebElement rightColoumnMyaccountPage;
	@FindBy(xpath="//*[@id='account-account']/div/div/ul[1]/li[4]/a")
	private WebElement lnkModifyWishList;
	
	//TC_WL_010
	@FindBy(xpath="/html/body/footer/div/div/div[4]/ul/li[3]/a")
	private WebElement footerWishListlnk;
	
	//TC_WL_011
	@FindBy(css="ul.breadcrumb")
	private WebElement breadcrumbLnk;
	
	//TC_WL_013
	@FindBy(xpath="//*[@id='content']/p")
	private WebElement wishListEmptymsg;
	@FindBy(xpath="//*[text()='Continue']")
	private WebElement btnContinou;
	@FindBy(xpath="//*[@id ='content']/h2[1]")
	private WebElement accountPagemsg;
	
	public boolean display_accountPagemsg()
	{
		return accountPagemsg.isDisplayed();
	}
	
	public void clickOnbtnContinou()
	{
		btnContinou.click();
	}
	
	public  String getEmptymsg()
	{
		return wishListEmptymsg.getText().trim();
	}
	public String getURL()
	{
		return driver.getCurrentUrl();
	}
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getHeading()
	{
		return pageLogo.getText().trim();
	}
	
	public boolean displaybreadcrumbLnk()
	{
		return breadcrumbLnk.isDisplayed();
	}
	
	public void click_footerWishListlnk()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", footerWishListlnk);
		//footerWishListlnk.click();
		js.executeScript("arguments[0].click()", footerWishListlnk);

	}
	
	public void click_lnkModifyWishList()
	{
		lnkModifyWishList.click();
	}
	
	public void clickrightColoumnMyaccountPage()
	{
		rightColoumnMyaccountPage.click();
	}
	
	public void clickRightColoumnWishListbtn()
	{
		rightColoumnWishListbtn.click();
	}
	
	public boolean displayheaderWishList()
	{
		return headerWishList.isDisplayed();
	}
	public void clickWishListHeader()
	{
		totalWishlistHeaderbtn.click();
	}
	public boolean wishListHeader()
	{
		String msg = headerWishListPage.getText();
		return (msg.contains("Wish") && msg!=null);
	}
	public void click_lnkWishListRight()
	{
		lnkWishListRight.click();
	}
	
	
	public void click_rightBtnAddToWishList()
	{
		rightBtnAddToWishList.click();
	}
	
	public void click_searchResultImac()
	{
		searchResultImac.click();
	}
	
	
	public boolean displayProduct()
	{
		return wishListedPrd.isDisplayed();
	}
	
	public void click_lnkWishList()
	{
		lnkWishList.click();
	}
	public boolean msgDisplayed()
	{
		String msg =msgAfterClickwish.getText();
		return (msg.contains("Success") && msg!= null);
	}
	
	public void clickAddTowishBtn()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", btnwishList);
		btnwishList.click();
	}
	
	public boolean display_productWishList()
	{
		return productWishList.isDisplayed();
	}
	
	public void click_linkWish()
	{
		linkWish.click();
	}
	public void click_addTocartButton()
	{
		addTocartButton.click();
	}
	
	public void click_MacLeftSubMenu()
	{
		MacLeftSubMenu.click();
	}
	public void hoverOverElement()
	{
		actionUtils.hoverOverElement(menuDesktops);
		actionUtils.clickElement(showAllDesktops);
	}
	
	public String displayPrd()
	{
		return wishListprdDisplay.getText();
	}
	public void click_linkwishlistfeature()
	{
		linkwishlistfeature.click();
	}
	public void click_wishToCartFeature()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", wishToCartFeature);
		wishToCartFeature.click();
	}
	
	public boolean displayLogo()
	{
		return pageLogo.isDisplayed();
	}
	public void clickLogo()
	{
		pageLogo.click();
	}

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
