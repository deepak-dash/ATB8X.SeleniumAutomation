package org.seleniumautomationdeepak;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class MakeMyTrip {


    WebDriver driver;
    WebDriverWait wait;

    @Owner("Deepak")
    @BeforeTest
    public void open_browser() {
        driver = new ChromeDriver();

    }

    @Test
    public void mmt() {
        String url = "https://makemytrip.com";
        driver.get(url);
        driver.manage().window().maximize();

        try {
            WebElement close_popup = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@data-cy='closeModal']")));
            close_popup.click();
        } catch (Exception e) {
            System.out.println("No popup found or unable to close it.");
        }

        Actions actions = new Actions(driver);
        WebElement fromcity = driver.findElement(By.id("fromCity"));
        actions.moveToElement(fromcity).click().sendKeys("New Delhi, India").build().perform();

        List<WebElement> li = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
        for(WebElement e:li){
            if (e.getText().contains("New Delhi, India")){
                e.click();
            }
        }
        WebElement tocity = driver.findElement(By.id("toCity"));
        actions.moveToElement(tocity).click().sendKeys("Mumbai,India").build().perform();


    }

    @AfterTest
    public void closeBrowser() {
            driver.quit();
    }
}

