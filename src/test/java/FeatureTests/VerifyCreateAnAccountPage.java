package FeatureTests;

import Basis.BasicOperations;
import Pages.CreateAnAccount;
import Pages.OverviewPage;
import Pages.VerifyTopBar;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class VerifyCreateAnAccountPage extends BasicOperations {

    BasicOperations BasicOperations = new BasicOperations();
    Pages.VerifyTopBar VerifyTopBar = new VerifyTopBar();

    @BeforeMethod
    public void OpenChrome() {

        BasicOperations.OpenChrome();

    }

    @BeforeMethod
    public void accessRegPage() {

        OverviewPage OverviewPage = new OverviewPage();
        OverviewPage.accessRegistrationPage();


    }

    @Test
    //Verify Top-bar on every page
    public void verifyTopBar() {

        VerifyTopBar.assertTopBar();

    }

    @Test
    public void verifyPage() {

        CreateAnAccount CreateAnAccount = new CreateAnAccount();

        assertTrue(CreateAnAccount.firstName.isDisplayed());
        assertTrue(CreateAnAccount.middleName.isDisplayed());
        assertTrue(CreateAnAccount.lastName.isDisplayed());
        assertTrue(CreateAnAccount.email.isDisplayed());
        assertTrue(CreateAnAccount.password.isDisplayed());
        assertTrue(CreateAnAccount.confirmPassword.isDisplayed());
        assertTrue(CreateAnAccount.signupForNews.isDisplayed());
        assertTrue(CreateAnAccount.signupForNewsCheckBox.isDisplayed());
        assertFalse(CreateAnAccount.signupForNewsCheckBox.isSelected());
        assertTrue(CreateAnAccount.registerbtn.isDisplayed());
    }

    @AfterMethod
    public void Close() {

        driver.quit();

    }
}
