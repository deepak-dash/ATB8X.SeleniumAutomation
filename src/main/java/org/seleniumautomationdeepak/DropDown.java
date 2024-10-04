package org.seleniumautomationdeepak;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropDown {
   @Owner("Deepak")
    @Test
    public void dropdown() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\deepa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        driver.manage().window().maximize();

       WebElement dropdown= driver.findElement(By.id("dropdown"));
       dropdown.findElement(By.xpath("//*[@value='2']")).click();

       driver.quit();

    }
}
