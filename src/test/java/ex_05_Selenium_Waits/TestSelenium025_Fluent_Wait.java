package ex_05_Selenium_Waits;

import ex_06_Selenium_WaitHelper.TestSelenium026_WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium025_Fluent_Wait extends TestSelenium026_WaitHelper {

    public static void main(String[] args)  {


        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");
        driver.manage().window().maximize();

        // Locators
        WebElement email = driver.findElement(By.id("login-username"));
        email.sendKeys("Admin");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Admin@123");

        WebElement submit_button = driver.findElement(By.id("js-login-btn"));
        submit_button.click();

        //Wait - Thread.sleep
//        try {
//            Thread.sleep(5000);
//    } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        //Wait - Explicit wait
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Notification-box-description")));

        //Wait - FluentWait
//        FluentWait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                .pollingEvery(Duration.ofSeconds(2))
//                .ignoring(NoSuchElementException.class);
//
//        WebElement error_message = wait.until(new Function<WebDriver, WebElement>() {
//            @Override
//            public WebElement apply(WebDriver driver) {
//                return driver.findElement(By.className("Notification-box-description"));
//            }
//        });
//    }
//}

       new TestSelenium026_WaitHelper().waitFluentVisibility(driver,10,2, "Notification-box-description");
    }
}