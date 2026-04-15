package ex_04_Selenium_Xpath_Axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestSelenium017_Xpath_Axes {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/xpath/");
        driver.manage().window().maximize();

       List<WebElement> mammal_elements = driver.findElements(By.xpath("//div[@class='Mammal']preceding-siblings::div"));
        mammal_elements.get(0);

        //WebElement mammal_ancestors = driver.findElement(By.xpath("//div[@class=\"Mammal\"]/ancestors::div"));
        //mammal_ancestors.getText();

driver.quit();


    }
}
