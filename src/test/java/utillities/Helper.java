package utillities;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Helper {

    // Get text from list of elements
    public static List<String> getTextFromElements(List<WebElement> elements) {
        List<String> texts = new ArrayList<>();
        for (WebElement ele : elements) {
            texts.add(ele.getText().trim());
        }
        return texts;
    }

    // Check element visibility safely
    public static boolean isElementDisplayed(WebDriver driver, By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    // Small wait (not recommended in real time, better to use WebDriverWait)
    public static void waitForSeconds(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
