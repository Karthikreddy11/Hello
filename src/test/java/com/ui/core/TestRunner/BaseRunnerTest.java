package com.ui.core.TestRunner;
import com.cucumber.listener.ExtentCucumberFormatter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import java.io.File;
import java.io.IOException;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = ("src/test/resources/features/"),
       glue={"com.ui.core.step_definitions"},
        monochrome = true,
      tags = {"@Smoke-neg"},

       plugin = {"pretty","com.cucumber.listener.ExtentCucumberFormatter:output/UIExtentreport.html",
                    "html:target/Cucumber-reports"}
       )

public class BaseRunnerTest {
       @BeforeClass
       public static void setUp() throws IOException {
              ExtentCucumberFormatter.initiateExtentCucumberFormatter();
              ExtentCucumberFormatter.loadConfig(new File("src/extent-config.xml"));

       }




}
