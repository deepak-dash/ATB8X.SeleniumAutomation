package org.seleniumautomationdeepak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.*;

public class LoginPagePOM {
    WebDriver driver;

    LoginPagePOM(){
        driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");


    }
    //Page locators attributes
    private By username = By.id("login-username");

    private By password = By.id("login-password");

    private By signIn   = By.id("js-login-btn");

    //page action method
    public void login(String email , String passw){
        driver.findElement(username).sendKeys(email);
        driver.findElement(password).sendKeys(passw);
        driver.findElement(signIn).click();

    }
}
