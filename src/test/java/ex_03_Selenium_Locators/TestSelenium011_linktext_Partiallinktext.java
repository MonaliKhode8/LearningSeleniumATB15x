package ex_03_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestSelenium011_linktext_Partiallinktext {

    @Description("Verify that create account navigation")
    @Test
    public void test_login_vwo(){

    WebDriver driver = new ChromeDriver();
    driver.get("http://app.vwo.com");
    driver.manage().window().maximize();

//    WebElement Start_Free_trail = driver.findElement(By.linkText("Start a FREE TRIAL"));
//    Start_Free_trail.click();

        WebElement Start_Free_trail = driver.findElement(By.partialLinkText("Start a"));
        Start_Free_trail.click();

        driver.quit();
}
}

