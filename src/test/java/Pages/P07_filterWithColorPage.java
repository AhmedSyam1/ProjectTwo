package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class P07_filterWithColorPage {

    public WebDriver driver;

    public P07_filterWithColorPage(WebDriver driver) {
        this.driver = driver;
    }

    By colorSelCatePOM = By.xpath("//ul[@class=\"top-menu notmobile\"]/li[3]/a");
    By colorSelSubCatePOM = By.xpath("//ul[@class=\"top-menu notmobile\"]/li[3]/ul/li[1]/a");
    By coloFilter1POM = By.id("attribute-option-15");

    By colorCheckPOM = By.cssSelector("div[class=\"picture\"]");


    public void colorSelProdEle()
    {

        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(colorSelCatePOM))
                .moveToElement(driver.findElement(colorSelSubCatePOM))
                .click().build().perform();
    }


    public void colorFilterEle()
    {

        driver.findElement(coloFilter1POM).click();

    }

    public void colorCheckEle()
    {

        Assert.assertTrue(driver.findElement(colorCheckPOM).isDisplayed(),
                "Error Message: Selected Color Not Found!");
    }

}
