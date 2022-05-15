package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class P012_createSuccessfulOrderPage {

    public WebDriver driver;

    public P012_createSuccessfulOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    By checkoutTermsPOM = By.xpath("//div[@class=\"terms-of-service\"]/input");
    By checkoutBtnPOM = By.xpath("//div[@class=\"checkout-buttons\"]/button");
    By checkoutWaitPOM = By.xpath("//div[@class=\"page-title\"]/h1");
    By checkoutFNamePOM = By.xpath("//input[@id=\"BillingNewAddress_FirstName\"]");
    By checkoutLNamePOM = By.xpath("//input[@id=\"BillingNewAddress_LastName\"]");
    By checkoutMailPOM = By.xpath("//input[@id=\"BillingNewAddress_Email\"]");
    By checkoutCountryPOM = By.xpath("//select[@name=\"BillingNewAddress.CountryId\"]");
    By checkoutCityPOM = By.xpath("//input[@id=\"BillingNewAddress_City\"]");
    By checkoutAddressPOM = By.xpath("//input[@id=\"BillingNewAddress_Address1\"]");
    By checkoutPostCodePOM = By.xpath("//input[@id=\"BillingNewAddress_ZipPostalCode\"]");
    By checkoutPhoneNoPOM = By.xpath("//input[@id=\"BillingNewAddress_PhoneNumber\"]");
    By checkoutFaxNoPOM = By.xpath("//input[@id=\"BillingNewAddress_FaxNumber\"]");
    By checkoutBillAddSaveBtnPOM = By.xpath("//button[@onclick=\"Billing.save()\"]");
    By checkoutShipMethSelPOM = By.xpath("//ul[@class=\"method-list\"]/li[2]/div[1]/input");
    By checkoutShipMethSaveBtnPOM = By.xpath("//button[@onclick=\"ShippingMethod.save()\"]");
    By checkoutPayMethSelPOM = By.cssSelector("input[id=\"paymentmethod_1\"]");
    By checkoutPayMethSaveBtnPOM = By.xpath("//button[@onclick=\"PaymentMethod.save()\"]");
    By checkoutCardTypePOM = By.className("dropdownlists");
    By checkoutCardHolderNamePOM =By.xpath("//input[@id=\"CardholderName\"]");
    By checkoutCardNoPOM = By.xpath("//input[@id=\"CardNumber\"]");
    By checkoutCardExpMonthPOM = By.xpath("//select[@id=\"ExpireMonth\"]");
    By checkoutCardExpYearPOM = By.xpath("//select[@id=\"ExpireYear\"]");
    By checkoutCardCodePOM = By.xpath("//input[@id=\"CardCode\"]");
    By checkoutPaymentSaveBtnPOM = By.xpath("//button[@onclick=\"PaymentInfo.save()\"]");
    By checkoutOrderConfirmBtnPOM = By.cssSelector("button[onclick=\"ConfirmOrder.save()\"]");
    By checkoutConfirmationPOM = By.cssSelector("div[class=\"page-title\"]");
    By checkoutOrderDetailsPOM = By.partialLinkText("details");
    By checkoutInvoiceSavePOM = By.xpath("//a[@class=\"button-2 pdf-invoice-button\"]");
    By checkoutInvoicePrintPOM = By.xpath("//a[@class=\"button-2 print-order-button\"]");

    public void checkoutProceedEle()
    {
        driver.findElement(checkoutTermsPOM).click();
        driver.findElement(checkoutBtnPOM).click();

        WebDriverWait wait1 = new WebDriverWait(driver, 5);
        wait1.until(ExpectedConditions.textToBePresentInElementLocated(checkoutWaitPOM, "checkout"));
    }

    public void checkoutFillDataEle(String FirstName, String LastName, String email, String city, String address1, String postCode, String phoneNo, String faxNo)
    {
        driver.findElement(checkoutFNamePOM).click();
        driver.findElement(checkoutFNamePOM).clear();
        driver.findElement(checkoutFNamePOM).sendKeys(FirstName);
        driver.findElement(checkoutLNamePOM).click();
        driver.findElement(checkoutLNamePOM).clear();
        driver.findElement(checkoutLNamePOM).sendKeys(LastName);
        driver.findElement(checkoutMailPOM).click();
        driver.findElement(checkoutMailPOM).clear();
        driver.findElement(checkoutMailPOM).sendKeys(email);
        Select country = new Select(driver.findElement(checkoutCountryPOM));
        country.selectByVisibleText("Jordan");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(checkoutCityPOM).click();
        driver.findElement(checkoutCityPOM).clear();
        driver.findElement(checkoutCityPOM).sendKeys(city);
        driver.findElement(checkoutAddressPOM).click();
        driver.findElement(checkoutAddressPOM).clear();
        driver.findElement(checkoutAddressPOM).sendKeys(address1);
        driver.findElement(checkoutPostCodePOM).click();
        driver.findElement(checkoutPostCodePOM).clear();
        driver.findElement(checkoutPostCodePOM).sendKeys(postCode);
        driver.findElement(checkoutPhoneNoPOM).click();
        driver.findElement(checkoutPhoneNoPOM).clear();
        driver.findElement(checkoutPhoneNoPOM).sendKeys(phoneNo);
        driver.findElement(checkoutFaxNoPOM).click();
        driver.findElement(checkoutFaxNoPOM).clear();
        driver.findElement(checkoutFaxNoPOM).sendKeys(faxNo);
    }

    public void checkoutBillAddSaveEle()
    {

        driver.findElement(checkoutBillAddSaveBtnPOM).click();
    }

    public void checkoutShipMethEle()
    {
        driver.findElement(checkoutShipMethSelPOM).click();
        driver.findElement(checkoutShipMethSaveBtnPOM).click();
    }

    public void checkoutPayMethEle()
    {
        driver.findElement(checkoutPayMethSelPOM).click();
        driver.findElement(checkoutPayMethSaveBtnPOM).click();
    }

    public void checkoutPayDataEle(String cardHolderName, String cardNumber, String cardCode)
    {
        Select card = new Select(driver.findElement(checkoutCardTypePOM));
        card.selectByValue("MasterCard");
        driver.findElement(checkoutCardHolderNamePOM).click();
        driver.findElement(checkoutCardHolderNamePOM).clear();
        driver.findElement(checkoutCardHolderNamePOM).sendKeys(cardHolderName);
        driver.findElement(checkoutCardNoPOM).click();
        driver.findElement(checkoutCardNoPOM).clear();
        driver.findElement(checkoutCardNoPOM).sendKeys(cardNumber);

        Select month = new Select(driver.findElement(checkoutCardExpMonthPOM));
        month.selectByValue("8");
        Select year = new Select(driver.findElement(checkoutCardExpYearPOM));
        year.selectByValue("2023");
        driver.findElement(checkoutCardCodePOM).click();
        driver.findElement(checkoutCardCodePOM).clear();
        driver.findElement(checkoutCardCodePOM).sendKeys(cardCode);
        driver.findElement(checkoutPaymentSaveBtnPOM).click();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(checkoutOrderConfirmBtnPOM, "CONFIRM"));
    }

    public void checkoutConfirmOrderEle()
    {
        driver.findElement(checkoutOrderConfirmBtnPOM).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(checkoutConfirmationPOM, "Thank you"));
    }
    public void checkoutInvoiceEle()
    {
        driver.findElement(checkoutOrderDetailsPOM).click();
        System.out.println("Title of page is: " + driver.getTitle());
    }

    public void checkoutInvoiceSaveEle()
    {
        driver.findElement(checkoutInvoiceSavePOM).click();
    }


    public void checkoutInvoicePrintEle()
    {
        driver.findElement(checkoutInvoicePrintPOM).click();
    }

}


