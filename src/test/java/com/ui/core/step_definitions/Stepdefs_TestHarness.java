package com.ui.core.step_definitions;

import com.ui.core.helpers.Utilities;
import com.ui.core.modules.TestHarnessAction;
import com.ui.core.pageobjects.TestHarnessPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

//import org.testng.Assert;


public class Stepdefs_TestHarness {
    public static WebDriver driver;
    public  Properties prop;
    InputStream input = null;


    // User loads the URL
    @Given("^I open the URL$")
    public void iOpenTheURL() throws Throwable {
        driver= Hooks.driver;
        prop=new Properties();
        try {
            input=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\TestData.properties");
            prop.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(prop.getProperty("URL"));
        String URL=prop.getProperty("URL");
        driver.get(URL);
    }

    @Then("^I should see 'Test Harness' page$")
    public void iShouldSeeTestHarnessPage() throws Throwable {
        PageFactory.initElements(driver, TestHarnessPage.class);
        Utilities.waitForElementToLoad(driver,TestHarnessPage.TESTHARNESS_HEADER,10 );
        TestHarnessAction.VerifyHeader(driver);
        Utilities.waitForElement(driver,5);
    }


    @And("^I should see 'Find Vehicle','Provisioning', 'Status','Provisioning History' tabs$")
    public void iShouldSeeFindVehicleProvisioningStatusProvisioningHistoryTabs() throws Throwable {
        PageFactory.initElements(driver, TestHarnessPage.class);
        Utilities.waitForElementToLoad(driver,TestHarnessPage.TESTHARNESS_FINDVEHICLE_TAB,10 );
        TestHarnessAction.VerifyTabs(driver);
        Utilities.waitForElement(driver,5);
    }

    @When("^I click on 'Find Vehicle' tab$")
    public void iClickOnFindVehicleTab() throws Throwable {
        PageFactory.initElements(driver, TestHarnessPage.class);
        Utilities.waitForElementToLoad(driver,TestHarnessPage.TESTHARNESS_FINDVEHICLE_TAB,10 );
        TestHarnessAction.ClickOnFindVehicle(driver);
        Utilities.waitForElement(driver,5);
    }

    @And("^I see 'Find Vehicle by' dropdown to select my search option$")
    public void iSeeFindVehicleByDropdownToSelectMySearchOption() throws Throwable {
        PageFactory.initElements(driver, TestHarnessPage.class);
        Utilities.waitForElementToLoad1(driver,TestHarnessPage.TESTHARNESS_FINDVEHICLEBY_DROPDOWN,10 );
        TestHarnessAction.VerifyFindVehiclebydropdown(driver);
        Utilities.waitForElement(driver,5);
    }

  /*  @And("^I select required \"([^\"]*)\" value for search$")
    public void iSelectRequiredValueForSearch(String Find_Vehicle_by) throws Throwable {
        PageFactory.initElements(driver, TestHarnessPage.class);
        Utilities.waitForElementToLoad1(driver,TestHarnessPage.TESTHARNESS_FINDVEHICLEBY_DROPDOWN,10 );
        TestHarnessAction.VerifyFindVehiclebydropdownValue(driver,Find_Vehicle_by);
        Utilities.waitForElement(driver,5);
    }*/

    @And("^I select required 'Find_Vehicle_by_VIN' dropdown value for search$")
    public void iSelectRequiredFind_Vehicle_by_VINDropdownValueForSearch() throws Throwable {
        PageFactory.initElements(driver, TestHarnessPage.class);
        Utilities.waitForElementToLoad1(driver,TestHarnessPage.TESTHARNESS_FINDVEHICLEBY_DROPDOWN,10 );
        TestHarnessAction.SelectFindVehiclebyVINdropdownValue(driver);
        Utilities.waitForElement(driver,5);
    }

    @And("^I select required 'Find_Vehicle_by_IMEI' dropdown value for search$")
    public void iSelectRequiredFind_Vehicle_by_IMEIDropdownValueForSearch() throws Throwable {
        PageFactory.initElements(driver, TestHarnessPage.class);
        Utilities.waitForElementToLoad1(driver,TestHarnessPage.TESTHARNESS_FINDVEHICLEBY_DROPDOWN,10 );
        TestHarnessAction.SelectFindVehiclebyIMEIdropdownValue(driver);
        Utilities.waitForElement(driver,5);
    }


    @And("^I Enter my \"([^\"]*)\" in the text field adjacent to 'Find Vehicle by' dropdown$")
    public void iEnterMyInTheTextFieldAdjacentToFindVehicleByDropdown(String vehicle_search_value) throws Throwable {
        PageFactory.initElements(driver, TestHarnessPage.class);
        Utilities.waitForElementToLoad1(driver,TestHarnessPage.TESTHARNESS_FINDVEHICLEBY_VALUE_TEXTFIELD,10 );
        TestHarnessAction.EnterVehicleSearchValue(driver,vehicle_search_value);
        Utilities.waitForElement(driver,5);
    }

    @And("^I Enter my \"([^\"]*)\" invalid value in the 'VIN' text field$")
    public void iEnterMyInvalidValueInTheVINTextField(String vehicle_search_Invalid_value) throws Throwable {
        PageFactory.initElements(driver, TestHarnessPage.class);
        Utilities.waitForElementToLoad1(driver,TestHarnessPage.TESTHARNESS_FINDVEHICLEBY_VALUE_TEXTFIELD,10 );
        TestHarnessAction.EnterVehicleSearchValue(driver,vehicle_search_Invalid_value);
        Utilities.waitForElement(driver,5);
    }

    @And("^I Enter my \"([^\"]*)\" invalid value in the 'IMEI' text field$")
    public void iEnterMyInvalidValueInTheIMEITextField(String vehicle_search_Invalid_value) throws Throwable {
        PageFactory.initElements(driver, TestHarnessPage.class);
        Utilities.waitForElementToLoad1(driver,TestHarnessPage.TESTHARNESS_FINDVEHICLEBY_VALUE_TEXTFIELD,10 );
        TestHarnessAction.EnterVehicleSearchValue(driver,vehicle_search_Invalid_value);
        Utilities.waitForElement(driver,5);
    }

    @And("^I Enter my \"([^\"]*)\" incorrect value in the 'VIN 'text field$")
    public void iEnterMyIncorrectValueInTheVINTextField(String vehicle_search_Incorrect_value) throws Throwable {
        PageFactory.initElements(driver, TestHarnessPage.class);
        Utilities.waitForElementToLoad1(driver,TestHarnessPage.TESTHARNESS_FINDVEHICLEBY_VALUE_TEXTFIELD,10 );
        TestHarnessAction.EnterVehicleSearchValue(driver,vehicle_search_Incorrect_value);
        Utilities.waitForElement(driver,5);
    }

    @And("^I Enter my \"([^\"]*)\" incorrect value in the 'IMEI 'text field$")
    public void iEnterMyIncorrectValueInTheIMEITextField(String vehicle_search_Incorrect_value) throws Throwable {
        PageFactory.initElements(driver, TestHarnessPage.class);
        Utilities.waitForElementToLoad1(driver,TestHarnessPage.TESTHARNESS_FINDVEHICLEBY_VALUE_TEXTFIELD,10 );
        TestHarnessAction.EnterVehicleSearchValue(driver,vehicle_search_Incorrect_value);
        Utilities.waitForElement(driver,5);
    }


    @And("^Click on 'Magnifying glass icon' to perform search$")
    public void clickOnMagnifyingGlassIconToPerformSearch() throws Throwable {
        PageFactory.initElements(driver, TestHarnessPage.class);
        Utilities.waitForElementToLoad1(driver,TestHarnessPage.TESTHARNESS_VEHICLE_SEARCH,10 );
        TestHarnessAction.PerformVehicleSearch(driver);
        Utilities.waitForElement(driver,5);
    }


    @Then("^I see my Vehicle search results$")
    public void iSeeMyVehicleSearchResults() throws Throwable {
        PageFactory.initElements(driver, TestHarnessPage.class);
        Utilities.waitForElementToLoad1(driver,TestHarnessPage.TESTHARNESS_VEHICLE_SEARCH_RESULT_DISPLAY,10 );
        TestHarnessAction.VehicleSearchResultDisplay(driver);
        Utilities.waitForElement(driver,5);
    }

    @Then("^I verify if the valid Vehicle Search by VIN results are returned$")
    public void iVerifyIfTheValidVehicleSearchByVINResultsAreReturned() throws Throwable {
        PageFactory.initElements(driver, TestHarnessPage.class);
        Utilities.waitForElementToLoad1(driver,TestHarnessPage.TESTHARNESS_VEHICLE_SEARCH_BY_VIN_RESULT,10 );
        TestHarnessAction.VerifyVINSearchResults(driver);
        Utilities.waitForElement(driver,5);
    }

    @Then("^I verify if the valid Vehicle Search by IMEI results are returned$")
    public void iVerifyIfTheValidVehicleSearchByIMEIResultsAreReturned() throws Throwable {
        PageFactory.initElements(driver, TestHarnessPage.class);
        Utilities.waitForElementToLoad1(driver,TestHarnessPage.TESTHARNESS_VEHICLE_SEARCH_BY_IMEI_RESULT,10 );
        TestHarnessAction.VerifyIMEISearchResults(driver);
        Utilities.waitForElement(driver,5);
    }
    @Then("^I see VIN Blank Validation error message$")
    public void iSeeVINBlankValidationErrorMessage() throws Throwable {
        PageFactory.initElements(driver, TestHarnessPage.class);
        Utilities.waitForElementToLoad1(driver,TestHarnessPage.TESTHARNESS_VEHICLE_SEARCH_VIN_VALIDATION_ERROR,10 );
        TestHarnessAction.VerifyVINBlankValidationMessage(driver);
        Utilities.waitForElement(driver,5);
    }
    @Then("^I see VIN error message$")
    public void iSeeVINErrorMessage() throws Throwable {
        PageFactory.initElements(driver, TestHarnessPage.class);
        Utilities.waitForElementToLoad1(driver,TestHarnessPage.TESTHARNESS_VEHICLE_SEARCH_VIN_VALIDATION_ERROR,10 );
        TestHarnessAction.VerifyVINValidationMessage(driver);
        Utilities.waitForElement(driver,5);
    }

    @Then("^I see IMEI error message$")
    public void iSeeIMEIErrorMessage() throws Throwable {
        PageFactory.initElements(driver, TestHarnessPage.class);
        Utilities.waitForElementToLoad1(driver,TestHarnessPage.TESTHARNESS_VEHICLE_SEARCH_IMEI_VALIDATION_ERROR,10 );
        TestHarnessAction.VerifyIMEIValidationMessage(driver);
        Utilities.waitForElement(driver,5);
    }

    @Then("^I see an alert box with error message$")
    public void iSeeAnAlertBoxWithErrorMessage() throws Throwable {
        PageFactory.initElements(driver, TestHarnessPage.class);
        Utilities.waitForElementToLoad1(driver,TestHarnessPage.TESTHARNESS_VEHICLE_SEARCH_Incorrect,10 );
        TestHarnessAction.VerifyAlertBoxValidationMessage(driver);
        Utilities.waitForElement(driver,5);
    }



}
