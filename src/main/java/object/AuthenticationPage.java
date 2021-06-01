package object;

import interaction.web.WebInteraction;

import static interaction.web.SelectorType.ID;

public class AuthenticationPage extends CommonPage{

    private static final String ID_EMAIL_ADDRESS_TEXT_BOX = "email";
    private static final String ID_PASSWORD_TEXT_BOX = "passwd";
    private static final String ID_SIGN_IN_BUTTON = "SubmitLogin";

    public void loginToWebsite(String email, String password){
        enterToEmailAddressTextBox(email);
        enterToPasswordTextBox(password);
        clickOnSignInButton();
    }

    public void enterToEmailAddressTextBox(String email){
        WebInteraction.waitForElementVisible(driver, ID, ID_EMAIL_ADDRESS_TEXT_BOX, email);
        WebInteraction.enterToElement(driver, ID, ID_EMAIL_ADDRESS_TEXT_BOX, email);
    }

    public void enterToPasswordTextBox(String password){
        WebInteraction.waitForElementVisible(driver, ID, ID_PASSWORD_TEXT_BOX, password);
        WebInteraction.enterToElement(driver, ID, ID_PASSWORD_TEXT_BOX, password);
    }

    public void clickOnSignInButton(){
        WebInteraction.waitForElementClickable(driver, ID, ID_SIGN_IN_BUTTON);
        WebInteraction.clickOnElement(driver, ID, ID_SIGN_IN_BUTTON);
    }

}
