package org.seleniumautomationdeepak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
         ChromeDriver driver;

    @BeforeTest
    public void loginBrowser(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\deepa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        driver.manage().window().maximize();
    }
    @Test
    public void positive(){
        WebElement make_appointment= driver.findElement(By.id("btn-make-appointment"));
        make_appointment.click();

        WebElement Username = driver.findElement(By.id("txt-username"));
        Username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement login = driver.findElement(By.id("btn-login"));
        login.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    @Test
    public void negative(){
        WebElement make_appointment= driver.findElement(By.id("btn-make-appointment"));
        make_appointment.click();

        WebElement Username = driver.findElement(By.id("txt-username"));
        Username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("test");

        WebElement login = driver.findElement(By.id("btn-login"));
        login.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();

    }
}
