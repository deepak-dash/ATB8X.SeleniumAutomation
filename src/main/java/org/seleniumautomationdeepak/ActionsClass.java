package org.seleniumautomationdeepak;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.security.Key;

public class ActionsClass {

    ChromeDriver driver;

    @BeforeTest
    public void open_browser(){
        driver= new ChromeDriver();

    }
    @Test
    @Owner("Deepak")
    public void action_class(){
        driver.get("https://awesomeqa.com/practice.html");
       WebElement firstname= driver.findElement(By.name("firstname"));
        Actions actions= new Actions(driver);
        actions.keyDown(Keys.SHIFT)
                .sendKeys(firstname,"Deepak")
                .keyUp(Keys.SHIFT).build().perform();





    }
    @AfterTest
    public void close_browser(){
        driver.quit();

    }
}
