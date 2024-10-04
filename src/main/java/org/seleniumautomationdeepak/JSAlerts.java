package org.seleniumautomationdeepak;

import io.qameta.allure.Owner;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//https://the-internet.herokuapp.com/
public class JSAlerts {
    @Owner("Deepak")
    @Test
    public void alerts(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\deepa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.manage().window().maximize();
       // driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
      //  driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

        Alert alert = driver.switchTo().alert();
        //String alert_text= alert.getText();
      //  System.out.println(alert_text);


       // String alert_text1= alert.getText();
        //System.out.println(alert_text1);
        //alert.dismiss(); //accept or dismiss


        alert.sendKeys("Enter text in alert box");
        alert.accept();
        String result= driver.findElement(By.id("result")).getText();
        System.out.println(result);

        driver.quit();

    }
}
