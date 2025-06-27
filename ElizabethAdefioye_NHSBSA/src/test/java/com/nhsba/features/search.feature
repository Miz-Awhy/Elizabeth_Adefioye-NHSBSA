Feature: Search feature

  Scenario: Validate search behavior based on Job tile, location and date posted

    Given I am a jobseeker on NHS Jobs website
    When I put my preferences into the Search functionality
    Then I should get a list of jobs which matches my preferences
    And I sort my search results with the newest Date Posted