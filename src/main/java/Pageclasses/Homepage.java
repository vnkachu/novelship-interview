package Pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage
{
    WebDriver driver;

    public Homepage(WebDriver driver)
    {
        this.driver = driver;
    }

    By Loginbtn = By.id("login");

    public void loginclick()
    {
        driver.findElement(Loginbtn).click();
        System.out.println("User clicked on Login on Homepage");
    }

}
