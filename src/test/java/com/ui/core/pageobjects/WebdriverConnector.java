package com.ui.core.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class WebdriverConnector {
    public static WebDriver driver;
    public static boolean bResult;
    public static WebDriverWait wait;




    public WebdriverConnector(WebDriver driver){
        WebdriverConnector.driver=driver;
        WebdriverConnector.bResult=true;
        //WebdriverConnector.wait=new WebDriverWait(driver,timeout);
    }
}
