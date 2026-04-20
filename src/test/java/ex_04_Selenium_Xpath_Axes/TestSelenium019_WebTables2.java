package ex_04_Selenium_Xpath_Axes;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium019_WebTables2 {
@Test
    public void test_web_table2() {

    WebDriver driver = new ChromeDriver();
    driver.get("https://awesomeqa.com/webtable1.html");
    driver.manage().window().maximize();

    // the Full Xpath for Dubai is -  //table[@summary="Sample Table"]/tbody/tr/th[1]/td[2]
    WebElement table = driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]/tbody"));

    List<WebElement> row_tables = table.findElements(By.tagName("tr"));

    for (int i = 0; i < row_tables.size(); i++) {

        List<WebElement> column_table = row_tables.get(i).findElements(By.tagName("td"));
        for (WebElement c : column_table) {
            System.out.println(c.getText());

        }
    }
    System.out.println("----------------");
}
}