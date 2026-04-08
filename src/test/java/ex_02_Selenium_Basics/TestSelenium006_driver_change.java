package ex_02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium006_driver_change {

    public static void main(String[] args) {

        // Yes - we can chage the driver in between

        WebDriver driver = new ChromeDriver();
        driver = new FirefoxDriver();
    }
}
