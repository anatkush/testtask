package StepDefinition.Hooks;

import Util.CommonUtil;
import Util.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    WebDriver driver;
    CommonUtil setupObj = new CommonUtil();

    @Before
    public void statrUp(Scenario scenario){
        driver = DriverFactory.initialize(scenario.getName());
        setupObj.initialSetup(driver, scenario);
        driver.manage().window().maximize();
    }

    @After
    public void afterTest(){
        driver.close();
    }

}
