package ex_03_Selenium_Locators;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//Go - https://katalon-demo-cura.herokuapp.com/
//Click on the Make appointment button, enter the username , password given
//Verify that the Make appointment


public class TestSelenium014_MiniProject03 {

    // ----- command to check the allure report --- allure serve allure-results

    @Test
    public void katlon_test(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement make_appointment = driver.findElement(By.id("btn-make-appointment"));
        make_appointment.click();

        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        driver.findElement(By.id("btn-login")).click();

        String current_URL_test = driver.getCurrentUrl();
        Assert.assertTrue(current_URL_test.contains("katalon"));

        
       WebElement make_appointment_text = driver.findElement(By.tagName("h2"));
       Assert.assertTrue(make_appointment_text.isDisplayed());

       driver.quit();


    }
}
