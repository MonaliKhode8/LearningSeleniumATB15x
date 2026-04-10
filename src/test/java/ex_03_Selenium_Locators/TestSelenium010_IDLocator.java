package ex_03_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium010_IDLocator {

        public static void main(String[] args) {
            // ---Mini Project #1 (Selenium)----
            // Locators: Find the web elements
            // Open the URL https://www.saucedemo.com/
            // Find the Email id and enter the email as "admin@admin.com"
            // Find the Password and enter the password as "admin"
            // Find and click on the submit button
            // Verify that the error message is shown "Your email, password,
            // IP address or location did not match"

            WebDriver driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");

            WebElement Username = driver.findElement(By.id("user-name"));
            Username.sendKeys("Admin");

            WebElement Password = driver.findElement(By.id("password"));
            Password.sendKeys("Admin@123");

            driver.findElement(By.id("login-button")).click();
        }
}
