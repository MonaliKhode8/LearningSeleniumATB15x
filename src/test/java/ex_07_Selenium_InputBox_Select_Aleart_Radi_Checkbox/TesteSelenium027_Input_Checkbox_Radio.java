package ex_07_Selenium_InputBox_Select_Aleart_Radi_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TesteSelenium027_Input_Checkbox_Radio {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement first_name = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        WebElement last_name = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));

        first_name.sendKeys("Monali");
        last_name.sendKeys("Khode");

        WebElement female_radiobtn = driver.findElement(By.xpath("//input[@id=\"sex-1\"]"));
        female_radiobtn.click();

        WebElement automation_tester_checkbox = driver.findElement(By.xpath("//input[@id=\"profession-1\"]"));
        automation_tester_checkbox.click();

        WebElement button = driver.findElement(By.xpath("//button[@id=\"submit\"]"));
        button.click();

        System.out.println("The URL is "+driver.getCurrentUrl());

        driver.quit();
    }
}
