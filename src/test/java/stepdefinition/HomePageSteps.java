package stepdefinition;

import io.cucumber.java.en.Given;
import object.HomePage;

import static config.ConfigurationManager.config;

public class HomePageSteps {
    private HomePage homePage;

    @Given("navigate to home page")
    public void navigateToHomePage() {
        homePage = new HomePage();
        homePage.navigateToHomePage(config().url());
        homePage.clickOnSignInLink();
    }

}
