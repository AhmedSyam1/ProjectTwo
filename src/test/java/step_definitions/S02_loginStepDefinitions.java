package step_definitions;

import Pages.P02_loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BrowserUtils;


public class S02_loginStepDefinitions {

    P02_loginPage login = Hooks.PageBase.P02_loginPagePOM();

    @Given("user open login page")
    public void login_page() {
        login.loginPageEle();
        BrowserUtils.waitFor(1);
    }

    @When("user can login with valid email and valid password")
    public void valid_email_and_valid_password()
    {
        login.loginDataEle(S01_registrationStepDefinitions.email, S01_registrationStepDefinitions.pass);
    }

    @Then("user could login successfully")
    public void login_successfully() throws InterruptedException {
        BrowserUtils.waitFor(2);
        login.loginAsserEle();
        System.out.println("Assertion: User has logged in Successfully");
    }

    @And("logged user logs out")
    public void logged_user_logs_out()
    {
        login.loginLogoutEle();
    }
}
