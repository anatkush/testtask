package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Popup {

    public Popup(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[data-sel='continue-to-shop']")
    public WebElement continueToShop;

    @FindBy(css = "[data-sel='continue-to-cart']")
    public WebElement continueToCart;
}
