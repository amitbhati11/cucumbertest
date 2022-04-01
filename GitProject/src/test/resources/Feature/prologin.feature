Feature: 

  #//Datadrivern testing
  #	//Parameteriaztion with cucumber
  Scenario Outline: 
    Given open the browser
    When enter the url
    And open login page and enter <username> and <password>
    Then navigate to nextpage

    Examples: 
      | username | password |
      | Amit     |    12345 |
      | Elliot   |    12345 |
      | Raina    |    12345 |
