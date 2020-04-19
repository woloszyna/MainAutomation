package Pages;

import Basis.BasicOperations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopBar extends BasicOperations { //Always use extends <BasicOperations> to create SETTER

    //This class only lists elements as they always will have to be verified in all pages

    public WebElement language = driver.findElement(By.id("select-language"));
    public WebElement welcome = driver.findElement(By.className("welcome-msg"));
    public WebElement logo = driver.findElement(By.xpath("//*[@id=\"header\"]/div/a/img[1]"));
    public WebElement account = driver.findElement(By.className("skip-account"));
    public WebElement cart = driver.findElement(By.className("skip-cart"));
    public WebElement optionWomen = driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a"));
    public WebElement optionMen = driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[2]/a"));
    public WebElement optionAccesories = driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[3]/a"));
    public WebElement optionHomeAndDecor = driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[4]/a"));
    public WebElement optionSale = driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[5]/a"));
    public WebElement optionVip = driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[6]/a"));

}
