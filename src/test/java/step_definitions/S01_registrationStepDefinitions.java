package step_definitions;

import Pages.P01_registrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import java.util.Random;

public class S01_registrationStepDefinitions {

    P01_registrationPage register = Hooks.PageBase.P01_registrationPagePOM();

    @Given("new user open registration page")
    public void registration_page()
    {
        register.registerPageEle();
    }
        static Random randomGenerator = new Random();
        static int randomInt = randomGenerator.nextInt(1000);
        static String s = Integer.toString(randomInt);
        public static String email = "ahmedMohamed444@gmail.com";
        public static String pass = "653786";
        public static String FirstName = "Ahmed";
        public static String LastName = "Mohamed";

    @And("new user registers with valid data")
    public void registration_valid_data() {
        register.registerDataEle(FirstName, LastName, email, pass);
    }

    @When("new user can register")
    public void new_user_register()
        {
        register.registerButtonEle();
        }

    @Then("a success message is displayed")
    public void success_message_displayed()
    {
        register.registerAsserEle();
        System.out.println("Assertion: Your registration completed");

        String expectedResult = "Your registration completed";
        Assert.assertTrue(register.registerAsserEle().contains(expectedResult), "Error Message: User couldn't register successfully");
        System.out.println("Congratulations! Your registration completed");
    }

    @And("user logs out after registering")
    public void log_out_after_registering()
    {
        register.registerLogoutEle();
    }

}


