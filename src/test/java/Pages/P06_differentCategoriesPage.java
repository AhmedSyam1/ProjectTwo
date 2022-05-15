package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class P06_differentCategoriesPage {

    public WebDriver driver;

    public P06_differentCategoriesPage(WebDriver driver) {
        this.driver = driver;
    }

    By categoryRandomPOM = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li/a");
    By categoryCountPOM = By.cssSelector("h2[class=\"title\"]");

    By categorySubCountPOM = By.cssSelector("h2[class=\"product-title\"] a");
    By categoryProdPOM = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[1]/a");
    By categorySubProdPOM = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[1]/ul/li[2]/a");


    public void categoryRandomEle ()
    {
        List<WebElement> productElements = driver.findElements(categoryRandomPOM);
        int maxProduct = productElements.size();
        Random random = new Random();
        int randomProduct = random.nextInt(maxProduct);
        productElements.get(randomProduct).click();
        List<WebElement> products = driver.findElements(categoryCountPOM);
        System.out.println("Count of Products on the page is:"+products.size() );

        int count = driver.findElements(categoryCountPOM).size();
        System.out.println(count);
        Assert.assertTrue(count > 0);
        ArrayList<String> prodList1 = new ArrayList<>();
        for (int x = 0; x < count ; x++) {
            System.out.println(driver.findElements(categoryCountPOM).get(x).getText());
            prodList1.add(driver.findElements(categoryCountPOM).get(x).getText());
        }
        System.out.println(prodList1);
    }

    public void categorySubEle()
    {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(categoryProdPOM))
                .moveToElement(driver.findElement(categorySubProdPOM))
                .click().build().perform();

        List<WebElement> products = driver.findElements(categorySubCountPOM);
        System.out.println("Count of Products on the page is:"+products.size() );

        int count = driver.findElements(categorySubCountPOM).size();
        System.out.println(count);
        Assert.assertTrue(count > 0);
        ArrayList<String> prodList1 = new ArrayList<>();
        for (int x = 0; x < count ; x++) {
            System.out.println(driver.findElements(categorySubCountPOM).get(x).getText());
            prodList1.add(driver.findElements(categorySubCountPOM).get(x).getText());
        }
        System.out.println(prodList1);
    }
}
