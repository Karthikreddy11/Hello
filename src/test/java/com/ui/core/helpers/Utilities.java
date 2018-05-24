package com.ui.core.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


/**
 * Created by JPILLA on 11/17/2017.
 */
public class Utilities {
    static WebElement element;

    // public static List<HashMap<String,String>> datamap;
    public static void waitForElementToLoad(WebDriver driver, List<WebElement> ele, long timeout) throws Exception{



        for (int i=0;i<timeout;i++){
            if (ele.size()==0){
                Thread.sleep(2000);
               //WebDriverWait wait=new WebDriverWait(driver,timeout);
              Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                                        .withTimeout(20, TimeUnit.SECONDS)
                                        .pollingEvery(5,TimeUnit.SECONDS)
                                        .ignoring(IndexOutOfBoundsException.class,NoSuchElementException.class);
              // wait.until(ExpectedConditions.visibilityOf(ele.get(i)));

            }else {
                //System.out.println("waiting..........");
                break;
            }
        }
    }

    public static void waitForElementToLoad1(WebDriver driver, WebElement element, long timeout) throws Exception {

        WebDriverWait wait1 = new WebDriverWait(driver, timeout);
        wait1.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForElement(WebDriver driver, long timeout) throws Exception {

        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
    }

    public static void waitForElement1(long timeout) throws Exception {

       Thread.sleep(timeout);
    }
}
