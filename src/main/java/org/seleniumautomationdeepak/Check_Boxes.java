package org.seleniumautomationdeepak;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Check_Boxes {

    @Owner("Deepak")
    @Test
    public void checkbox() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\deepa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        driver.manage().window().maximize();

        //List<WebElement> all_check=driver.findElements(By.cssSelector("//input[type='checkbox']"));
        List<WebElement> all_check = driver.findElements(By.cssSelector("input[type='checkbox']"));

        for (WebElement checkbox:all_check){
            if(!checkbox.isSelected())
                checkbox.click();
        }
    }
}