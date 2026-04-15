package ex_04_Selenium_Xpath_Axes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium018_WebTables {

    @Test

    public void test_web_table_login(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();




    }
}
