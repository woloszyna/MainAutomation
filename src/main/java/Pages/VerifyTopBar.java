package Pages;

import Basis.BasicOperations;
import Pages.OverviewPage;
import Pages.TopBar;

import static org.testng.Assert.assertTrue;

public class VerifyTopBar extends BasicOperations { //Always use extends <BasicOperations> to create SETTER

    public void assertTopBar() {

        TopBar TopBar = new TopBar();

        assertTrue(TopBar.welcome.isDisplayed());
        assertTrue(TopBar.logo.isDisplayed());
        assertTrue(TopBar.account.isDisplayed());
        assertTrue(TopBar.cart.isDisplayed());
        assertTrue(TopBar.optionWomen.isDisplayed());
        assertTrue(TopBar.optionMen.isDisplayed());
        assertTrue(TopBar.optionAccesories.isDisplayed());
        assertTrue(TopBar.optionHomeAndDecor.isDisplayed());
        assertTrue(TopBar.optionSale.isDisplayed());
        assertTrue(TopBar.optionVip.isDisplayed());

    }
}