package com.ui.core.step_definitions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.MalformedURLException;


public class Hooks {
    public static  WebDriver driver;
    public static Scenario scenario;


 @Before
 //Delete all cookies at the start of each scenario to avoid shared state between tests
    public void openChromeBrowser() throws MalformedURLException {

            System.out.println("\n Launched ChromeBrowser\n");
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();


    }

@After
    //Embed a screenshot in test report if test is scenario is failed and then close the browser
public void embedScreenshot(Scenario scenario) {

    if(scenario.isFailed()) {
        try {
            scenario.write("Current Page URL is " + driver.getCurrentUrl());
//            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }

    }
    driver.quit();

}
}











