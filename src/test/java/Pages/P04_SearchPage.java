package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;

public class P04_SearchPage {

    public WebDriver driver;

    public P04_SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    By searchFieldPOM = By.id("small-searchterms");
    By searchProdNamePOM = By.id("small-searchterms");
    By searchBtnPOM = By.cssSelector("button[class=\"button-1 search-box-button\"]");
    By searchAsserPOM = By.cssSelector("h2[class=\"product-title\"] a");


    public void searchFieldEle()
    {

        driver.findElement(searchFieldPOM).click();
    }


    public void searchProdEle(String prodName)
    {

        driver.findElement(searchProdNamePOM).sendKeys(prodName);
        driver.findElement(searchBtnPOM).click();
    }


    public void searchAsserEle()
    {

        int count = driver.findElements(searchAsserPOM).size();
        System.out.println(count);
        Assert.assertTrue(count > 0);
        ArrayList<String> prodList = new ArrayList<>();

        for (int x = 0; x < count ; x++) {
            System.out.println(driver.findElements(searchAsserPOM).get(x).getText());
            prodList.add(driver.findElements(searchAsserPOM).get(x).getText());
            Assert.assertTrue(driver.findElements(searchAsserPOM).get(x).getText().toUpperCase().contains("HTC"),
                    "Error Message: Product Not Found");
        }
        System.out.println(prodList);
    }
}


