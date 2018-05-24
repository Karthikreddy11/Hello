package com.ui.core.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;


public class TestHarnessPage extends WebdriverConnector{

    public TestHarnessPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how= How.XPATH, using = "//*[contains(@class, 'mat-tab-link')]/..//*[@href='#/vehicle-search']")
    public static List<WebElement> TESTHARNESS_HEADER;

    @FindBy(how= How.XPATH, using = "//*[contains(@class, 'mat-tab-link')]/..//*[@href='#/vehicle-search']")
    public static List<WebElement> TESTHARNESS_FINDVEHICLE_TAB;

    @FindBy(how= How.XPATH, using = "//*[contains(@class, 'mat-tab-link')]/..//*[@href='#/vehicle-search']")
    public static List<WebElement> TESTHARNESS_PROVISIONING_TAB;

    @FindBy(how= How.XPATH, using = "//*[contains(@class, 'mat-tab-link')]/..//*[@href='#/vehicle-search']")
    public static List<WebElement> TESTHARNESS_STATUS_TAB;

    @FindBy(how= How.XPATH, using = "//*[contains(@class, 'mat-tab-link')]/..//*[@href='#/vehicle-search']")
    public static List<WebElement> TESTHARNESS_PROVISIONING_HISTORY_TAB;

    @FindBy(how= How.XPATH, using = "//*[@class='mat-select-value']")
    public static WebElement TESTHARNESS_FINDVEHICLEBY_DROPDOWN;

    @FindBy(how= How.XPATH, using = "//*[@class='mat-option-text']")
    public static WebElement TESTHARNESS_FINDVEHICLEBY_DROPDOWN_VALUE;

    @FindBy(how= How.XPATH, using = "//*[@class=\"mat-input-infix mat-form-field-infix\"]/input")
    public static WebElement TESTHARNESS_FINDVEHICLEBY_VALUE_TEXTFIELD;

    @FindBy(how= How.XPATH, using = "//*[@class=\"mat-icon material-icons\"]")
    public static WebElement TESTHARNESS_VEHICLE_SEARCH;

    @FindBy(how= How.XPATH, using = "//*[@class=\"title\"]")
    public static WebElement TESTHARNESS_VEHICLE_SEARCH_RESULT_DISPLAY;

    @FindBy(how= How.XPATH, using = "//table[@class=\"data shadow\"]//tbody//tr[1]//td[3]//*[@class=\"text\"]")
    public static WebElement TESTHARNESS_VEHICLE_SEARCH_BY_VIN_RESULT;

    @FindBy(how= How.XPATH, using = "//table[@class=\"data shadow\"]//tbody//tr[2]//td[3]//*[@class=\"text\"]")
    public static WebElement TESTHARNESS_VEHICLE_SEARCH_BY_IMEI_RESULT;

    @FindBy(how= How.XPATH, using = "//*[@class=\"mat-error ng-star-inserted\"]")
    public static WebElement TESTHARNESS_VEHICLE_SEARCH_VIN_VALIDATION_ERROR;

    @FindBy(how= How.XPATH, using = "//*[@id=\"imeiElement\"]//*[@class=\"mat-error ng-star-inserted\"]")
    public static WebElement TESTHARNESS_VEHICLE_SEARCH_IMEI_VALIDATION_ERROR;

    @FindBy(how= How.XPATH, using = "//*[@class=\"mat-dialog-content ng-star-inserted\"]")
    public static WebElement TESTHARNESS_VEHICLE_SEARCH_Incorrect;

    @FindBy(how= How.XPATH, using = "//*[contains(text(),'Close')]")
    public static WebElement TESTHARNESS_VEHICLE_SEARCH_Incorrect_Close_Button;

}
