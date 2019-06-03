package Util;

import Pages.Cart;
import Pages.MainPage;
import Pages.Popup;
import Pages.SelectItemsToCart;
import cucumber.api.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static org.junit.Assert.fail;

public class CommonUtil {
    public static WebDriver driver;

    public static WebDriverWait wait;
    int timeOut = Integer.parseInt(FrameworkProperties.get("max.timeout"));
    public static int runNum = 0;
    public static Scenario scenario;
    public static MainPage mainPage;
    public static SelectItemsToCart selectItemsToCart;
    public static Popup popup;
    public static Cart cart;

    public void initialSetup(WebDriver driver, Scenario scenario) {
        CommonUtil.driver = driver;
        CommonUtil.scenario = scenario;
        initializeComponenctObjects();
        wait = new WebDriverWait(driver, timeOut);
    }

    public void initializeComponenctObjects() {

        mainPage = new MainPage(driver);
        selectItemsToCart = new SelectItemsToCart(driver);
        popup = new Popup(driver);
        cart = new Cart(driver);
    }

    public void waitUntilElementVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            fail("The element is not found on page: " + element);
        }
    }

    public void waitUntilElementPresent(By element) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(element));
        } catch (Exception e) {
            fail("The element is not found on page: " + element);
        }
    }

    public void waitAndIfPresentClose(WebElement element){
        if(element.isDisplayed()){
            waitAndClick(element);
        }
    }

    public void waitAndClick(WebElement element) {
        waitUntilElementVisible(element);
        element.click();
    }

    public void scrollToElementAndShiftUpOrDown(WebElement element, int shiftPoints) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, " + shiftPoints + ");");
    }

    public void clickElementWithJs(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }
}
