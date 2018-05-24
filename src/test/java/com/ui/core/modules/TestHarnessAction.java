package com.ui.core.modules;

import com.ui.core.helpers.Utilities;
import com.ui.core.pageobjects.TestHarnessPage;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;


public class TestHarnessAction {

    public static WebDriver driver;
    public static Properties prop;


    public static void VerifyHeader(WebDriver driver) throws Exception {
        if (TestHarnessPage.TESTHARNESS_HEADER.size()!= 0) {
            System.out.println("\n TEST HARNESS header is displayed");
        } else {
            Assert.fail("\n TEST HARNESS header is Missing");
        }

    }
    public static void VerifyTabs(WebDriver driver) throws Exception {
        if (TestHarnessPage.TESTHARNESS_FINDVEHICLE_TAB.size()!= 0) {
            System.out.println("\n Find Vehicle Tab is available");
        } else {
            Assert.fail("\n  Find Vehicle Tab is Missing");
        }

        if (TestHarnessPage.TESTHARNESS_PROVISIONING_TAB.size()!= 0) {
            System.out.println("\n Provisioning Tab is available");
        } else {
            Assert.fail("\n  Provisioning Tab is Missing");
        }

        if (TestHarnessPage.TESTHARNESS_STATUS_TAB.size()!= 0) {
            System.out.println("\n Status Tab is available");
        } else {
            Assert.fail("\n  Status Tab is Missing");
        }

        if (TestHarnessPage.TESTHARNESS_PROVISIONING_HISTORY_TAB.size()!= 0) {
            System.out.println("\n Provisioning History Tab is available");
        } else {
            Assert.fail("\n  Provisioning History Tab is Missing");
        }

    }

    public static void ClickOnFindVehicle(WebDriver driver) throws Exception {
        if (TestHarnessPage.TESTHARNESS_HEADER.size()!= 0) {
            TestHarnessPage.TESTHARNESS_HEADER.get(0).click();
            System.out.println("\n Find Vehicle Tab is clicked");

        } else {
            Assert.fail("\n Find Vehicle Tab is Missing");
        }

    }
    public static void VerifyFindVehiclebydropdown(WebDriver driver) throws Exception {
        if (TestHarnessPage.TESTHARNESS_FINDVEHICLEBY_DROPDOWN.isDisplayed()) {
            System.out.println("\n Find Vehicle by dropdown is avaialable");
        } else {
            Assert.fail("\n Find Vehicle by dropdown is Missing");
        }}

   /* public static void VerifyFindVehiclebydropdownValue(WebDriver driver,String Find_Vehicle_by) throws Exception {
        Actions act = new Actions(driver);

        if (TestHarnessPage.TESTHARNESS_FINDVEHICLEBY_DROPDOWN.isDisplayed()) {

            act.moveToElement(TestHarnessPage.TESTHARNESS_FINDVEHICLEBY_DROPDOWN).click().perform();
                Utilities.waitForElement1(5000);
                for (int i = 0; i <=2; i++) {
                    if (TestHarnessPage.TESTHARNESS_FINDVEHICLEBY_DROPDOWN_VALUE.getText().equals(Find_Vehicle_by)) {
                        act.moveToElement(TestHarnessPage.TESTHARNESS_FINDVEHICLEBY_DROPDOWN_VALUE).sendKeys(Keys.ENTER).perform();
                        return;
                    } else {
                        act.moveToElement(TestHarnessPage.TESTHARNESS_FINDVEHICLEBY_DROPDOWN_VALUE).sendKeys(Keys.ARROW_DOWN).sendKeys((Keys.ENTER)).perform();
                    }
                }
                System.out.println("\n Find vehicle by dropdown value is selected");

            }
            else {
            Assert.fail("\n Find Vehicle by dropdown value is Missing");
        }}
*/
    public static void SelectFindVehiclebyVINdropdownValue(WebDriver driver) throws Exception {
        Actions act = new Actions(driver);
        if (TestHarnessPage.TESTHARNESS_FINDVEHICLEBY_DROPDOWN.isDisplayed()) {
            act.moveToElement(TestHarnessPage.TESTHARNESS_FINDVEHICLEBY_DROPDOWN).click().perform();
            Utilities.waitForElement1(5000);
            act.moveToElement(TestHarnessPage.TESTHARNESS_FINDVEHICLEBY_DROPDOWN_VALUE).sendKeys(Keys.ENTER).perform();
            System.out.println("\n Find vehicle by VIN dropdown value is selected");

        }
        else {
            Assert.fail("\n Find Vehicle by dropdown value is Missing");
        }}

    public static void SelectFindVehiclebyIMEIdropdownValue(WebDriver driver) throws Exception {
        Actions act = new Actions(driver);
        if (TestHarnessPage.TESTHARNESS_FINDVEHICLEBY_DROPDOWN.isDisplayed()) {
            act.moveToElement(TestHarnessPage.TESTHARNESS_FINDVEHICLEBY_DROPDOWN).click().perform();
            Utilities.waitForElement1(5000);
            act.moveToElement(TestHarnessPage.TESTHARNESS_FINDVEHICLEBY_DROPDOWN_VALUE).sendKeys(Keys.ARROW_DOWN).sendKeys((Keys.ENTER)).perform();
            System.out.println("\n Find vehicle by IMEI dropdown value is selected");

        }
        else {
            Assert.fail("\n Find Vehicle by dropdown value is Missing");
        }}

    public static void EnterVehicleSearchValue(WebDriver driver,String vehicle_search_value) throws Exception {
        Actions act = new Actions(driver);
        if (TestHarnessPage.TESTHARNESS_FINDVEHICLEBY_VALUE_TEXTFIELD.isDisplayed()) {
            act.moveToElement(TestHarnessPage.TESTHARNESS_FINDVEHICLEBY_VALUE_TEXTFIELD).click().sendKeys(vehicle_search_value).build().perform();
            Utilities.waitForElement1(5000);
            System.out.println("\n Vehicle search value is entered");

        } else {
            Assert.fail("\n Vehicle search value field is Missing");
        }

    }


    public static void PerformVehicleSearch(WebDriver driver) throws Exception {
        Actions act = new Actions(driver);
        if (TestHarnessPage.TESTHARNESS_VEHICLE_SEARCH.isDisplayed()) {
            act.moveToElement(TestHarnessPage.TESTHARNESS_VEHICLE_SEARCH).click().perform();
            Utilities.waitForElement1(5000);
            System.out.println("\n Vehicle search is performed");

        } else {
            Assert.fail("\n Vehicle search value field is Missing");
        }

    }

    public static void VehicleSearchResultDisplay(WebDriver driver) throws Exception {
        if (TestHarnessPage.TESTHARNESS_VEHICLE_SEARCH_RESULT_DISPLAY.isDisplayed()) {
            System.out.println("\n Vehicle search results are displayed");

        } else {
            Assert.fail("\n Vehicle search results are Missing");
        }

    }

    public static void VerifyVINSearchResults(WebDriver driver) throws Exception {
        InputStream input = null;
        prop=new Properties();
        try {
            input=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\TestData.properties");
            prop.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (TestHarnessPage.TESTHARNESS_VEHICLE_SEARCH_BY_VIN_RESULT.isDisplayed()) {
            String Actual_VehicleVINValue = prop.getProperty("VIN_Value");
            String Expected_VehicleVINValue = TestHarnessPage.TESTHARNESS_VEHICLE_SEARCH_BY_VIN_RESULT.getText();
            Assert.assertEquals(Actual_VehicleVINValue, Expected_VehicleVINValue);
            System.out.println("\n Valid result is returned");
            Utilities.waitForElement1(5000);

        } else {
            Assert.fail("\n No results returned");
        }

    }

    public static void VerifyIMEISearchResults(WebDriver driver) throws Exception {
        InputStream input = null;
        prop=new Properties();
        try {
            input=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\TestData.properties");
            prop.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (TestHarnessPage.TESTHARNESS_VEHICLE_SEARCH_BY_IMEI_RESULT.isDisplayed()) {
            String Actual_VehicleIMEIValue = prop.getProperty("IMEI_Value");
            String Expected_VehicleIMEIValue = TestHarnessPage.TESTHARNESS_VEHICLE_SEARCH_BY_IMEI_RESULT.getText();
            Assert.assertEquals(Actual_VehicleIMEIValue, Expected_VehicleIMEIValue);
            System.out.println("\n Valid result is returned");
            Utilities.waitForElement1(5000);

        } else {
            Assert.fail("\n No results returned");
        }

    }
    public static void VerifyVINBlankValidationMessage(WebDriver driver) throws Exception {
        InputStream input = null;
        prop=new Properties();
        try {
            input=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\TestData.properties");
            prop.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (TestHarnessPage.TESTHARNESS_VEHICLE_SEARCH_VIN_VALIDATION_ERROR.isDisplayed()) {
            String Actual_VehicleVINBlankErrorValue = prop.getProperty("VIN_Error_Message_Blank");
            String Expected_VehicleVINBlankErrorValue = TestHarnessPage.TESTHARNESS_VEHICLE_SEARCH_VIN_VALIDATION_ERROR.getText();
            Assert.assertEquals(Actual_VehicleVINBlankErrorValue, Expected_VehicleVINBlankErrorValue);
            System.out.println("\n Vehicle search by VIN Error message is displayed- "+Expected_VehicleVINBlankErrorValue);

        } else {
            Assert.fail("\n VIN Error message is Missing");
        }

    }

    public static void VerifyVINValidationMessage(WebDriver driver) throws Exception {
        InputStream input = null;
        prop=new Properties();
        try {
            input=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\TestData.properties");
            prop.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (TestHarnessPage.TESTHARNESS_VEHICLE_SEARCH_VIN_VALIDATION_ERROR.isDisplayed()) {
            String Actual_VehicleVINErrorValue = prop.getProperty("VIN_Error_Message_Invalid");
            String Expected_VehicleVINErrorValue = TestHarnessPage.TESTHARNESS_VEHICLE_SEARCH_VIN_VALIDATION_ERROR.getText();
            Assert.assertEquals(Actual_VehicleVINErrorValue, Expected_VehicleVINErrorValue);
            System.out.println("\n Vehicle search by VIN Error message is displayed"+Expected_VehicleVINErrorValue);

        } else {
            Assert.fail("\n VIN Error message is Missing");
        }

    }

    public static void VerifyIMEIValidationMessage(WebDriver driver) throws Exception {
        InputStream input = null;
        prop=new Properties();
        try {
            input=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\TestData.properties");
            prop.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (TestHarnessPage.TESTHARNESS_VEHICLE_SEARCH_IMEI_VALIDATION_ERROR.isDisplayed()) {
            String Actual_VehicleIMEIErrorValue = prop.getProperty("IMEI_Error_Message");
            String Expected_VehicleIMEIErrorValue = TestHarnessPage.TESTHARNESS_VEHICLE_SEARCH_IMEI_VALIDATION_ERROR.getText();
            Assert.assertEquals(Actual_VehicleIMEIErrorValue, Expected_VehicleIMEIErrorValue);
            System.out.println("\n Vehicle search by IMEI Error message is displayed"+Expected_VehicleIMEIErrorValue);

        } else {
            Assert.fail("\n IMEI Error message is Missing");
        }

    }

    public static void VerifyAlertBoxValidationMessage(WebDriver driver) throws Exception {
        if (TestHarnessPage.TESTHARNESS_VEHICLE_SEARCH_Incorrect.isDisplayed()) {
            String Incorrect_Vehicle_Search_Message=TestHarnessPage.TESTHARNESS_VEHICLE_SEARCH_Incorrect.getText();
            System.out.println("\n Incorrect Vehicle search error message is displayed- "+Incorrect_Vehicle_Search_Message);
            TestHarnessPage.TESTHARNESS_VEHICLE_SEARCH_Incorrect_Close_Button.click();
            System.out.println("\n Error message alert box is closed");


        } else {
            Assert.fail("\n Error message on Alert box is Missing");
        }

    }
}


