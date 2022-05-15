package Pages;

import org.openqa.selenium.WebDriver;

public class Page_Base {

    public WebDriver driver;


    public Page_Base(WebDriver driver) {
        this.driver = driver;
    }

    public P01_registrationPage P01_registrationPagePOM()
    {
        return new P01_registrationPage(driver);
    }

    public P02_loginPage P02_loginPagePOM()
    {
        return new P02_loginPage(driver);
    }

    public P03_resetPasswordPage P03_resetPasswordPagePOM()
    {
        return new P03_resetPasswordPage(driver);
    }

    public P04_SearchPage P04_SearchPagePOM()
    {
        return new P04_SearchPage(driver);
    }

    public P05_switchCurrenciesUsEuroPage P05_switchCurrenciesUsEuroPagePOM()
    {
        return new P05_switchCurrenciesUsEuroPage(driver);
    }

    public P06_differentCategoriesPage P06_differentCategoriesPagePOM()
    {
        return new P06_differentCategoriesPage(driver);
    }

    public P07_filterWithColorPage P07_filterWithColorPagePOM()
    {
        return new P07_filterWithColorPage(driver);
    }

    public P08_selectDifferentTagsPage P08_selectDifferentTagsPagePOM()
    {
        return new P08_selectDifferentTagsPage(driver);
    }

    public P011_compareListPage P011_compareListPagePOM()
    {
        return new P011_compareListPage(driver);
    }

    public P010_addProductsToWishlistPage P010_addProductsToWishlistPagePOM()
    {
        return new P010_addProductsToWishlistPage(driver);
    }

    public P09_addProductsToShoppingCartPage P09_addProductsToShoppingCartPagePOM()
    {
        return new P09_addProductsToShoppingCartPage(driver);
    }

    public P012_createSuccessfulOrderPage P012_createSuccessfulOrderPagePOM()
    {
        return new P012_createSuccessfulOrderPage(driver);
    }
}
