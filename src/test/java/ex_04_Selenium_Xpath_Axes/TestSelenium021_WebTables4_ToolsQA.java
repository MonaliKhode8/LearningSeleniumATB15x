package ex_04_Selenium_Xpath_Axes;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium021_WebTables4_ToolsQA {

    //Add five employees. Make sure the third one is legal department.
    // Click on the, if you find the first legal department, delete that item.
@Test
    public void ToolsQA_test() throws Exception  {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement Add_button = driver.findElement(By.id("addNewRecordButton"));
        Add_button.click();

       driver.findElement(By.id("firstName")).sendKeys("Isha1");
       driver.findElement(By.id("lastName")).sendKeys("Deo");
       driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");
       driver.findElement(By.id("age")).sendKeys("28");
       driver.findElement(By.id("salary")).sendKeys("50000");
       driver.findElement(By.id("department")).sendKeys("IT");
       driver.findElement(By.id("submit")).click();

       Thread.sleep(3000);
       Add_button.click();
       Thread.sleep(3000);


    driver.findElement(By.id("firstName")).sendKeys("John2");
    driver.findElement(By.id("lastName")).sendKeys("Loren");
    driver.findElement(By.id("userEmail")).sendKeys("test1@gmail.com");
    driver.findElement(By.id("age")).sendKeys("30");
    driver.findElement(By.id("salary")).sendKeys("35000");
    driver.findElement(By.id("department")).sendKeys("Civil");
    driver.findElement(By.id("submit")).click();

    Thread.sleep(3000);
    Add_button.click();
    Thread.sleep(3000);

    driver.findElement(By.id("firstName")).sendKeys("Sita3");
    driver.findElement(By.id("lastName")).sendKeys("Raman");
    driver.findElement(By.id("userEmail")).sendKeys("test001@gmail.com");
    driver.findElement(By.id("age")).sendKeys("38");
    driver.findElement(By.id("salary")).sendKeys("41000");
    driver.findElement(By.id("department")).sendKeys("Legal");
    driver.findElement(By.id("submit")).click();


    Thread.sleep(3000);
    Add_button.click();
    Thread.sleep(3000);

    driver.findElement(By.id("firstName")).sendKeys("Jaya4");
    driver.findElement(By.id("lastName")).sendKeys("Ash");
    driver.findElement(By.id("userEmail")).sendKeys("test023@gmail.com");
    driver.findElement(By.id("age")).sendKeys("26");
    driver.findElement(By.id("salary")).sendKeys("9000");
    driver.findElement(By.id("department")).sendKeys("Police");
    driver.findElement(By.id("submit")).click();

    Thread.sleep(3000);
    Add_button.click();
    Thread.sleep(3000);

    driver.findElement(By.id("firstName")).sendKeys("Manisha5");
    driver.findElement(By.id("lastName")).sendKeys("Hadde");
    driver.findElement(By.id("userEmail")).sendKeys("test029@gmail.com");
    driver.findElement(By.id("age")).sendKeys("56");
    driver.findElement(By.id("salary")).sendKeys("95000");
    driver.findElement(By.id("department")).sendKeys("MBBS");
    driver.findElement(By.id("submit")).click();

    Thread.sleep(3000);

    while (true) {

        List<WebElement> rows = driver.findElements(
                By.xpath("//div[@role='rowgroup'][.//div[text()='Legal']]")
        );

        if (rows.size() == 0) {
            break;
        }

        rows.get(0).findElement(By.xpath(".//span[@title='Delete']")).click();

        Thread.sleep(1000); // wait after delete
    }

    System.out.println("All Legal rows deleted successfully");
}

}

