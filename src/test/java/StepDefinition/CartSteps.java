package StepDefinition;

import Util.CommonUtil;
import Util.Log;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class CartSteps extends CommonUtil {

    @Then("^I see a cart with two selected items inside$")
    public void iSeeCartWithTwoItemsInside() {
        waitUntilElementVisible(cart.continueOrderBtn);
        Assert.assertTrue("", cart.itemsInCart.size() == 2);
        Log.info("\n| I see a cart with two selected items inside |");
    }

    @And("^I check that total price equals to sum of both items price$")
    public void iCheckThatTotalPriceEqualsToSumOfBothItemsPrice() {
        String totalPrice = cart.summaryPrice.getText();
        totalPrice = totalPrice.substring(0, totalPrice.length()-3).replace(" ", "").trim();
        Assert.assertTrue("", Integer.parseInt(totalPrice) == (selectItemsToCart.productOnePrice + selectItemsToCart.productTwoPrice));
        Log.info("\n| I check that total price equals to sum of both items price |");
        Log.info("\n| Total price is :: " + totalPrice + " each item price is :: "
                + selectItemsToCart.productOnePrice + " and " + selectItemsToCart.productTwoPrice + " |");

    }
}
