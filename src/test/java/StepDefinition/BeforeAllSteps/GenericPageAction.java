package StepDefinition.BeforeAllSteps;

import Util.FrameworkProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GenericPageAction {

    WebDriver driver;

    public GenericPageAction(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openPage(String path) {
//        if (FrameworkProperties.get("somekey").matches("somevalue")) {
//            driver.get(FrameworkProperties.get("key value") + path);
//        }else{
            driver.get(FrameworkProperties.get("base.url") + path);
//        }
    }
}
