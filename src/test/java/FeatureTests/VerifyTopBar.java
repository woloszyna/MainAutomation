package FeatureTests;

import Basis.BasicOperations;
import Basis.OverviewPage;
import Basis.TopBar;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class VerifyTopBar extends BasicOperations { //Always use extends <BasicOperations> to create SETTER

    public void assertTopBar() {

        TopBar TopBar = new TopBar();
        OverviewPage OverviewPage = new OverviewPage();

        assertTrue(TopBar.welcome.isDisplayed());
        assertTrue(TopBar.logo.isDisplayed());
        assertTrue(TopBar.account.isDisplayed());
        assertTrue(TopBar.cart.isDisplayed());
        assertTrue(OverviewPage.searchbar.isDisplayed());
        assertTrue(TopBar.optionWomen.isDisplayed());
        assertTrue(TopBar.optionMen.isDisplayed());
        assertTrue(TopBar.optionAccesories.isDisplayed());
        assertTrue(TopBar.optionHomeAndDecor.isDisplayed());
        assertTrue(TopBar.optionSale.isDisplayed());
        assertTrue(TopBar.optionVip.isDisplayed());

    }
}