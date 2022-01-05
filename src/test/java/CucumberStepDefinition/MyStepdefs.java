package CucumberStepDefinition;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.codehaus.plexus.util.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class MyStepdefs {
WebDriver driver = null;
@Given("Browser is Open")
    public void browser_is_open()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("Browser is opened");
    }
    @And("User is on the given page")
    public void userIsOnTheGivenPage()
    {

        driver.navigate().to("http://qainterview.pythonanywhere.com/");
        System.out.println("User visited the page");

    }
    @When("User enter {string} in the input field")
    public void userEnterInTheInputField(String arg0)
    {
        driver.findElement(By.name("number")).sendKeys(arg0);
        System.out.println("User entered the value");
    }

    @And("clicks on Calculate button")
    public void clicks_on_calculate_button() {
        driver.findElement(By.id("getFactorial")).click();
        System.out.println("User clicked on Calculate button");

    }

    @Then("the factorial of the number {string} should be shown as {string}")
    public void theFactorialOfTheNumberShouldBeShownAs(String arg0, String arg1) throws InterruptedException, IOException {
        Thread.sleep(2000);
        String expected = "The factorial of "+arg0+" is: "+arg1;
        String actual = driver.findElement(By.xpath("//p[@id='resultDiv']")).getText();
        System.out.println(expected);
        System.out.println(actual);
        Assert.assertEquals(expected,actual);
        System.out.println("Factorial of given number is calculated");
        File imagefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(imagefile,new File("./Results/Screenshots/image.png"));
        System.out.println("Screenshot captured");
        driver.close();
        driver.quit();
    }
}
