package FeatureTests;

import Basis.BasicOperations;
import Pages.CreateAnAccount;
import Pages.MyDashboard;
import Pages.OverviewPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyMyDashboard extends BasicOperations {

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

    @BeforeMethod
    public void registerAccount() {

        CreateAnAccount CreateAnAccount = new CreateAnAccount();

        CreateAnAccount.registerAccount();

    }

    @Test(priority = 6)
    //Verify Top-bar on every page
    public void verifyTopBar() {

        VerifyTopBar.assertTopBar();
        BasicOperations.takeScreenshot();

    }

    @Test(priority = 7)
    public void verifyPage() {
        MyDashboard MyDashboard = new MyDashboard();
        CreateAnAccount CreateAnAccount = new CreateAnAccount();

        Assert.assertTrue(MyDashboard.RegSuccess.isDisplayed());
        Assert.assertTrue(MyDashboard.MyAccount.isDisplayed());
        Assert.assertTrue(MyDashboard.AccDashboard.isDisplayed());
        Assert.assertEquals(MyDashboard.AccDashboard.getAttribute("href"), "http://demo-store.seleniumacademy.com/customer/account/");
        Assert.assertTrue(MyDashboard.AccInformation.isDisplayed());
        Assert.assertEquals(MyDashboard.AccInformation.getAttribute("href"), "http://demo-store.seleniumacademy.com/customer/account/edit/");
        Assert.assertTrue(MyDashboard.AddressBook.isDisplayed());
        Assert.assertEquals(MyDashboard.AddressBook.getAttribute("href"), "http://demo-store.seleniumacademy.com/customer/address/");
        Assert.assertTrue(MyDashboard.MyOrders.isDisplayed());
        Assert.assertEquals(MyDashboard.MyOrders.getAttribute("href"), "http://demo-store.seleniumacademy.com/sales/order/history/");
        Assert.assertTrue(MyDashboard.Billing.isDisplayed());
        Assert.assertEquals(MyDashboard.Billing.getAttribute("href"), "http://demo-store.seleniumacademy.com/sales/billing_agreement/");
        Assert.assertTrue(MyDashboard.RecProfiles.isDisplayed());
        Assert.assertEquals(MyDashboard.RecProfiles.getAttribute("href"), "http://demo-store.seleniumacademy.com/sales/recurring_profile/");
        Assert.assertTrue(MyDashboard.ProdReviewes.isDisplayed());
        Assert.assertEquals(MyDashboard.ProdReviewes.getAttribute("href"), "http://demo-store.seleniumacademy.com/review/customer/");
        Assert.assertTrue(MyDashboard.MyWishlist.isDisplayed());
        Assert.assertEquals(MyDashboard.MyWishlist.getAttribute("href"), "http://demo-store.seleniumacademy.com/wishlist/");
        Assert.assertTrue(MyDashboard.MyApps.isDisplayed());
        Assert.assertEquals(MyDashboard.MyApps.getAttribute("href"), "http://demo-store.seleniumacademy.com/oauth/customer_token/");
        Assert.assertTrue(MyDashboard.NewsSubscription.isDisplayed());
        Assert.assertEquals(MyDashboard.NewsSubscription.getAttribute("href"), "http://demo-store.seleniumacademy.com/newsletter/manage/");
        Assert.assertTrue(MyDashboard.MyDLProds.isDisplayed());
        Assert.assertEquals(MyDashboard.MyDLProds.getAttribute("href"), "http://demo-store.seleniumacademy.com/downloadable/customer/products/");
        Assert.assertTrue(MyDashboard.ContactInfoEmail.isDisplayed());
        //Assert.assertEquals(MyDashboard.ContactInfoEmail.getText());




    }

}
