package object;

import interaction.web.WebInteraction;

import static interaction.web.SelectorType.*;

public class ProductPage extends CommonPage {

    private static final String ID_QUANTITY_TEXT_BOX = "quantity_wanted";
    private static final String XPATH_SIZE_DROPDOWN = "//select[@name='group_1']";
    private static final String XPATH_COLOR_SELECTOR = "//ul[@id='color_to_pick_list']//a[@title='%s']";
    private static final String CSS_ADD_TO_CART_BUTTON = "#add_to_cart button";
    private static final String XPATH_PROCEED_TO_CHECKOUT_BUTTON = "//a[@title='Proceed to checkout']";

    public void enterToQuantityTextBox(String number) {
        WebInteraction.waitForElementVisible(driver, ID, ID_QUANTITY_TEXT_BOX);
        WebInteraction.enterToElement(driver, ID, ID_QUANTITY_TEXT_BOX, number);
    }

    public void selectSize(String size) {
        WebInteraction.waitForElementVisible(driver, XPATH, XPATH_SIZE_DROPDOWN);
        WebInteraction.selectDropdownText(driver, XPATH, XPATH_SIZE_DROPDOWN, size);
    }

    public void selectColor(String color) {
        WebInteraction.waitForElementClickable(driver, XPATH, XPATH_COLOR_SELECTOR, color);
        WebInteraction.clickOnElement(driver, XPATH, XPATH_COLOR_SELECTOR, color);
    }

    public void clickOnAddToCartButton(){
        WebInteraction.waitForElementClickable(driver, CSS, CSS_ADD_TO_CART_BUTTON);
        WebInteraction.clickOnElement(driver, CSS, CSS_ADD_TO_CART_BUTTON);
    }

    public void clickOnProceedToCheckoutButton(){
        WebInteraction.waitForElementClickable(driver, XPATH, XPATH_PROCEED_TO_CHECKOUT_BUTTON);
        WebInteraction.clickOnElement(driver, XPATH, XPATH_PROCEED_TO_CHECKOUT_BUTTON);
    }

}
