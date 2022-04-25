package Pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginscreen
{
    WebDriver driver;

    public Loginscreen(WebDriver driver)
    {
        this.driver=driver;
    }

    By Username = By.xpath("//div[@id='userName-wrapper']/div[2]/input");
    By password = By.xpath("//div[@id='password-wrapper']/div[2]/input");
    By button = By.cssSelector(".btn-primary");

    public void usernameinput(String user)
    {
        driver.findElement(Username).sendKeys(user);

    }
    public void passwordinput(String pswrd)
    {
        driver.findElement(password).sendKeys(pswrd);

    }

    public void loginclick()
    {
        driver.findElement(button).click();
        System.out.println("User clicked on Login on Login page");

    }
}
