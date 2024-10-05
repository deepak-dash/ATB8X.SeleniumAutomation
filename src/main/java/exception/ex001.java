package exception;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ex001 {
    ChromeDriver driver;
    @BeforeTest
    public void loginBrowser(){
       //Create session via Api and Session ID is generated
        driver= new ChromeDriver();

    }
    @Test
    public void testBrowser(){
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        try {
            WebElement element = driver.findElement(By.id("No id"));
        }catch (NoSuchElementException e){
            System.out.println("Element not found");
        }

        try {
            driver.navigate().to("https://www.google.com/");
            WebElement element = driver.findElement(By.name("q"));
            driver.navigate().refresh();
            element.sendKeys("Deepak Dash");
        }catch (StaleElementReferenceException e){
            System.out.println(e.getMessage());
        }


    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();

    }
}
