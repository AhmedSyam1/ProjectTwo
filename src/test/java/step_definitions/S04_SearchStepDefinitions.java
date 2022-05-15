package step_definitions;

import Pages.P04_SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.concurrent.TimeUnit;

public class S04_SearchStepDefinitions {

    P04_SearchPage search = Hooks.PageBase.P04_SearchPagePOM();

    @When("user clicks on search field")
    public void user_clicks_search_field()
    {
        search.searchFieldEle();
    }

    @And("user searches with name of product")
    public void user_searches_name_of_product()
    {
        search.searchProdEle("Apple");
        Hooks.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Then("user could find relative results")
    public void user_find_relative_results()
    {
        search.searchAsserEle();
    }
}
