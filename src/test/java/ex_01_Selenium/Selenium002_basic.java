package ex_01_Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium002_basic {
    public static void main(String[] args) {

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://sdet.live");
        driver.quit();
    }
}
