package pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Product_Comparison_Page extends BasePage {

	public Product_Comparison_Page(WebDriver driver) {
		super(driver);
	}

	// locators

	@FindBy(xpath = "//*[@id=\"product-search\"]/div[1]/a[2]")

	private WebElement lnkProductComaparison;

	@FindBy(xpath = "//*[@id='content']/h1")
	private WebElement txtproductComparison;

	@FindBy(xpath = "//*[@id='content']//a/strong")
	private WebElement confirmProductImac;

	@FindBy(xpath = "//*[@id='product-product']/div[1]/a[1]")
	private WebElement iMacLnk;
	@FindBy(xpath = "//*[@id='content']//table/tbody/tr[2]/td[1]")
	WebElement iMacDisplayImg;

	@FindBy(xpath = "//*[@id='content']/table/tbody/tr/td[2]/a/strong")
	WebElement productAdded;

	// image of product

	@FindBy(xpath = "//*[@id='content']/table[1]/tbody/tr[2]/td/img")
	WebElement prdImageDeatils;

	// price detials
	@FindBy(xpath = "//*[@id='content']/table[1]/tbody/tr[3]/td[1]")
	WebElement priceDetails;

	// moddel
	@FindBy(xpath = "//*[@id='content']/table[1]/tbody/tr[4]/td[1]")
	WebElement modelDetails;

	// Brand
	@FindBy(xpath = "//*[@id='content']/table[1]/tbody/tr[5]/td[1]")
	WebElement brandDetails;
	// summary
	@FindBy(xpath = "//*[@id='content']/table[1]/tbody/tr[8]/td[1]")
	WebElement summaryDetails;

	// Weight detials
	@FindBy(xpath = "//*[@id='content']/table[1]/tbody/tr[9]/td[1]")
	WebElement weightDetails;
	// Dimension
	@FindBy(xpath = "//*[@id='content']/table[1]/tbody/tr[10]/td[1]")
	WebElement dimensioDetails;
	// Add to Cart button

	@FindBy(xpath = "//*[@id='content']/table[1]/tbody[4]/tr/td[5]/input")
	WebElement btnAddtoCart;
	// remove button
	@FindBy(xpath = "//*[@id='content']/table[1]/tbody[2]/tr[1]/td[2]//a")
	WebElement btnRemove;

	// 2nd product added in the comparison//iphone

	@FindBy(xpath = "//*[@id='content']/table//tbody/tr[1]/td[3]/a/strong")
	WebElement prdIphone;

	@FindBy(xpath = "//*[@id='content']/table//tbody/tr[3]/td[3]")
	WebElement iphonePrice;

	@FindBy(xpath = "//*[@id='content']/table//tbody/tr[4]/td[3]")
	WebElement iphoneModel;

	@FindBy(xpath = "//*[@id='content']/table//tbody/tr[5]/td[3]")
	WebElement iPhoneBrand;

	@FindBy(xpath = "//*[@id='content']/table//tbody/tr[8]/td[3]")
	WebElement iphoneSummary;

	@FindBy(xpath = "//*[@id='content']/table//tbody/tr[9]/td[3]")
	WebElement iphoneWeight;

	@FindBy(xpath = "//*[@id='content']/table//tbody/tr[10]/td[3]")
	WebElement iphoneDimension;

	@FindBy(xpath = "//*[@id='content']/table/tbody[2]/tr[1]/td[3]/input")
	WebElement iAddtoCartbt;

	@FindBy(xpath = "//*[@id='content']/table/tbody[2]/tr[1]/td[3]/a")
	WebElement iRemovebtn;

	// Product MAcbook AIR
	@FindBy(xpath = "//*[@id='content']/table/tbody/tr[1]/td[4]/a/strong")
	WebElement prdcomparemacbookAir;

	@FindBy(xpath = "//*[@id='content']/table/tbody/tr[2]/td[4]")
	WebElement imgmacbookAir;

	@FindBy(xpath = "//*[@id='content']/table/tbody/tr[3]/td[4]")
	WebElement priceMacbookAir;

	@FindBy(xpath = "//*[@id='content']/table/tbody/tr[4]/td[4]")
	WebElement modelmacBookAir;

	@FindBy(xpath = "//*[@id='content']/table/tbody/tr[5]/td[4]")
	WebElement brandMacBookAir;

	@FindBy(xpath = "//*[@id='content']/table/tbody/tr[8]/td[4]")
	WebElement summaryMacBookAir;

	@FindBy(xpath = "//*[@id='content']/table/tbody/tr[9]/td[4]")
	WebElement weightMacBookAir;

	@FindBy(xpath = "//*[@id='content']/table/tbody/tr[10]/td[4]")
	WebElement dimensionMacBookAir;

	@FindBy(xpath = "//*[@id='content']/table/tbody/tr[1]/td[4]/input")
	WebElement btnaddtocartMacBook;

	@FindBy(xpath = "//*[@id='content']/table/tbody/tr[1]/td[4]//a[@class='btn btn-danger btn-block']")
	WebElement btnremoveMacBookAir;

	// MacBook compare product details

	// ---- Product Names ----
	@FindBy(xpath = "//*[@class='table table-bordered']/tbody[1]/tr[1]/td[position()>1]")
	private List<WebElement> productNames;

	// ---- Detail Rows ----
	@FindBy(xpath = "//table//tr[td='Price']/td[position()>1]")
	private List<WebElement> priceCells;

	@FindBy(xpath = "//table//tr[td='Model']/td[position()>1]")
	private List<WebElement> modelCells;

	@FindBy(xpath = "//table//tr[td='Brand']/td[position()>1]")
	private List<WebElement> brandCells;

	@FindBy(xpath = "//table//tr[td='Availability']/td[position()>1]")
	private List<WebElement> availabilityCells;

	@FindBy(xpath = "//table//tr[td='Rating']/td[position()>1]")
	private List<WebElement> ratingCells;

	@FindBy(xpath = "//table//tr[td='Summary']/td[position()>1]")
	private List<WebElement> summaryCells;

	@FindBy(xpath = "//table//tr[td='Weight']/td[position()>1]")
	private List<WebElement> weightCells;

	@FindBy(xpath = "//table//tr[td[contains(.,'Dimensions')]]/td[position()>1]")
	private List<WebElement> dimensionCells;

	// ---- Buttons ----
	@FindBy(xpath = "//table//input[@value='Add to Cart']")
	private List<WebElement> addToCartButtons;

	@FindBy(xpath = "//table//a[contains(@class,'btn-danger')]")
	private List<WebElement> removeButtons;

	@FindBy(xpath = "//*[@id='content']/table/tbody/tr/td[5]/a/strong")
	private WebElement prdmacBook;

	@FindBy(xpath = "//*[@id='content']/table/tbody/tr[2]/td[5]")
	private WebElement imgmacBook;

	@FindBy(xpath = "//*[@id='content']/table/tbody/tr[3]/td[5]")
	private WebElement pricemacBook;

	@FindBy(xpath = "//*[@id='content']/table/tbody/tr[4]/td[5]")
	private WebElement modelmacBook;

	@FindBy(xpath = "//*[@id='content']/table/tbody/tr[5]/td[5]")
	private WebElement brandmacBook;

	@FindBy(xpath = "//*[@id='content']/table/tbody/tr[8]/td[5]")
	private WebElement summarymacBook;

	@FindBy(xpath = "//*[@id='content']/table/tbody/tr[9]/td[5]")
	private WebElement weightmacBook;

	@FindBy(xpath = "//*[@id='content']/table/tbody/tr[10]/td[5]")
	private WebElement dimensionmacBook;

	@FindBy(xpath = "//*[@id='content']/table/tbody[4]/tr/td[5]//input[@value='Add to Cart']")
	private WebElement btnAddCartmacBook;

	@FindBy(xpath = "//*[@id='content']/table/tbody[4]/tr/td[5]/a")
	private WebElement btnRemovemacBook;

	@FindBy(xpath = "//table//input[@value='Add to Cart']")
	private WebElement btnAddToCart;

	// Remove Button
	@FindBy(xpath = "//*[@id=\"content\"]/table/tbody[2]/tr/td[2]/a]")
	private WebElement removeBtn;

	// TC 21

	@FindBy(xpath = "//*[@id=\"content\"]/table/tbody[1]/tr[1]/td[2]/a/strong")
	private WebElement iMacprd;

	// TC 22

	@FindBy(xpath = "//div[@id='content']/h1")
	private WebElement pageHeading;

	// TC 23

	@FindBy(xpath = "//*[@value='Add to Cart']")
	private WebElement AddToCartButton;

	@FindBy(xpath = "//*[@class='btn btn-danger btn-block']")
	private WebElement removeButton;
	
	//TC_ATC_007
	
	@FindBy(xpath="//*[@data-original-title='Compare this Product']")
	private WebElement comapareImac;
	@FindBy(xpath="//*[text()='product comparison']")
	private WebElement lnkproductComparison;
	@FindBy(xpath="//*[@id='product-compare']/div[1]")
	private WebElement successAddTocartmsg;
	@FindBy(xpath="//*[text()='shopping cart']")
	private WebElement lnkShoapingcart;
	@FindBy(xpath="//*[@id='content']/form/div/table/tbody[1]/tr/td[2]/a")
	private WebElement iMacproductcnf;
	
	public boolean displayiMacproductcnf()
	{
		return iMacproductcnf.isDisplayed();
	}
	
	public void clicklnkShoapingcart()
	{
		lnkShoapingcart.click();
	}
	
	public boolean DisplaysuccessAddTocartmsg()
	{
		return successAddTocartmsg.isDisplayed();
	}
	
	public void clicklnkproductComparison()
	{
		lnkproductComparison.click();
	}
	
	public void clickcomapareImac()
	{
		comapareImac.click();
	}

	public void clickLinkProductComaparison() {

		lnkProductComaparison.click();
	}

	public boolean displayProductComparison() {
		return txtproductComparison.isDisplayed();

	}

	public boolean confirmProduct() {

		return confirmProductImac.isDisplayed();

	}

	public void clickiMacLnk() {
		iMacLnk.click();
	}

	public boolean iMacDisplay() {
		return iMacDisplayImg.isDisplayed();
	}

	public boolean isPrdadded() {
		return productAdded.isSelected();
	}

	public boolean isImageDisplayed() {
		return prdImageDeatils.isDisplayed();
	}

	public boolean isPriceDisplayed() {
		return priceDetails.isDisplayed();
	}

	public boolean isModelDisplayed() {
		return modelDetails.isDisplayed();

	}

	public boolean isBrandDisplayed() {
		return brandDetails.isDisplayed();
	}

	public boolean isSummaryDisplayed() {
		return summaryDetails.isDisplayed();
	}

	public boolean isweightDisplayed() {
		return weightDetails.isDisplayed();
	}

	public boolean isdimensionDisplayed() {
		return dimensioDetails.isDisplayed();
	}

	public boolean isAddCartBtnDisplayed() {
		return btnAddtoCart.isDisplayed();
	}

	public boolean isRemovebtnDisplayed() {
		return btnRemove.isDisplayed();
	}

	public boolean isIphoneDisplayed() {
		return prdIphone.isDisplayed();
	}

	public boolean isiphonePriceDisplayed() {
		return iphonePrice.isDisplayed();
	}

	public boolean isiphoneModelDisplayed() {
		return iphoneModel.isDisplayed();
	}

	public boolean isIphoneSummaryDisplayed() {
		return iphoneSummary.isDisplayed();
	}

	public boolean isIphoneWeightDisplayed() {
		return iphoneWeight.isDisplayed();
	}

	public boolean isIphoneDimensionDisplayed() {
		return iphoneDimension.isDisplayed();
	}

	public boolean isIphoneAddcartBtnDisplayed() {
		return iAddtoCartbt.isDisplayed();
	}

	public boolean isIphoneRemovebtnDisplayed() {
		return iRemovebtn.isDisplayed();
	}

	public boolean ismacbookAirDisplayed() {
		return prdcomparemacbookAir.isDisplayed();
	}

	public boolean isbtnRemoveDisplayed() {
		return btnremoveMacBookAir.isDisplayed();
	}

	public boolean isbtnAddtoCartDisplayed() {
		return btnaddtocartMacBook.isDisplayed();
	}

	public boolean isDimensionDetailsDisplayed() {
		return dimensionMacBookAir.isDisplayed();
	}

	public boolean weightMacbookDisplay() {
		return weightMacBookAir.isDisplayed();
	}

	public boolean summaryMacBookDisplay() {
		return summaryMacBookAir.isDisplayed();
	}

	public boolean brandMacBookDisplay() {
		return brandMacBookAir.isDisplayed();
	}

	public boolean modelMacBookDisplay() {
		return modelmacBookAir.isDisplayed();
	}

	public boolean priceMacBookDisplay() {
		return priceMacbookAir.isDisplayed();
	}

	public boolean imageMacBookDisplay() {
		return imgmacbookAir.isDisplayed();
	}

	public boolean prdmacBookDisplay() {
		return prdmacBook.isDisplayed();
	}

	public boolean imgmacBookDisplay() {
		return imgmacBook.isDisplayed();
	}

	public boolean pricemacBookDisplay() {
		return pricemacBook.isDisplayed();

	}

	public boolean modelmacBookDisplay() {
		return modelmacBook.isDisplayed();
	}

	public boolean brandMacbookDisplay() {
		return brandmacBook.isDisplayed();
	}

	public boolean summarymacbookDisplay() {
		return summarymacBook.isDisplayed();
	}

	public boolean weightmacBookDisplay() {
		return weightmacBook.isDisplayed();
	}

	public boolean dimensionmacBookDisplay() {
		return dimensionmacBook.isDisplayed();
	}

	public boolean btnAddcartmacbookDisplay() {
		return btnAddCartmacBook.isDisplayed();
	}

	public boolean btnRemoveMacBookDisplay() {
		return btnRemovemacBook.isDisplayed();
	}

	public List<WebElement> getProductNames() {
		return productNames;
	}

	public List<WebElement> getPriceCells() {
		return priceCells;
	}

	public List<WebElement> getModelCells() {
		return modelCells;
	}

	public List<WebElement> getBrandCells() {
		return brandCells;
	}

	public List<WebElement> getAvailabilityCells() {
		return availabilityCells;
	}

	public List<WebElement> getRatingCells() {
		return ratingCells;
	}

	public List<WebElement> getSummaryCells() {
		return summaryCells;
	}

	public List<WebElement> getWeightCells() {
		return weightCells;
	}

	public List<WebElement> getDimensionCells() {
		return dimensionCells;
	}

	public List<WebElement> getAddToCartButtons() {
		return addToCartButtons;
	}

	public List<WebElement> getRemoveButtons() {
		return removeButtons;
	}

	public void clickbtnAddToCart() {
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView", btnAddToCart);
		btnAddToCart.click();
	}

	public void removeIMac() {
		// Actions actions = new Actions(driver);
		// actions.moveToElement(removeBtn).click().perform();
		removeBtn.click();

	}

	public boolean confirmProductiMac() {
		return iMacprd.isDisplayed();
	}

	public String getHeading() {
		return pageHeading.getText();
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getURL() {
		return driver.getCurrentUrl();
	}

	public boolean displayAddToCartButton() {
		return AddToCartButton.isDisplayed();
	}

	public boolean displayremoveButton()

	{
		return removeButton.isDisplayed();
	}
}
