package StepDefinition;

import Util.CommonUtil;
import Util.Log;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class MainPageSteps extends CommonUtil {

    @When("I choose a category")
    public void iChooseACategory() {
        clickElementWithJs(mainPage.chooseCategory);
        Log.info("\n| I choose a category |");
    }

    @And("I select Mobiles and PCs")
    public void iSelectMobilesAndPCs() {
        clickElementWithJs(mainPage.mobilesAndPcs);
        Log.info("\n| I select Mobiles and PCs |");
    }

    @And("I select Xiaomi Phones")
    public void iSelectXiaomiPhones() {
        clickElementWithJs(mainPage.xiaomiPhones);
        Log.info("\n| I select Xiaomi Phones |");
    }

    @And("^I see that page has been loaded$")
    public void iSeeThatPageHasBeenLoaded() {
        waitUntilElementPresent(mainPage.footerLocator);
        scrollToElementAndShiftUpOrDown(mainPage.footer, -100);
        waitAndIfPresentClose(mainPage.mainPageAddvert);
        waitAndClick(mainPage.backToTopBtn);
        Log.info("\n| I ensure that page is loaded |");
    }
}
