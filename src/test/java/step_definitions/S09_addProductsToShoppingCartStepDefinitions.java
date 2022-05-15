package step_definitions;

import Pages.P09_addProductsToShoppingCartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class S09_addProductsToShoppingCartStepDefinitions {

    P09_addProductsToShoppingCartPage shoppCart = Hooks.PageBase.P09_addProductsToShoppingCartPagePOM();

    @Given("user checks all his Wishlist products")
    public void Check_Wishlist_products()
    {
        shoppCart.shoppCartProdsCheckEle();
    }

    @Then("user could add his Wishlist products to Shopping Cart")
    public void add_Wishlist_products_to_Shopping_Cart()
    {
        shoppCart.shoppCartADDEle();
        System.out.println("Elements in SKU are present in Shopping Cart");

    }
}
