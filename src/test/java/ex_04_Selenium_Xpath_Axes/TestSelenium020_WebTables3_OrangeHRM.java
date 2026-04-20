package ex_04_Selenium_Xpath_Axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium020_WebTables3_OrangeHRM {
@Test
    public  void orangeHRM_table3() throws Exception {

    WebDriver driver = new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().deleteAllCookies();
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
    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[3]/div"));

    WebElement MK_tester_employee = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[21]/div/div[3]/div"));

    WebElement Employment_status = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[6]"));
    //Employment_status.getText().contains("Freelance")
    System.out.println(Employment_status.getText().contains("Freelance"));
    }
}
