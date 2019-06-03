package StepDefinition;

import Util.CommonUtil;
import Util.Log;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class PopupSteps extends CommonUtil {


    @Then("^I see popup with Continue Shopping button$")
    public void iSeePopupWithContinueShoppingButton(){
        waitUntilElementVisible(popup.continueToCart);
        Log.info("\n| I see popup with Continue Shopping button |");
    }

    @And("^I continue shopping$")
    public void iContinueShopping() {
        waitAndClick(popup.continueToShop);
        Log.info("\n| I continue shopping |");
    }

    @And("^I continue to the cart$")
    public void iContinueToTheCart() {
        waitAndClick(popup.continueToCart);
        Log.info("\n| I continue to the cart |");
    }
}
