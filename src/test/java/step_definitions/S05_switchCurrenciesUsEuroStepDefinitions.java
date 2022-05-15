package step_definitions;

import Pages.P05_switchCurrenciesUsEuroPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BrowserUtils;

public class S05_switchCurrenciesUsEuroStepDefinitions {

    P05_switchCurrenciesUsEuroPage switchCurr = Hooks.PageBase.P05_switchCurrenciesUsEuroPagePOM();

    @Given("user selects a product")
    public void select_a_product() {
        switchCurr.switchSelProdEle();
        BrowserUtils.waitFor(2);
    }

    @When("user changes the currency")
    public void changes_currency() {
        switchCurr.switchCurrEle();
        BrowserUtils.waitFor(2);
    }

    @Then("user could find the selected currency")
    public void find__selected_currency()
    {
        switchCurr.switchAsserEle();
        System.out.println("Price of the product appears in Euro currency");
    }
}
