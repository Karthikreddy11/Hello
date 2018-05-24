@Smoke-pos
Feature: Test Harness feature
  As a user
  I want to search for the required vehicle

    Scenario Outline: Successful Vehicle search by VIN
      Given I open the URL
      Then I should see 'Test Harness' page
      And I should see 'Find Vehicle','Provisioning', 'Status','Provisioning History' tabs
      When I click on 'Find Vehicle' tab
      And I see 'Find Vehicle by' dropdown to select my search option
      And I select required 'Find_Vehicle_by_VIN' dropdown value for search
      And I Enter my "<vehicle_search_value>" in the text field adjacent to 'Find Vehicle by' dropdown
      And Click on 'Magnifying glass icon' to perform search
      Then I see my Vehicle search results

    Examples:
       | vehicle_search_value |
       | 2T2BE2CF1GC371900    |

  Scenario Outline: Successful Vehicle search by IMEI
    Given I open the URL
    Then I should see 'Test Harness' page
    And I should see 'Find Vehicle','Provisioning', 'Status','Provisioning History' tabs
    When I click on 'Find Vehicle' tab
    And I see 'Find Vehicle by' dropdown to select my search option
    And I select required 'Find_Vehicle_by_IMEI' dropdown value for search
    And I Enter my "<vehicle_search_value>" in the text field adjacent to 'Find Vehicle by' dropdown
    And Click on 'Magnifying glass icon' to perform search
    Then I see my Vehicle search results

    Examples:
      | vehicle_search_value |
      | 109000000033985      |

  Scenario Outline: Successful Vehicle search by VIN - valid search results display
    Given I open the URL
    Then I should see 'Test Harness' page
    And I should see 'Find Vehicle','Provisioning', 'Status','Provisioning History' tabs
    When I click on 'Find Vehicle' tab
    And I see 'Find Vehicle by' dropdown to select my search option
    And I select required 'Find_Vehicle_by_VIN' dropdown value for search
    And I Enter my "<vehicle_search_value>" in the text field adjacent to 'Find Vehicle by' dropdown
    And Click on 'Magnifying glass icon' to perform search
    Then I see my Vehicle search results
    Then I verify if the valid Vehicle Search by VIN results are returned

    Examples:
      | vehicle_search_value |
      | 2T2BE2CF1GC371900    |


  Scenario Outline: Successful Vehicle search by IMEI - valid search results display
    Given I open the URL
    Then I should see 'Test Harness' page
    And I should see 'Find Vehicle','Provisioning', 'Status','Provisioning History' tabs
    When I click on 'Find Vehicle' tab
    And I see 'Find Vehicle by' dropdown to select my search option
    And I select required 'Find_Vehicle_by_IMEI' dropdown value for search
    And I Enter my "<vehicle_search_value>" in the text field adjacent to 'Find Vehicle by' dropdown
    And Click on 'Magnifying glass icon' to perform search
    Then I see my Vehicle search results
    Then I verify if the valid Vehicle Search by IMEI results are returned


    Examples:
      | vehicle_search_value |
      | 109000000033985      |

