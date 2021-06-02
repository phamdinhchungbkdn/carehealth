package stepdefinition;

import io.cucumber.java.en.When;
import object.ProductPage;

public class ProductPageSteps {
    private ProductPage productPage;

    @When("increase quantity to {string}")
    public void increaseQuantityTo(String number) {
        productPage = new ProductPage();
        productPage.enterToQuantityTextBox(number);
    }

    @When("select size {string}")
    public void selectSize(String size) {
        productPage.selectSize(size);
    }

    @When("select color {string}")
    public void selectColor(String color) {
        productPage.selectColor(color);
    }

    @When("click Add To Cart button")
    public void clickAddToCartButton() {
        productPage.clickOnAddToCartButton();
    }

    @When("click Proceed To Checkout button")
    public void clickProceedToCheckoutButton() {
        productPage.clickOnProceedToCheckoutButton();
    }
}
