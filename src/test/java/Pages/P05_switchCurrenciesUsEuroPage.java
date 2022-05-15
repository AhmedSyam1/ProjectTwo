package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class P05_switchCurrenciesUsEuroPage {

    public WebDriver driver;

    public P05_switchCurrenciesUsEuroPage(WebDriver driver) {
        this.driver = driver;
    }

    By switchSelProdPOM = By.cssSelector("a[href=\"/htc-one-mini-blue\"]");
    By switchCurrPOM = By.id("customerCurrency");
    By switchAsserPOM = By.id("price-value-19");


    public void switchSelProdEle()
    {

        driver.findElement(switchSelProdPOM).click();
    }


    public void switchCurrEle()
    {

        Select selCurr = new Select(driver.findElement(switchCurrPOM));

        selCurr.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2Fhtc-one-mini-blue");
    }


    public void switchAsserEle()
    {
        Assert.assertTrue(driver.findElement(switchAsserPOM).isDisplayed(),
                "Error Message: The currency has not been changed");
    }

}



