package object;

import driver.DriverManager;
import interaction.web.WebInteraction;
import org.openqa.selenium.WebDriver;

import static interaction.web.SelectorType.CLASS;
import static interaction.web.SelectorType.XPATH;

public abstract class CommonPage {
    protected WebDriver driver;

    private static final String CLASS_SIGN_IN_LINK = "login";
    private static final String XPATH_WOMEN_MENU = "//div[@id='block_top_menu']//a[@title='Women']";
    private static final String XPATH_T_SHIRT_SUBMENU = "//a[@title='Women']/following::ul//a[@title='T-shirts']";

    public CommonPage() {
        this.driver = DriverManager.getDriver();
    }

    public void clickOnSignInLink(){
        WebInteraction.waitForElementClickable(driver, CLASS, CLASS_SIGN_IN_LINK);
        WebInteraction.clickOnElement(driver, CLASS, CLASS_SIGN_IN_LINK);
    }

    public void hoverOnWomenMenu(){
        WebInteraction.waitForElementVisible(driver, XPATH, XPATH_WOMEN_MENU);
        WebInteraction.hoverOnElement(driver, XPATH, XPATH_WOMEN_MENU);
    }

    public void clickOnTShirtsSubmenu() {
        WebInteraction.waitForElementClickable(driver, XPATH, XPATH_T_SHIRT_SUBMENU);
        WebInteraction.clickOnElement(driver, XPATH, XPATH_T_SHIRT_SUBMENU);
    }
}
