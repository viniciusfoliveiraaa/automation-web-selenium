package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.Driver;

public class HelperWait {
    public  static void waitPresenceOfElement(WebElement locator, int timeout){
        new WebDriverWait(Driver.getDriver(), timeout).until(ExpectedConditions.visibilityOf(locator));
    }

    public  static void waitPresenceOfElementLocated(WebElement locator, int timeout, String texto){
         new WebDriverWait(Driver.getDriver(), timeout).until(ExpectedConditions.textToBePresentInElement(locator, texto));
    }
}
