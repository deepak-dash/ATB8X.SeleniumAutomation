package org.seleniumautomationdeepak;

import org.testng.annotations.Test;

public class TestClass {
    @Test
    public void testBrowser(){
        LoginPagePOM pagePOM = new LoginPagePOM();
        pagePOM.login("deepak.d@gmail.com" , "Admin@123");

    }
}
