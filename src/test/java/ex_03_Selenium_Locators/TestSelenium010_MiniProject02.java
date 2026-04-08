package ex_03_Selenium_Locators;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class TestSelenium010_MiniProject02  {

  @Owner("Monali")
  @Severity(SeverityLevel.BLOCKER)
  @TmsLink("https://monalikhode028.atlassian.net/browse/SCRUM-5")
  @Description("Verify that error message comes with invalid email or signup")
  // ----- command to check the allure report --- allure serve allure-results

  @Test
    public void Signup() throws Exception {

      //WebDriver driver = new ChromeDriver();
      //driver.get("https://app.vwo.com/#/login");


      //WebElement start_a_free_trail = driver.findElement(By.partialLinkText("Start a FREE"));
      //start_a_free_trail.click();

      //Thread.sleep(5000);

      WebDriver driver = new ChromeDriver();
      driver.get("https://vwo.com/free-trial");

      driver.manage().window().maximize();

      Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      WebElement allowBtn = wait.until(ExpectedConditions.elementToBeClickable(
              By.xpath("//button[contains(text(),'Allow Cookies')]")
      ));

      allowBtn.click();


     WebElement business_email = driver.findElement(By.name("email"));
     business_email.sendKeys("1234");

     WebElement business_email_checkbox = driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
     business_email_checkbox.click();

     WebElement button_click = driver.findElement(By.tagName("button"));
     button_click.click();

     WebElement error_message = driver.findElement(By.xpath("//*[@id=\"page-free-trial-signup-form-step1\"]/div[1]/div"));
     Assert.assertEquals(error_message.getText(),"The email address you entered is incorrect.");


    }
}
