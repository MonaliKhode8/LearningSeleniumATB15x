import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestSelenium005_Assertion_TestNG {

    @Test
    public void test_selenium_01(){
        // Assert
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Current Title of Page is:"+ driver.getCurrentUrl());

        Assert.assertEquals(driver.getTitle(),"Google");


        // Asserj validation
        assertThat(driver.getTitle()).isNotBlank().isNotEmpty().isNotNull().isEqualTo("Google");

        driver.quit();

    }
}

