package stepdefinition;

import io.cucumber.java.en.When;
import object.MyAccountPage;

public class MyAccountPageSteps {
    private MyAccountPage myAccountPage;

    @When("hover mouse on Women link")
    public void hoverMouseOnWomenLink() {
        myAccountPage = new MyAccountPage();
        myAccountPage.hoverOnWomenMenu();
    }

    @When("click on T-shirt submenu")
    public void clickOnTShirtSubmenu() {
        myAccountPage.clickOnTShirtsSubmenu();
    }

}
