package stepdefinition;

import io.cucumber.java.en.When;
import object.AuthenticationPage;

import static config.ConfigurationManager.config;

public class AuthenticationPageSteps {
    private AuthenticationPage authenticationPage;

    @When("login to the website")
    public void loginToTheWebsite() {
        authenticationPage = new AuthenticationPage();
        authenticationPage.loginToWebsite(config().email(), config().password());
    }
}
