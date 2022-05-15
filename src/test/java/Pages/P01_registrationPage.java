package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class P01_registrationPage {

    public WebDriver driver;

    public P01_registrationPage(WebDriver driver)
    {
        this.driver = driver;
    }
    By registerLinkPOM = By.linkText("Register");
    By registerGenderPOM = By.id("gender-male");
    By registerFNamePOM = By.id("FirstName");
    By registerLNamePOM = By.id("LastName");
    By registerMailPOM = By.id("Email");
    By registerUnNewsPOM = By.xpath("//label[@for=\"Newsletter\"]");
    By registerPassPOM  = By.id("Password");
    By registerConfPassPOM = By.id("ConfirmPassword");
    By registerBtnPOM = By.id("register-button");
    By registerAsser1POM = By.className("ico-account");
    By registerAsser2POM = By.cssSelector("div[class=\"result\"]");
    By registerLogoutPOM = By.className("ico-logout");

    public void registerPageEle()
    {
        driver.findElement(registerLinkPOM).click();
    }

   public void registerDataEle(String FirstName, String LastName, String email, String pass)
   {
       driver.findElement(registerGenderPOM).click();

       driver.findElement(registerFNamePOM).click();

       driver.findElement(registerFNamePOM).clear();

       driver.findElement(registerFNamePOM).sendKeys(FirstName);

       driver.findElement(registerLNamePOM).click();

       driver.findElement(registerLNamePOM).clear();

       driver.findElement(registerLNamePOM).sendKeys(LastName);


        driver.findElement(registerMailPOM).click();
        driver.findElement(registerMailPOM).clear();
        driver.findElement(registerMailPOM).sendKeys(email);
        System.out.println(email);

        driver.findElement(registerUnNewsPOM).click();

        driver.findElement(registerPassPOM).click();
        driver.findElement(registerPassPOM).clear();
        driver.findElement(registerPassPOM).sendKeys(pass);
        driver.findElement(registerConfPassPOM).click();
        driver.findElement(registerConfPassPOM).clear();
        driver.findElement(registerConfPassPOM).sendKeys(pass);
   }

    public void registerButtonEle()
    {
        driver.findElement(registerBtnPOM).click();
    }

    public String registerAsserEle()
    {
        Assert.assertTrue(driver.findElement(registerAsser1POM).isDisplayed(), "Assertion False: User couldn't register");

        String actualResult = driver.findElement(registerAsser2POM).getText();
        return actualResult;
    }

    public void registerLogoutEle()
    {
        driver.findElement(registerLogoutPOM).click();
    }
}
