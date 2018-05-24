@Smoke-neg
Feature: Test Harness feature
  As a user
  I want to search for the required vehicle

  Scenario Outline: Unuccessful Vehicle search by VIN due to Blank fields
    Given I open the URL
    Then I should see 'Test Harness' page
    And I should see 'Find Vehicle','Provisioning', 'Status','Provisioning History' tabs
    When I click on 'Find Vehicle' tab
    And I see 'Find Vehicle by' dropdown to select my search option
    And I select required 'Find_Vehicle_by_VIN' dropdown value for search
    And I Enter my "<vehicle_search_Invalid_value>" invalid value in the 'VIN' text field
    And Click on 'Magnifying glass icon' to perform search
    Then I see VIN Blank Validation error message

    Examples:
      | vehicle_search_Invalid_value |
      |                              |


  Scenario Outline: Unuccessful Vehicle search by VIN due to Invalid data
    Given I open the URL
    Then I should see 'Test Harness' page
    And I should see 'Find Vehicle','Provisioning', 'Status','Provisioning History' tabs
    When I click on 'Find Vehicle' tab
    And I see 'Find Vehicle by' dropdown to select my search option
    And I select required 'Find_Vehicle_by_VIN' dropdown value for search
    And I Enter my "<vehicle_search_Invalid_value>" invalid value in the 'VIN' text field
    And Click on 'Magnifying glass icon' to perform search
    Then I see VIN error message

    Examples:
     | vehicle_search_Invalid_value |
     |2T2BE2CF1                     |
     |2T2BE2CF1GC3719%!             |

  Scenario Outline: Unuccessful Vehicle search by VIN due to Incorrect data
    Given I open the URL
    Then I should see 'Test Harness' page
    And I should see 'Find Vehicle','Provisioning', 'Status','Provisioning History' tabs
    When I click on 'Find Vehicle' tab
    And I see 'Find Vehicle by' dropdown to select my search option
    And I select required 'Find_Vehicle_by_VIN' dropdown value for search
    And I Enter my "<vehicle_search_Incorrect_value>" incorrect value in the 'VIN 'text field
    And Click on 'Magnifying glass icon' to perform search
    Then I see an alert box with error message

    Examples:
      | vehicle_search_Incorrect_value |
      | xyzxyzxyzabc12345              |

  Scenario Outline: Unuccessful Vehicle search by IMEI due to Invalid data
    Given I open the URL
    Then I should see 'Test Harness' page
    And I should see 'Find Vehicle','Provisioning', 'Status','Provisioning History' tabs
    When I click on 'Find Vehicle' tab
    And I see 'Find Vehicle by' dropdown to select my search option
    And I select required 'Find_Vehicle_by_IMEI' dropdown value for search
    And I Enter my "<vehicle_search_Invalid_value>" invalid value in the 'IMEI' text field
    And Click on 'Magnifying glass icon' to perform search
    Then I see IMEI error message

    Examples:
       | vehicle_search_Invalid_value |
       |                              |
       |109000000                     |


  Scenario Outline: Unuccessful Vehicle search by IMEI due to Incorrect data
    Given I open the URL
    Then I should see 'Test Harness' page
    And I should see 'Find Vehicle','Provisioning', 'Status','Provisioning History' tabs
    When I click on 'Find Vehicle' tab
    And I see 'Find Vehicle by' dropdown to select my search option
    And I select required 'Find_Vehicle_by_IMEI' dropdown value for search
    And I Enter my "<vehicle_search_Incorrect_value>" incorrect value in the 'IMEI 'text field
    And Click on 'Magnifying glass icon' to perform search
    Then I see an alert box with error message

    Examples:
      | vehicle_search_Incorrect_value |
      | 123456789012345                |
      |1090000000339%!                 |