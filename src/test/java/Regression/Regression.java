package Regression;

import Basis.BasicOperations;
import Basis.OverviewPage;
import FeatureTests.VerifyOverviewPage;
import FeatureTests.VerifyTopBar;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Regression extends BasicOperations{

    BasicOperations BasicOperations = new BasicOperations();
    VerifyOverviewPage VerifyOverviewPage = new VerifyOverviewPage();
    VerifyTopBar VerifyTopBar = new VerifyTopBar();

    @BeforeMethod
    public void Open() {

        BasicOperations.OpenChrome();

    }

    @Test
    //Verify Top-bar on every page
    public void verifyTopBar() {

        VerifyTopBar.assertTopBar();

    }

    @Test
    //Verify all elements on Overview page
    public void verifyOverviewPage() {

        Basis.OverviewPage OverviewPage = new OverviewPage();

        assertTrue(OverviewPage.logo.isDisplayed());
        assertTrue(OverviewPage.accountlink.isDisplayed());
        assertTrue(OverviewPage.cartlink.isDisplayed());
        assertTrue(OverviewPage.searchbar.isDisplayed());
        assertTrue(OverviewPage.homeAndDecorbtn.isDisplayed());
        assertTrue(OverviewPage.shopPrivateSales.isDisplayed());
        assertTrue(OverviewPage.travelGear.isDisplayed());
        assertTrue(OverviewPage.newsletter.isDisplayed());
        assertTrue(OverviewPage.subscribeBtn.isDisplayed());

    }

    @AfterMethod
    public void Close() {

        BasicOperations.Close();
    }




}
