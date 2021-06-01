package stepdefinition;

import io.cucumber.java.en.When;
import object.CategoryPage;

public class CategoryPageSteps {
    private CategoryPage categoryPage;

    @When("hover mouse on a product {string}")
    public void hoverMouseOnProduct(String position) {
        categoryPage = new CategoryPage();
        categoryPage.hoverOnProduct(position);
    }

    @When("click on More button")
    public void clickOnMoreButton() {
        categoryPage.clickOnMoreButton();
    }
}
