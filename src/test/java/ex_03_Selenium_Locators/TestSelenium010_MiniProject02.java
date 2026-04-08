package ex_03_Selenium_Locators;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSelenium010_MiniProject02  {

  @Owner("Monali")
  @Severity(SeverityLevel.BLOCKER)
  @TmsLink("https://monalikhode028.atlassian.net/browse/SCRUM-5")
  @Description("Verify that error message comes with invalid email or signup")
  @Test
    public void Signup() throws Exception {

      WebDriver driver = new ChromeDriver();
      driver.get("https://app.vwo.com/#/login");

      driver.manage().window().maximize();

      WebElement start_a_free_trail = driver.findElement(By.partialLinkText("Start a FREE"));
      start_a_free_trail.click();

      Thread.sleep(5000);

      WebDriver driver1 = new ChromeDriver();
      driver1.get("https://vwo.com/free-trial");

      //Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

      Thread.sleep(5000
      );
      WebElement acceptBtn = driver.findElement(By.id("onetrust-accept-btn-handler"));
      acceptBtn.click();


     WebElement business_email = driver.findElement(By.name("email"));
     business_email.sendKeys("Admin@gmail.com");

     WebElement business_email_checkbox = driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
     business_email_checkbox.click();

     WebElement button_click = driver.findElement(By.tagName("button"));
     button_click.click();



    }
}
