package FeatureTests;

import Basis.BasicOperations;
import Pages.OverviewPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class VerifyOverviewPage extends BasicOperations {

    BasicOperations BasicOperations = new BasicOperations();
    FeatureTests.VerifyTopBar VerifyTopBar = new VerifyTopBar();
    

    @BeforeMethod
    public void Open() {

        BasicOperations.OpenChrome();
    }

    @Test ()
    //Verify Top-bar on every page
    public void verifyTopBar() {

        VerifyTopBar.assertTopBar();

    }

    @Test (priority = 1)
    //Verify all elements on Overview page
    public void verifyOverviewPage() {

        OverviewPage OverviewPage = new OverviewPage();

        assertTrue(OverviewPage.logo.isDisplayed());
        assertTrue(OverviewPage.accountlink.isDisplayed());
        assertTrue(OverviewPage.cartlink.isDisplayed());
        assertTrue(OverviewPage.searchbar.isDisplayed());
        assertTrue(OverviewPage.homeAndDecorbtn.isDisplayed());
        assertTrue(OverviewPage.shopPrivateSales.isDisplayed());
        assertTrue(OverviewPage.travelGear.isDisplayed());
        assertTrue(OverviewPage.newsletter.isDisplayed());
        assertTrue(OverviewPage.subscribeBtn.isDisplayed());

        OverviewPage.accountlink.click();

        assertTrue(OverviewPage.myAccount.isDisplayed());
        assertTrue(OverviewPage.myWishList.isDisplayed());
        assertTrue(OverviewPage.myCart.isDisplayed());
        assertTrue(OverviewPage.checkout.isDisplayed());
        assertTrue(OverviewPage.register.isDisplayed());
        assertTrue(OverviewPage.login.isDisplayed());

    }

    @AfterMethod
    public void Close() {

            BasicOperations.Close();
        }

}
