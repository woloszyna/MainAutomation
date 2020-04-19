package Pages;

import Basis.BasicOperations;
import Basis.RandomString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateAnAccount extends BasicOperations {

    public WebElement firstName = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
    public WebElement middleName = driver.findElement(By.xpath("//*[@id=\"middlename\"]"));
    public WebElement lastName = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
    public WebElement email = driver.findElement(By.xpath("//*[@id=\"email_address\"]"));
    public WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
    public WebElement confirmPassword = driver.findElement(By.xpath("//*[@id=\"confirmation\"]"));
    public WebElement signupForNews = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[1]/ul/li[4]/label"));
    public WebElement signupForNewsCheckBox = driver.findElement(By.xpath("//*[@id=\"is_subscribed\"]"));
    public WebElement registerbtn = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button/span/span"));

    public void registerAccount() {

        RandomString RandomString = new RandomString();

        firstName.sendKeys("Tester");
        middleName.sendKeys("Mc");
        lastName.sendKeys("Test");
        email.sendKeys( RandomString + "@email.com");
        password.sendKeys(RandomString+"");
        confirmPassword.sendKeys();
        signupForNewsCheckBox.click();
        registerbtn.click();

    }

}


