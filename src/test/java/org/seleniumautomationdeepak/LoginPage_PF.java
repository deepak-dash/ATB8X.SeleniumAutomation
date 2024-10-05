package org.seleniumautomationdeepak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
    WebDriver driver;

    LoginPage_PF(){
        driver = new ChromeDriver();
     //   pageFactory.initElements(driver,this);

    }
    //Page locators attributes by using @findBy
    @FindBy(id = "login-username")
    WebElement username;

    @FindBy(id = "login-password")
    WebElement password;

    @FindBy(id = "js-login-btn")
    WebElement signIn;

    //page action method
    public void login(String email , String passw){
        username.sendKeys(email);
        password.sendKeys(passw);
        signIn.click();

    }
}
