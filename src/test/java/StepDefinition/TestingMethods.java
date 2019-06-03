package StepDefinition;

import Util.Log;
import Util.ToTestOtherFunctionalities;
import cucumber.api.java.en.Given;

public class TestingMethods extends ToTestOtherFunctionalities {

    @Given("^I test Count Backwards method$")
    public void iTestCountBackwardsMethod() {
        countBackwardsTest();
        Log.info("\n| Test of Countbackwards is successfully passed |");
    }
}
