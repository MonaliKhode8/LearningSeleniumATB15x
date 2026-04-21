package ex_04_Selenium_Xpath_Axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium020_WebTables3_OrangeHRM {
@Test
    public  void orangeHRM_table3() throws Exception {

    // Login to Orangehrm and from the employee list click on dele of 1st terminated employee

    WebDriver driver = new ChromeDriver();
    driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();


    driver.navigate().refresh();

    Thread.sleep(2000);

    WebElement user_name = driver.findElement(By.xpath("//input[@name=\"username\"]"));
    WebElement pass_word = driver.findElement(By.xpath("//input[@name=\"password\"]"));
    WebElement Login_button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));

    user_name.sendKeys("admin");
    pass_word.sendKeys("Hacker@4321");
    Login_button.click();

    Thread.sleep(2000);

    WebElement Row_contain_1stTerminatedEmp = driver.findElement(By.xpath("//div[@class=\"oxd-table-card\"][2]/div/div[@role=\"cell\"][6]"));

    WebElement delete_btn = driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-trash\"]"));
    delete_btn.click();

 }

}
