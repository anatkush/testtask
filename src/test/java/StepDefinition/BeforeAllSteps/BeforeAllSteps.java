package StepDefinition.BeforeAllSteps;

import Util.DriverFactory;
import Util.Log;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class BeforeAllSteps {

    WebDriver driver;

    public BeforeAllSteps(DriverFactory driver) {

        this.driver = driver.getDriver();
    }

    @Given("^I have opened main shop page \"([^\"]*)\"$")
    public void ihaveOpenedMainShopPage(String tff) {
        long startTime = System.currentTimeMillis();
        new GenericPageAction(driver).openPage(tff);
        long endTime = System.currentTimeMillis();
        long pageLoadTime = endTime - startTime;
        Log.info("\n| Page load time is :: " + pageLoadTime + " |");
    }
}
