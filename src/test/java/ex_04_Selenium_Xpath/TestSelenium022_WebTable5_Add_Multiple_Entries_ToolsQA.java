import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestSelenium022_WebTable5_Add_Multiple_Entries_ToolsQA {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/webtables");

        // Add 5 entries
        for (int i = 1; i <= 5; i++) {

            // Click Add button
            driver.findElement(By.id("addNewRecordButton")).click();

            // Fill form
            driver.findElement(By.id("firstName")).sendKeys("User" + i);
            driver.findElement(By.id("lastName")).sendKeys("Test" + i);
            driver.findElement(By.id("userEmail")).sendKeys("user" + i + "@gmail.com");
            driver.findElement(By.id("age")).sendKeys("" + (20 + i));
            driver.findElement(By.id("salary")).sendKeys("" + (10000 * i));
            driver.findElement(By.id("department")).sendKeys("Dept" + i);

            // Click Submit
            driver.findElement(By.id("submit")).click();

            Thread.sleep(1000);
        }

        System.out.println("5 entries added successfully");

        // driver.quit();
    }
}