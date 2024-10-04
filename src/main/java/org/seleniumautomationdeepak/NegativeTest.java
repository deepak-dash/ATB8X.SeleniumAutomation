package org.seleniumautomationdeepak;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTest {

    @Test
    @Owner("Deepak")
    public void negativetest(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\deepa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        driver.manage().window().maximize();

        WebElement make_appointment= driver.findElement(By.id("btn-make-appointment"));
        make_appointment.click();

        WebElement Username = driver.findElement(By.id("txt-username"));
        Username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("abc");

        WebElement login = driver.findElement(By.id("btn-login"));
        login.click();

        WebElement error_verify= driver.findElement(By.xpath("//p[@class='lead text-danger']"));
        System.out.println(error_verify.getText());
        Assert.assertEquals(error_verify.getText(),"Login failed! Please ensure the username and password are valid.");

        driver.quit();
    }
}
