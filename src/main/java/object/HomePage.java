package object;

import interaction.web.WebInteraction;

public class HomePage extends CommonPage {

    public void navigateToHomePage(String url) {
        WebInteraction.goToUrl(driver, url);
    }
}
