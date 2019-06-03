package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Cart {

    public Cart(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[class='cart-item clearfix']")
    public List<WebElement> itemsInCart;

    @FindBy(css = "[class='cart-item clearfix']")
    public List<WebElement> itemPricesInCart;

    @FindBy(css = "[class*='summary-price']")
    public WebElement summaryPrice;

    @FindBy(css = "[data-sel='cartContinueOrder']")
    public WebElement continueOrderBtn;
}
