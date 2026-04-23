package ex_05_Selenium_Waits;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium022_Thread_sleep_MiniProject01 {

    @Owner("Monali")
    @Description("Test OrangeHRM Login feature with Xpath")
    @Test
    public void test_OrangeHRM_login() throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        //driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement input_username = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement input_password = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement login_btn = driver.findElement(By.xpath("//button[@type='submit']"));

        input_username.sendKeys("admin");
        input_password.sendKeys("Hacker@4321");
        login_btn.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        WebElement verify_dashboard_contains_PIM = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
        Assert.assertEquals(verify_dashboard_contains_PIM.getText(),"PIM");

        System.out.println(verify_dashboard_contains_PIM.getText());
        driver.quit();

    }

}
