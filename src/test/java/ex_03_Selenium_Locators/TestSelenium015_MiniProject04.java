package ex_03_Selenium_Locators;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium015_MiniProject04 {

    // ---------Using Xpath, Login to OrangeHRM

    @Owner("Monali")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify the OrangeHRM Login")
    // ----- command to check the allure report --- allure serve allure-results

    @Test
    public void orangeHrm_login_test() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(5000);

        WebElement user_name = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
        WebElement pass_word = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
        WebElement Login_button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));


        user_name.sendKeys("Admin");
        pass_word.sendKeys("admin123");
        Login_button.click();

        Thread.sleep(5000);

        WebElement PIM1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span"));
        PIM1.click();

        Thread.sleep(5000);

        WebElement PIM2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
        //Assert.assertEquals(PIM2.getText(), "PIM");
        Assert.assertTrue(PIM2.getText().contains("PIM"));
        driver.quit();
    }
}
