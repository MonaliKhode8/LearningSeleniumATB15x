import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium004_MaximizeMin {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("www.google.com");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().window().minimize();

        driver.close();
    }
}
