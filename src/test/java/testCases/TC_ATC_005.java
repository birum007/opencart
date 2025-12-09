package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddToCartPage;
import testBase.BaseClass;

public class TC_ATC_005 extends BaseClass {
	
	@Test(groups= {"master"})
	public void validate_TC_ATC_005() throws InterruptedException
	{
		logger.info("statrting *************TC_ATC_005********************** ");
		
		AddToCartPage atc = new AddToCartPage(driver);
		atc.mouseHoverActions();
		
		atc.clickshowAllDesktops();
		atc.clickleftMac();
		atc.clickbtnMacAddtocart();
		Thread.sleep(3000);
		Assert.assertTrue(atc.displayMsgSuccess());
		
		atc.clicklnkShoapingcart();
		Assert.assertTrue(atc.displayprdConfirmationImac(),"Imac Displayed !");
		;
	}

}
