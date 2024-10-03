package org.seleniumautomationdeepak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public static void loginTest() throws InterruptedException {
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
        password.sendKeys("ThisIsNotAPassword");

        WebElement login = driver.findElement(By.id("btn-login"));
        login.click();

        WebElement facility= driver.findElement(By.id("combo_facility"));
        facility.click();
        WebElement facility_option = driver.findElement(By.xpath("//option[@value='Hongkong CURA Healthcare Center']"));
        facility_option.click();


        WebElement apply = driver.findElement(By.id("chk_hospotal_readmission"));
        apply.click();


        WebElement visit_date=driver.findElement(By.id("txt_visit_date"));
        visit_date.sendKeys("16/10/2024");
        visit_date.click();

        WebElement comments= driver.findElement(By.id("txt_comment"));
        comments.sendKeys("Fever");

        Thread.sleep(2000);

        WebElement book_appointment=driver.findElement(By.id("btn-book-appointment"));
        book_appointment.click();

        driver.quit();


    }
}
