package Basis;

import Basis.BasicOperations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OverviewPage extends BasicOperations {

    public WebElement searchbar = driver.findElement(By.id("search"));

    public void searchText(){

        searchbar.sendKeys("Test1, TestTwo, Test$£$£");
        searchbar.submit();
    }

}