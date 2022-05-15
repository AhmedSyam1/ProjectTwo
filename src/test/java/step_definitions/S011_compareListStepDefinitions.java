package step_definitions;

import Pages.P011_compareListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.BrowserUtils;


public class S011_compareListStepDefinitions {

    P011_compareListPage compare = Hooks.PageBase.P011_compareListPagePOM();
    @Given("user can add First Product to Compare")
    public void First_Product_Compare() {
        compare.compareProd1Ele();
        BrowserUtils.waitFor(3);
        System.out.println("First product has been added to your product comparison");
    }

    @And("user can add Second Product to Compare")
    public void Second_Product_Compare() {
        compare.compareProd2Ele();
        BrowserUtils.waitFor(3);
        System.out.println("Second product has been added to your product comparison");
    }

    @And("user can add Third Product to Compare")
    public void Third_Product_Compare() {
        compare.compareProd3Ele();
        BrowserUtils.waitFor(3);
        System.out.println("Third product has been added to your product comparison");
    }

    @When("user navigates to Compare products")
    public void navigate_to_Compare_products()
    {
        compare.comparePageEle();
    }

    @Then("user could compare between the selected products")
    public void compare_between_selected_products()
    {
        compare.compareCheckEle();
        System.out.println("You have three products in the compare table");
    }

    @And("user can clear a product from list")
    public void clear_product()
    {
        compare.compareProdClearEle();
        System.out.println("You have two products in the compare table");
    }

    @And("user deletes all the list")
    public void Delete_all_list() {
        BrowserUtils.waitFor(2);
        String expectedResult = "You have no items to compare.";
        Assert.assertEquals(compare.compareDeleteListEle(), expectedResult, "ERROR: Assertion False!");
        System.out.println("You have no items to compare.");
    }
}

