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

import java.util.Set;

public class WindowHandle {

        ChromeDriver driver;

        @BeforeTest
        public void open_browser(){
            driver= new ChromeDriver();
        }
        @Test
        @Owner("Deepak")
        public void window_handle(){
            driver.get("https://the-internet.herokuapp.com/windows");
            String mainWindowHandle=driver.getWindowHandle();

            WebElement link= driver.findElement(By.linkText("Click Here"));
            link.click();
            //Store all handles of all open windows in a list
            Set<String> windowHandles=driver.getWindowHandles();

            //iterate through the list of window handles
            for (String handle:windowHandles){
                driver.switchTo().window(handle);
                if (driver.getPageSource().contains("New Window")){
                    System.out.println("We found the child window ");
                    break;
                }
            }

        }
        @AfterTest
        public void close_browser(){
            driver.quit();

        }
    }

