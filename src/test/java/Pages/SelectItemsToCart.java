package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SelectItemsToCart {

    public SelectItemsToCart(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public Set<Integer> priceOfItems = new TreeSet();
    public int productOnePrice, productTwoPrice;

    @FindBy(css = "[class='lst-product-item-body'] a")
    public List<WebElement> productItems;

    @FindBy(css = "[class=lst-product-item-price] [class=lst-product-item-price-value]")
    public List<WebElement> itemPrice;

    @FindBy(css = "[data-sel='productCountNumber']")
    public List<WebElement> productCountNumber;

    @FindBy(css = "[class='btn-inset lay-block']")
    public List<WebElement> addToCart;


}
