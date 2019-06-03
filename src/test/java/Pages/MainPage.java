package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span(contains(text(), 'Vyberte si kategorii'))")
    public WebElement chooseCategory;

    @FindBy(css = "[class*='-smartphone']")
    public WebElement mobilesAndPcs;

    @FindBy(css = "[href *= 'mobilni-telefony-xiaomi']")
    public WebElement xiaomiPhones;

    @FindBy(css = "[class*='btn-back-to-top']")
    public WebElement backToTopBtn;

    @FindBy(css = "[class=mg-partners]")
    public WebElement footer;

    public By footerLocator = By.cssSelector("[class='mg-partners']");

    @FindBy(css = "[class='btn-control-flt-bnr']")
    public WebElement mainPageAddvert;

}
