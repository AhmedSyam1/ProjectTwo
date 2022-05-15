package step_definitions;

import Pages.P06_differentCategoriesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.BrowserUtils;

import java.util.concurrent.TimeUnit;

public class S06_differentCategoriesStepDefinitions {

    P06_differentCategoriesPage category = Hooks.PageBase.P06_differentCategoriesPagePOM();

    @Given("user can select Random Category")
    public void select_random_Category() {
        category.categoryRandomEle();
        BrowserUtils.waitFor(2);
    }

    @Then("user could hover and open sub-Category")
    public void open_subCategory()
    {
        category.categorySubEle();
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
