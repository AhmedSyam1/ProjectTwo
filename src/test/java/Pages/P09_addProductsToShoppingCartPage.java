package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P09_addProductsToShoppingCartPage {

    public WebDriver driver;

    public P09_addProductsToShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }

    By shoppCartProd1CheckPOM = By.xpath("//table[@class=\"cart\"]/tbody/tr[1]/td[1]/input");
    By shoppCartProd2CheckPOM = By.xpath("//table[@class=\"cart\"]/tbody/tr[2]/td[1]/input");
    By shoppCartADDPOM = By.name("addtocartbutton");
    By shoppCartWaitPOM = By.cssSelector("td[class=\"sku\"]");


    public void shoppCartProdsCheckEle()
    {
        driver.findElement(shoppCartProd1CheckPOM).click();
        driver.findElement(shoppCartProd2CheckPOM).click();
    }


    public void shoppCartADDEle()
    {

        driver.findElement(shoppCartADDPOM).click();

        WebDriverWait wait=new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.presenceOfElementLocated(shoppCartWaitPOM));
    }

}


