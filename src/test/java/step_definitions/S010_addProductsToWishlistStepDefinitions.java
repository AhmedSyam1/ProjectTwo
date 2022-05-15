package step_definitions;

import Pages.P010_addProductsToWishlistPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BrowserUtils;

public class S010_addProductsToWishlistStepDefinitions {

    P010_addProductsToWishlistPage wishList = Hooks.PageBase.P010_addProductsToWishlistPagePOM();

    @Given("user selects his favorite product")
    public void select_favorite_product()
    {
        wishList.wishListCateSelectEle();
    }

    @When("user adds a product to the Wishlist")
    public void add_product_Wishlist() {
        wishList.wishListProd1AddEle();
        BrowserUtils.waitFor(3);
        System.out.println("First product has been added to your wishlist");
    }

    @And("user adds another product to the Wishlist")
    public void add_another_product_to_Wishlist() {
        wishList.wishListProd2AddEle();
        BrowserUtils.waitFor(3);
        System.out.println("Second product has been added to your wishlist");
    }

    @Then("logged user navigates to his Wishlist page")
    public void navigates_to_Wishlist()
    {
        wishList.wishListPageEle();
        System.out.println("You have two products in your Wishlist table");
    }
}
