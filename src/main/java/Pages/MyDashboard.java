package Pages;

import Basis.BasicOperations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyDashboard extends BasicOperations {

    public WebElement RegSuccess = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div[2]/div/ul/li/ul/li/span"));
    public WebElement MyAccount = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[1]/div/div[1]/strong/span"));
    public WebElement AccDashboard = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[1]/div/div[2]/ul/li[1]/a"));
    public WebElement AccInformation = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[1]/div/div[2]/ul/li[2]/a"));
    public WebElement AddressBook = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[1]/div/div[2]/ul/li[3]/a"));
    public WebElement MyOrders = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[1]/div/div[2]/ul/li[4]/a"));
    public WebElement Billing = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[1]/div/div[2]/ul/li[5]/a"));
    public WebElement RecProfiles = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[1]/div/div[2]/ul/li[6]/a"));
    public WebElement ProdReviewes = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[1]/div/div[2]/ul/li[7]/a"));
    public WebElement MyWishlist = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[1]/div/div[2]/ul/li[8]/a"));
    public WebElement MyApps = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[1]/div/div[2]/ul/li[9]/a"));
    public WebElement NewsSubscription = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[1]/div/div[2]/ul/li[10]/a"));
    public WebElement MyDLProds = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[1]/div/div[2]/ul/li[11]/a"));
    public WebElement ContactInfoEmail = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div[2]/div/div[3]/div[2]/div[1]/div/div[2]/p/text()[2]"));

}


