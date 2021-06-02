package object;

import interaction.web.WebInteraction;

import static interaction.web.SelectorType.*;

public class OrderPage extends CommonPage{

    private static final String XPATH_CART_PROCEED_TO_CHECKOUT_BUTTON = "//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']";
    private static final String NAME_ADDRESS_PROCEED_TO_CHECKOUT_BUTTON = "processAddress";
    private static final String CSS_SHIPPING_PROCEED_TO_CHECKOUT_BUTTON = "button[name='processCarrier']";
    private static final String ID_TERM_OF_SERVICE_CHECK_BOX = "cgv";
    private static final String CSS_PAY_BY_BANK_WIRE_LINK = "a.bankwire";
    private static final String CSS_PAY_BY_CHECK_LINK = "a.cheque";
    private static final String XPATH_I_CONFIRM_MY_ORDER_BUTTON = "//p[@id='cart_navigation']/button";
    private static final String CSS_ORDER_COMPLETE_MESSAGE = ".cheque-indent strong.dark";

    public void clickOnProceedToCheckoutButtonAtCart(){
        WebInteraction.waitForElementClickable(driver, XPATH, XPATH_CART_PROCEED_TO_CHECKOUT_BUTTON);
        WebInteraction.clickOnElement(driver, XPATH, XPATH_CART_PROCEED_TO_CHECKOUT_BUTTON);
    }

    public void clickOnProceedToCheckoutButtonAtAddress(){
        WebInteraction.waitForElementClickable(driver, NAME, NAME_ADDRESS_PROCEED_TO_CHECKOUT_BUTTON);
        WebInteraction.clickOnElement(driver, NAME, NAME_ADDRESS_PROCEED_TO_CHECKOUT_BUTTON);
    }

    public void clickOnProceedToCheckoutButtonAtShipping(){
        WebInteraction.waitForElementClickable(driver, CSS, CSS_SHIPPING_PROCEED_TO_CHECKOUT_BUTTON);
        WebInteraction.clickOnElement(driver, CSS, CSS_SHIPPING_PROCEED_TO_CHECKOUT_BUTTON);
    }

    public void checkTermOfServiceCheckBox(){
        WebInteraction.waitForElementPresent(driver, ID, ID_TERM_OF_SERVICE_CHECK_BOX);
        WebInteraction.checkToElement(driver, ID, ID_TERM_OF_SERVICE_CHECK_BOX);
    }

    public void clickOnPayByBankWireLink(){
        WebInteraction.waitForElementClickable(driver, CSS, CSS_PAY_BY_BANK_WIRE_LINK);
        WebInteraction.clickOnElement(driver, CSS, CSS_PAY_BY_BANK_WIRE_LINK);
    }

    public void clickOnIConfirmMyOrderButton(){
        WebInteraction.waitForElementClickable(driver, XPATH, XPATH_I_CONFIRM_MY_ORDER_BUTTON);
        WebInteraction.clickOnElement(driver, XPATH, XPATH_I_CONFIRM_MY_ORDER_BUTTON);
    }

    public String getTextOfOrderCompleteMessage(){
        WebInteraction.waitForElementVisible(driver, CSS, CSS_ORDER_COMPLETE_MESSAGE);
        return WebInteraction.getTextOfElement(driver, CSS, CSS_ORDER_COMPLETE_MESSAGE);
    }

}
