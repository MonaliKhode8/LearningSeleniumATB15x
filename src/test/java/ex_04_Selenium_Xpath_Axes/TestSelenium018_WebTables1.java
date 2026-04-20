package ex_04_Selenium_Xpath_Axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium018_WebTables1 {

    @Test

    public void test_web_table_element() throws Exception{

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        //Full xpath for Helen Bennett in the table - "//table[@id=\"customers\"]/tbody/tr[5]/td[2]";

        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
         int column = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[5]/td")).size();

        for (int i=2; i<=row; i++){
            for (int j=1; j<=column; j++){

                String dynamic_xpath = first_part+i+second_part+j+third_part;
                //System.out.println(dynamic_xpath);
                String data = driver.findElement(By.xpath(dynamic_xpath)).getText();
                System.out.println(data);

if (data.contains("Helen")){
    String country_path = dynamic_xpath+"/following-sibling::td";
    String country_path_text = driver.findElement(By.xpath(country_path)).getText();
    String company_path = dynamic_xpath+"/preceding-sibling::td";
    String company_path_text = driver.findElement(By.xpath(company_path)).getText();

    System.out.println("-----");
    System.out.println("HElen belongs to: "+country_path_text+"-"+ company_path_text);



}

}

}
    }
}
