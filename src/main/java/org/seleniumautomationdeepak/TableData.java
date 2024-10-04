package org.seleniumautomationdeepak;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//https://awesomeqa.com/webtable.html
//https://awesomeqa.com/webtable1.html

public class TableData {
    @Owner("Deepak")
    @Test
    public void tabledetails_dynamicxpath() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\deepa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");

        driver.manage().window().maximize();

       int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
       System.out.println("Row size is : " + row);

        int col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th")).size();
        System.out.println("Col size is : " + col);
        ////table[@id='customers']/tbody/tr[1]/th

        String first_part="//table[@id='customers']/tbody/tr[";
        String second_part="]/td[";
        String third_part="]";

        for (int i = 2; i <=row ; i++) {
            for (int j = 1; j <= col ; j++) {
                String dynamic_path = first_part + i + second_part + j + third_part;
                System.out.println(dynamic_path);
                String data = driver.findElement(By.xpath(dynamic_path)).getText();
                System.out.println(data + " ");

                if (data.contains("Google")){
                    String temp = dynamic_path+ "/following-sibling::td[2]";
                  //  String temp = first_part + i + second_part + (j + 1) + third_part;
                    String country_google = driver.findElement(By.xpath(temp)).getText();
                    System.out.println(country_google);
                }


            }

        }





    }
}