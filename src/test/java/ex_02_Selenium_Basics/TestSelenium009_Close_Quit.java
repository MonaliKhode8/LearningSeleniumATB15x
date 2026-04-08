package ex_02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium009_Close_Quit {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://bing.com");
        driver.close();   // closes only current tab

        driver.quit();    // close all the browser windows, ends the session completely
    }
}
