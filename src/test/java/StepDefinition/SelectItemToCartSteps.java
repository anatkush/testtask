package StepDefinition;

import Util.CommonUtil;
import Util.Log;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class SelectItemToCartSteps extends CommonUtil {

    @Then("^I see page with offers of \"([^\"]*)\"$")
    public void iSeePageWithOffersOf(String tff){
        for(WebElement element : selectItemsToCart.productItems){
            Assert.assertTrue("|\n Element with href atribute :: " + element.getAttribute("href") +  " does not contain :: " + tff + " |",
                    element.getAttribute("href").contains("xiaomi"));
        }
        Log.info("\n| I see page with " + selectItemsToCart.productItems.size() + " offers of :: " + tff + " |");
    }

    @When("^I select price of each item on the page$")
    public void iSelectPriceOfEachItemOnThePage() {
        String price;
        for(WebElement element : selectItemsToCart.itemPrice){
            price = element.getText();
            selectItemsToCart.priceOfItems.add(Integer.valueOf(price.substring(0, price.length()-3).replace(" ", "").trim()));
        }
        Log.info("\n| I select price of each item on the page :: " + selectItemsToCart.priceOfItems + " |");
    }

    @And("^I choose two items with top highest price$")
    public void iChooseTwoItemsWithTopHighestPrice() {
        Object [] prices = selectItemsToCart.priceOfItems.toArray();
        selectItemsToCart.productOnePrice = (Integer) prices[prices.length-1];
        selectItemsToCart.productTwoPrice = (Integer) prices[prices.length-2];
        Log.info("\n| I select two products with top prices that are :: " + selectItemsToCart.productOnePrice
                + " and :: " + selectItemsToCart.productTwoPrice + " |");
    }

    @And("^I add first to the cart$")
    public void iAddFirstToTheCart() {
        String price;
        int counter = 0;
        for(WebElement element : selectItemsToCart.itemPrice){
            price = element.getText();
            price = price.substring(0, price.length()-3).replace(" ", "").trim();
            if(price.equalsIgnoreCase(String.valueOf(selectItemsToCart.productOnePrice))){
                waitAndClick(selectItemsToCart.addToCart.get(counter));
                break;
            }
            counter++;
        }
        Log.info("\n| I add first with price :: " + selectItemsToCart.productOnePrice + " to the cart|");
    }

    @And("^I select second offer with highest price$")
    public void iSelectSecondOfferWithHighestPrice() {
        String price;
        int counter = 0;
        for(WebElement element : selectItemsToCart.itemPrice){
            price = element.getText();
            price = price.substring(0, price.length()-3).replace(" ", "").trim();
            if(price.equalsIgnoreCase(String.valueOf(selectItemsToCart.productTwoPrice))){
                waitAndClick(selectItemsToCart.addToCart.get(counter));
                break;
            }
            counter++;
        }
        Log.info("\n| I select second offer with highest price :: " + selectItemsToCart.productTwoPrice + " |");
    }
}
