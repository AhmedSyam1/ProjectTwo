package step_definitions;

import Pages.P012_createSuccessfulOrderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BrowserUtils;


public class S012_createSuccessfulOrderStepDefinitions {

    P012_createSuccessfulOrderPage checkout = Hooks.PageBase.P012_createSuccessfulOrderPagePOM();

    @Given("user agrees with terms and proceed to Checkout")
    public void proceed_to_Checkout()
    {
        checkout.checkoutProceedEle();
        System.out.println("Welcome in Checkout Page!");
    }


    public static String city = "Amman";
    public static String address1 = "Amman";
    public static String postCode = "23678";
    public static String phoneNo = "01235678722";
    public static String faxNo = "36747678";
    public static String cardHolderName = "Ahmed Mohamed";
    public static String cardNumber = "3658532345";
    public static String cardCode = "672";

    @When("user fills out Billing address to Create Order")
    public void fill_out_Billing_address()
    {
        checkout.checkoutFillDataEle(S01_registrationStepDefinitions.FirstName, S01_registrationStepDefinitions.LastName, S01_registrationStepDefinitions.email,city, address1, postCode, phoneNo, faxNo);
    }

    @And("user confirms Billing address")
    public void confirms_Billing_address() {
        checkout.checkoutBillAddSaveEle();
        BrowserUtils.waitFor(2);
    }

    @And("user selects Shipping Method to Continue")
    public void select_Shipping_Method_and_Continue() {
        checkout.checkoutShipMethEle();
        BrowserUtils.waitFor(2);
    }

    @And("user selects Payment Method to Continue")
    public void select_Payment_Method() {
        checkout.checkoutPayMethEle();
        BrowserUtils.waitFor(2);
    }

    @When("user fills out Payment Information")
    public void Fill_out_Payment_Information()
    {
        checkout.checkoutPayDataEle(cardHolderName, cardNumber, cardCode);
        System.out.println("Create Successful Order!");
    }

    @Then("user could confirm his order")
    public void Confirm_Order()
    {
        checkout.checkoutConfirmOrderEle();
        System.out.println("Your order has been successfully processed!");
    }

    @And("user can check order details")
    public void check_order_details()
    {
        checkout.checkoutInvoiceEle();
    }

    @And("user could save invoice")
    public void Save_Invoice() {
        checkout.checkoutInvoiceSaveEle();
        BrowserUtils.waitFor(3);
        System.out.println("PDF Invoice has been downloaded Successfully");
    }

    @And("user could print invoice")
    public void Print_Invoice() {
        checkout.checkoutInvoicePrintEle();
        BrowserUtils.waitFor(3);
        System.out.println("Invoice has been printed Successfully");
    }
}

