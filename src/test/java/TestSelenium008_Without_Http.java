import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium008_Without_Http {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("www.google.com");            // Without https
        driver.get("https://www.google.com");    //  https is important


    }
}
