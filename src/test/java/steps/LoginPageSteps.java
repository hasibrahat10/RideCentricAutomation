package steps;


import cucumber.api.java.en.*;
import org.junit.Assert;
import pages.LoginPage;
import sun.rmi.runtime.Log;

public class LoginPageSteps extends TestSetupPage {

    @Given("^I have entered email and click next button$")
    public void iHaveEnteredEmailAndClickNextButton() {
        new LoginPage().setEmail();
    }

    @Then("^I have entered password and click login$")
    public void iHaveEnteredPasswordAndClickLogin() {
        new LoginPage().setLogin();
    }

    @And("^I click on logout button$")
    public void iClickOnLogoutButton() {
        new LoginPage().clickLogOut();
    }
}
