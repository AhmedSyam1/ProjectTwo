package step_definitions;

import Pages.P03_resetPasswordPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.BrowserUtils;

import java.util.concurrent.TimeUnit;

public class S03_resetPasswordStepDefinitions {

    P03_resetPasswordPage restPass = Hooks.PageBase.P03_resetPasswordPagePOM();


    @Given("user clicks on forgot password")
    public void forgot_password()
    {
        restPass.restForgotPassButtonEle();
    }


    @When("user enters a valid email address")
    public void enters_email_address_to_reset_password()
    {
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        restPass.restEmailEle(S01_registrationStepDefinitions.email);
    }
    @And("user clicks on recover button")
    public void user_clicks_on_recover_button()
    {
        restPass.restRecoverButtonEle();
    }


    @Then("user got a Displayed Message")
    public void got_a_Displayed_Message()
    {
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        restPass.restAsserEle();
        String expectedResult = "Email with instructions has been sent to you.";
        Assert.assertTrue(restPass.restAsserEle().contains(expectedResult), "Assertion False: Display message doesn't exist");
        System.out.println("Password Recovery: Email with instructions has been sent to you.");
    }

    @And("user could close the Notification Bar")
    public void close_Notification_Bar() {
        restPass.restCloseBar();
        BrowserUtils.waitFor(5);

    }
}
