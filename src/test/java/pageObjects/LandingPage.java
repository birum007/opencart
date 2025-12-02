package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LandingPage extends BasePage {

	public LandingPage(WebDriver driver) {
		super(driver);
	}
	// Locators

	@FindBy(xpath = "//*[@name='search']")
	private WebElement txtsearch;

	@FindBy(css = "*.btn.btn-default.btn-lg")
	private WebElement btnsearch;

	@FindBy(xpath = "//img[@title='iMac']")
	private WebElement prdimac;

	@FindBy(xpath = "//*[@id='content']/p[2]")
	private WebElement confmsg;

	@FindBy(xpath = "//*[@id='input-search']")
	private WebElement txtsearchCriteria;

	@FindBy(xpath = "//*[@id='button-search']")
	private WebElement criteriaBtn;

	@FindBy(xpath = "//*[@class='img-responsive']")
	private List<WebElement> searchresult;

	// category dropdown
	@FindBy(xpath = "//*[@name='category_id']")
	private WebElement catdropdown;
	// prd imac

	@FindBy(xpath = "//a[text()='iMac']")
	private WebElement imac_product;
	
	@FindBy(xpath = "//*[@id='content']/p[2]")
	private WebElement notfoundmsg;
	// prd imac click

	@FindBy(xpath = "//*[@class='image']/a/img")
	private WebElement imgImac;

	// product iPhone

	@FindBy(xpath = "//*[@id='content']/div[3]/div/div/div/div/h4/a")
	private WebElement iphoneClick;

	// compareproduct button 1
	@FindBy(xpath = "//button[@data-original-title='Compare this Product']")
	private WebElement btncompareproduct;
	
	//compareproduct button 2 at same oage
	@FindBy(xpath="//*[@id='content']/div[3]//button[3]")
	WebElement compareThisProductAtSearch;

	// success massage after cart addition
	@FindBy(xpath = "//*[@id='product-product']/div[1]")
	private WebElement successMassage;

	// Destops hover menu

	@FindBy(xpath = "//*[@id='menu']/div[2]/ul/li[1]/a[1]")
	private WebElement menuDesktops;

	@FindBy(xpath = "//*[@id='menu']/div[2]/ul/li[1]/div/a")
	private WebElement ShowAllDesktop;

	@FindBy(xpath = "//*[@id='compare-total']")
	private WebElement lnkcomparetotal;
//	/You have not chosen any products to compare.

	@FindBy(xpath = "//*[@id='content']/h1")
	private WebElement msgproductComparison;
	
	
	// continou button

	@FindBy(xpath = "//*[@class='btn btn-default']")
	private WebElement btnContinue;

	// Breadcrumb button

	@FindBy(xpath = "//*[@id='product-compare']/ul/li/a/i")
	private WebElement homebtn;

	// Macbook Air element
	@FindBy(xpath = "//*[@id='content']/div[3]/div/div/div/a")
	private WebElement macbookAir;

	// MacBook element
	@FindBy(xpath = "//*[@id='content']/div[3]/div/div/div//img[@alt='MacBook']")
	private WebElement macBook;
	//macBook Pro
	
	@FindBy(xpath="//*[@id='content']//*[@class='image']")
	WebElement macBookPro; 
	
	@FindBy(xpath="//a[normalize-space()='product comparison']")
	WebElement compareProductlnk;

	public void clickHomebtn() {
		homebtn.click();
	}

	public void clickbtnContinue() {
		btnContinue.click();
	}

	public boolean msgproductComparisonDisplay() {
		return msgproductComparison.isDisplayed();
	}

	public void clicklnkcomparetotal() {
		lnkcomparetotal.click();
	}

	public void clickShowAllDesktop() {
		ShowAllDesktop.click();
	}

	public void hoverToDesktops() {
		Actions action = new Actions(driver);
		action.moveToElement(menuDesktops).perform();
		
	}

	public void clickImac() {
		imgImac.click();

	}

	public String getMassage() {
		return notfoundmsg.getText();
	}

	public String getProdiMac() {
		return imac_product.getText();

	}

	public void selectFromDropdownByText(String value) {
		Select select = new Select(catdropdown);
		select.selectByValue(value);

	}

	public void search(String prd) {
		txtsearch.sendKeys(prd);
	}

	public void clearSearchField() {
		txtsearch.clear();
	}

	public void clickButton() {
		btnsearch.click();
	}

	public boolean prdDisplayed() {
		return prdimac.isDisplayed();
	}

	public boolean foundPrd() {
		return confmsg.isDisplayed();
	}

	public void setKeyword(String prdname) {
		txtsearchCriteria.sendKeys(prdname);
	}

	public void clickOnsearchButton() {
		criteriaBtn.click();
	}

	public int getNumberOfResult() {
		return searchresult.size();
	}

	public void clickcompareProd() {
		btncompareproduct.click();
	}

	public boolean displaySuccessMassage() {
		return successMassage.isDisplayed();
	}

	public void iphoneClickLnk() {
		iphoneClick.click();
	}

	public void macbookairClick() { // Macbook Air click
		macbookAir.click();
	}

	public void clickMacBook() {
		macBook.click();
	}
	
	public void clickmacBookPro() {
		macBookPro.click();	}
	public void clickCompareThisProductAtSearch() {
		compareThisProductAtSearch.click();
	}
	public void clickCompareProductlnk() {
		compareProductlnk.click();
	}
}
