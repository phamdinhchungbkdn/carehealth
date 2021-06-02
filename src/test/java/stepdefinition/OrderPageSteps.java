package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.OrderPage;
import org.testng.Assert;

public class OrderPageSteps {
    private OrderPage orderPage;

    @When("complete the buy order process till payment")
    public void completeTheBuyOrderProcessTillPayment() {
        orderPage = new OrderPage();
        orderPage.clickOnProceedToCheckoutButtonAtCart();
        orderPage.clickOnProceedToCheckoutButtonAtAddress();
        orderPage.checkTermOfServiceCheckBox();
        orderPage.clickOnProceedToCheckoutButtonAtShipping();
        orderPage.clickOnPayByBankWireLink();
        orderPage.clickOnIConfirmMyOrderButton();
    }

    @Then("verify that product is ordered")
    public void verifyThatProductIsOrdered() {
        Assert.assertEquals(orderPage.getTextOfOrderCompleteMessage(),
                "Your order on My Store is complete.");
    }
}
