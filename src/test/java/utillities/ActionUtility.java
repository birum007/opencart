package utillities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtility {

	private WebDriver driver;
	private Actions action;

	public ActionUtility(WebDriver driver) {
		this.driver = driver;
		this.action = new Actions(driver);
	}

	public void hoverOverElement(WebElement element) {
		action.moveToElement(element).perform();
	}

	public void clickElement(WebElement element) {
		action.moveToElement(element).click().perform();
	}

	public void doubleClick(WebElement element) {
		action.doubleClick(element).perform();
	}

	public void rightClick(WebElement element) {
		action.contextClick(element).perform();
	}

	public void dragAnddrop(WebElement source, WebElement target) {
		action.dragAndDrop(source, target).perform();
	}

	public void sendKeys(WebElement element, String value) {
		action.moveToElement(element).sendKeys(value).perform();
	}

	public void scrollElement(WebElement element) {
		action.scrollToElement(element).perform();
	}

}
