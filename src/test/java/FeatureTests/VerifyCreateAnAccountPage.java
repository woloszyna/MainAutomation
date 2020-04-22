package FeatureTests;

import Basis.BasicOperations;
import Basis.RandomString;
import Pages.CreateAnAccount;
import Pages.MyDashboard;
import Pages.OverviewPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class VerifyCreateAnAccountPage extends BasicOperations {

    BasicOperations BasicOperations = new BasicOperations();
    FeatureTests.VerifyTopBar VerifyTopBar = new VerifyTopBar();

    @BeforeMethod
    public void OpenChrome() {

        BasicOperations.OpenChrome();

    }

    @BeforeMethod
    public void accessRegPage() {

        OverviewPage OverviewPage = new OverviewPage();
        OverviewPage.accessRegistrationPage();

    }

    @Test (priority = 3)
    //Verify Top-bar on every page
    public void verifyTopBar() {

        VerifyTopBar.assertTopBar();
        BasicOperations.takeScreenshot();

    }

    @Test (priority = 4)
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

    @Test (priority = 5)
    public void createAnAccount() {

        CreateAnAccount CreateAnAccount = new CreateAnAccount();
        CreateAnAccount.registerAccount();

        MyDashboard MyDashboard = new MyDashboard();
        Assert.assertEquals("Thank you for registering with Madison Island.", MyDashboard.RegSuccess.getText());


    }

    @Test
    public void loginTest() {


    }

    @AfterMethod
    public void screenshot(){

        BasicOperations.takeScreenshot();
        BasicOperations.Close();

    }

}
