package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class P02_loginPage {

    public WebDriver driver;

    public P02_loginPage(WebDriver driver) {
        this.driver = driver;
    }
    By loginLinkPOM = By.className("ico-login");
    By loginMailPOM = By.xpath("//div[@class=\"form-fields\"]/div[1]/input");
    By loginPassPOM = By.xpath("//div[@class=\"form-fields\"]/div[2]/input");
    By loginAsserPOM = By.className("ico-account");
    By loginLogoutPOM = By.className("ico-logout");

    public void loginPageEle()
    {
        driver.findElement(loginLinkPOM).click();
    }

    public void loginDataEle(String email, String pass)
    {
        driver.findElement(loginMailPOM).click();
        driver.findElement(loginMailPOM).clear();
        driver.findElement(loginMailPOM).sendKeys(email);

        driver.findElement(loginPassPOM).click();
        driver.findElement(loginPassPOM).clear();
        driver.findElement(loginPassPOM).sendKeys(pass);

        driver.findElement(loginPassPOM).sendKeys(Keys.ENTER);
    }


    public void loginAsserEle()
    {
        Assert.assertTrue(driver.findElement(loginAsserPOM).isDisplayed(), "Login Failed");
    }

    public void loginLogoutEle()
    {
        driver.findElement(loginLogoutPOM).click();
    }
}

