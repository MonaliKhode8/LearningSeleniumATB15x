package ex_05_Selenium_Waits;

import ex_06_Selenium_WaitHelper.TestSelenium026_WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium024_MiniProject03 extends TestSelenium026_WaitHelper {
@Test
    public void testCloseModal() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        WebElement closeModel = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        closeModel.click();

    }
}

