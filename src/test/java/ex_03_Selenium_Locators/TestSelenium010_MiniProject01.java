package ex_03_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestSelenium010_MiniProject01 {

    public void test_vwo_com() throws InterruptedException{
        // ---Mini Project #1 (Selenium)----
            // Locators: Find the web elements
            // Open the URL https://www.saucedemo.com/
            // Find the Email id and enter the email as "admin@admin.com"
            // Find the Password and enter the password as "admin"
            // Find and click on the submit button
            // Verify that the error message is shown "Your email, password,
            // IP address or location did not match"
        // driver managing
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");
        driver.manage().window().maximize();

        // Locators
        WebElement email = driver.findElement(By.id("login-username"));
        email.sendKeys("Admin");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Admin@123");

        driver.findElement(By.id("js-login-btn")).click();
        //Wait
        Thread.sleep(5000);

        WebElement errorMessage = driver.findElement(By.className("notification-box-description"));
        System.out.println(errorMessage.getText());

        //Assertion
        Assert.assertEquals(errorMessage.getText(),"Your email, password, IP address or location did not match");

        //Quit
        //driver.quit();


    }
}
