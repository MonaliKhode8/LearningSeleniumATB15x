package ex_05_Selenium_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium023_Explicit_Wait_MiniProject02 {

@Test
    public void test_appvwo_explicitwait() {

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://app.vwo.com/");
        driver.manage().window().maximize();

        // Locators
        WebElement email = driver.findElement(By.id("login-username"));
        email.sendKeys("Admin");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Admin@123");

        driver.findElement(By.id("js-login-btn")).click();


        //Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));


        WebElement errorMessage = driver.findElement(By.className("notification-box-description"));
        System.out.println(errorMessage.getText());

        //Assertion
        Assert.assertEquals(errorMessage.getText(), "Your email, password, IP address or location did not match");

    }
}