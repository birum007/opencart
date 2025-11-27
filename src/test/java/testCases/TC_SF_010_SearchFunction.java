
package testCases;

	import org.testng.Assert;
	import org.testng.annotations.Test;

	import pageObjects.LandingPage;
	import testBase.BaseClass;

	@Test(groups = { "Sanity", "Master" })
	public class TC_SF_010_SearchFunction extends BaseClass {

		public void producSearch() throws InterruptedException {
			logger.info("***TC_SF_009_SearchFuntion*****Started****");

			LandingPage lp = new LandingPage(driver);
			lp.clickButton();
			lp.setKeyword("iMac");
			lp.selectFromDropdownByText("26");
			lp.clickOnsearchButton();
			String msg=lp.getMassage();
			Assert.assertEquals("There is no product that matches the search criteria.", msg);
			
	
			
	
			
	//incorrect search
			
			
			
			
			

		}

	}



