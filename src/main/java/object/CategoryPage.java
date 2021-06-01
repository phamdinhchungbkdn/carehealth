package object;

import interaction.web.WebInteraction;

import static interaction.web.SelectorType.*;

public class CategoryPage extends CommonPage {

    private static final String CLASS_PRODUCT_CONTAINER_LIST = "product-container";
    private static final String XPATH_MORE_BUTTON = "//a[@class='button lnk_view btn btn-default']";

    public void hoverOnProduct(String position) {
        WebInteraction.waitForElementVisible(driver, CLASS, CLASS_PRODUCT_CONTAINER_LIST);
        WebInteraction.hoverOnElementByPosition(driver, CLASS, CLASS_PRODUCT_CONTAINER_LIST, position);
    }

    public void clickOnMoreButton(){
        WebInteraction.waitForElementClickable(driver, XPATH, XPATH_MORE_BUTTON);
        WebInteraction.clickOnElement(driver, XPATH, XPATH_MORE_BUTTON);
    }

}
