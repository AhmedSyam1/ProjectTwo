package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03_resetPasswordPage {

    public WebDriver driver;

    public P03_resetPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    By restForgotBtnPOM = By.cssSelector("a[href=\"/passwordrecovery\"]");
    By restEmailPOM = By.cssSelector("input.email");
    By restRecoverBtnPOM = By.cssSelector("button[class=\"button-1 password-recovery-button\"]");
    By restAsserPOM = By.cssSelector("p[class=\"content\"]");
    By restCloseBarPOM = By.cssSelector("span[class=\"close\"]");


    public void restForgotPassButtonEle()
    {

        driver.findElement(restForgotBtnPOM).click();
    }


    public void restEmailEle(String email)
    {

        driver.findElement(restEmailPOM).click();
        driver.findElement(restEmailPOM).clear();
        driver.findElement(restEmailPOM).sendKeys(email);
    }


    public void restRecoverButtonEle()
    {

        driver.findElement(restRecoverBtnPOM).click();
    }


    public String restAsserEle()
    {

        String actualResult = driver.findElement(restAsserPOM).getText();
        return actualResult;
    }


    public void restCloseBar()
    {

        driver.findElement(restCloseBarPOM).click();
    }

}

