package stepdefinition;

import io.cucumber.java.en.When;
import object.AuthenticationPage;

public class AuthenticationPageSteps {
    private AuthenticationPage authenticationPage;

    @When("login to the website")
    public void loginToTheWebsite() {
        authenticationPage = new AuthenticationPage();
        authenticationPage.loginToWebsite("carehealth@test.com", "Test@123");
    }
}
