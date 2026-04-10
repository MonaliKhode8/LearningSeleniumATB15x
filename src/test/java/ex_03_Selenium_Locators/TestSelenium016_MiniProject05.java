package ex_03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium016_MiniProject05 {

    // TTA bank Project - 27 Feb task  - https://tta-bank-digital-973242068062.us-west1.run.app/


    @Owner("Monali")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify the OrangeHRM Login")
    // ----- command to check the allure report --- allure serve allure-results
    @Test
    public void TTA_bank_test()throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://tta-bank-digital-973242068062.us-west1.run.app/");
        driver.manage().window().maximize();

        WebElement sign_up = driver.findElement(By.xpath("//*[text()='Sign Up']"));
        sign_up.click();

        WebElement full_name = driver.findElement(By.xpath("//input[@placeholder=\"John Doe\"]"));
        full_name.sendKeys("Test1");

        WebElement email = driver.findElement(By.xpath("//input[@placeholder=\"you@example.com\"]"));
        email.sendKeys("AdminMK@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        password.sendKeys("TTTT123");

        WebElement create_account_btn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        create_account_btn.click();

        Thread.sleep(5000);

       WebElement transfer_funds = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/aside/div[2]/nav/button[2]"));
        transfer_funds.click();

        WebElement transfer_amount = driver.findElement(By.xpath("//input[@placeholder=\"0.00\"]"));
        transfer_amount.sendKeys("5000");

        WebElement transfer_notes = driver.findElement(By.xpath("//input[@placeholder=\"e.g. Rent for October\"]"));
        transfer_notes.sendKeys("April Month rent");

        WebElement transfer_continue = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div/div[2]/div/button"));
        transfer_continue.click();

        WebElement transfer_confirm = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div/div[2]/div/div[3]/button[2]"));
        transfer_confirm.click();

        WebElement dashboard = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/aside/div[2]/nav/button[1]"));
        dashboard.click();

        Thread.sleep(5000);

        driver.quit();









    }

}
