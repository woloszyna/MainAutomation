import Basis.BasicOperations;
import Basis.OverviewPage;
import Basis.TopBar;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class VerifyTopBar extends BasicOperations { //Always use extends <BasicOperations> to create SETTER

    @BeforeMethod
    public void openChrome(){

        BasicOperations BasicOperations = new BasicOperations();
        BasicOperations.OpenChrome();
        BasicOperations.OpenFirefox();
    }

    @Test
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

    @AfterMethod
    public void close() {

        BasicOperations BasicOperations = new BasicOperations();
        BasicOperations.Close();

    }
}