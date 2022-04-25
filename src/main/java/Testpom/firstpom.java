package Testpom;

import Pageclasses.Homepage;
import Pageclasses.Loginscreen;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstpom {
    public static void main (String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/login");

        Homepage Home = new Homepage(driver);
        Loginscreen Login = new Loginscreen(driver);

        Home.loginclick();
        Login.usernameinput("gunjankaushik");
        Login.passwordinput("Password@123");
        Login.loginclick();


    }
}
