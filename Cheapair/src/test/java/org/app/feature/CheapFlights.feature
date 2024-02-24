Feature: Cheap flights page validation
Background:
	Given launch the URL

  @Round_trip
  Scenario: Validate Correct details under the round trip
    When selecting the round trip ratio button "1"
    And choosing the departure location
    And choosing the destination location
    And choosing the depart date
    And choosing the return date
    And click the adult addition button
    And click the seniors addition button
    And click the children addition button
    And click the infants lap addition button
    And dropdown the economy
    And click the search flight button
    Then validate the Cheap flights page
    When handle the pop up
    And select the departing fligth
    Then validate the flight result page
    When click the continue button
    Then validate the fligth review page
  	Given enter the adult details "1"
    When enter the first name "KABILAN"
    And enter the middle name "kuhj"
    And enter the last name "S"
    And dropdown the gender
    And enter the day of date of birth "25"
    And dropdown the month of date of birth "09"
    And enter the year of date of birth "2002"
    Then I validate the adult details
    Given enter the adult details "2"
    When enter the first name "Manilal"
    And enter the middle name "njoijk"
    And enter the last name "V"
    And dropdown the gender
    And enter the day of date of birth "17"
    And dropdown the month of date of birth "08"
    And enter the year of date of birth "2003"
    Then I validate the adult details
  	Given enter the seniors details "3"
    When enter the first name "KABIL"
    And enter the middle name "zsdgfd"
    And enter the last name "S"
    And dropdown the gender
    And enter the day of date of birth "25"
    And dropdown the month of date of birth "09"
    And enter the year of date of birth "2015"
    Then I validate the seniors details
  	Given enter the children details "4"
    When enter the first name "kABI"
    And enter the middle name "rsfdx"
    And enter the last name "S"
    And dropdown the gender
    And enter the day of date of birth "25"
    And dropdown the month of date of birth "09"
    And enter the year of date of birth "1998"
    Then I validate the children details
  	Given enter the infants in lap details "5"
    When enter the first name "Kavi"
    And enter the middle name "sref"
    And enter the last name "S"
    And dropdown the gender
    And enter the day of date of birth "25"
    And dropdown the month of date of birth "09"
    And enter the year of date of birth "2000"
    Then I validate the infants in lap details
  	When click the credit card button
  	And enter the credit card number
  	And dropdown expired month
  	And dropdown expired year
  	And enter the CVV number
  	And enter the card holder name
  	And dropdown country
  	And enter the billing address
  	And enter the city
  	And enter the billing phone number
  	And enter the contact mail id
  	And enter create password
  	And enter confirm password
  	And selecting the agree ratio button
  	And click the purchase button
  	Then validate the purchase 
  	When quit browser 

	@Round_trip
	Scenario: Validate the suffix dropdown
		When selecting the round trip ratio button "1"
    And choosing the departure location
    And choosing the destination location
    And choosing the depart date
    And choosing the return date
    And dropdown the economy
    And click the search flight button
    Then validate the Cheap flights page
    When handle the pop up
    And select the departing fligth
    Then validate the flight result page
    When click the continue button
    Then validate the fligth review page
  	When select the suffix dropdown "<suffix>"
  	Then validate the suffix dropdown
  	
  	Examples:
			|suffix|
			|  Jr  |
			|  Sr  |
			|  II  |
			| III  |
	
	@Round_trip
	Scenario: Validate the day of the date of birth
		When selecting the round trip ratio button "1"
    And choosing the departure location
    And choosing the destination location
    And choosing the depart date
    And choosing the return date
    And dropdown the economy
    And click the search flight button
    Then validate the Cheap flights page
    When handle the pop up
    And select the departing fligth
    Then validate the flight result page
    When click the continue button
    Then validate the fligth review page
  	Given enter the adult details "1"
    When enter the first name "<first_name>"
    And enter the middle name "<middle_name>"
    And enter the last name "<last_name>"
  	And selecting the agree ratio button
  	And click the purchase button
  	Then validate the purchase 
  	When quit browser
	
  @Round_trip
  Scenario: Validate incorrect adult traveler details under the round trip
    When selecting the round trip ratio button "1"
    And choosing the departure location
    And choosing the destination location
    And choosing the depart date
    And choosing the return date
    And dropdown the economy
    And click the search flight button
    Then validate the Cheap flights page
    When handle the pop up
    And select the departing fligth
    Then validate the flight result page
    When click the continue button
    Then validate the fligth review page
  	Given enter the adult details "1"
    When enter the first name "<first_name>"
    And enter the middle name "<middle_name>"
    And enter the last name "<last_name>"
  	And selecting the agree ratio button
  	And click the purchase button
  	Then validate the purchase 
  	When quit browser
  	
  @Round_trip
  Scenario: Validate incorrect seniors traveler details under the round trip
    When selecting the round trip ratio button "1"
    And choosing the departure location
    And choosing the destination location
    And choosing the depart date
    And choosing the return date
    And click the adult subtract button
    And click the seniors addition button
    And dropdown the economy
    And click the search flight button
    Then validate the Cheap flights page
    When handle the pop up
    And select the departing fligth
    Then validate the flight result page
    When click the continue button
    Then validate the fligth review page
  	Given enter the seniors details "1"
    When enter the first name "<first_name>"
    And enter the middle name "<middle_name>"
    And enter the last name "<last_name>"
    And dropdown the gender
    And enter the day of date of birth "25"
    And dropdown the month of date of birth "09"
    And enter the year of date of birth "<seniors>"
    Then I validate the seniors details
  	When quit browser
  	
  @Round_trip
  Scenario: Validate incorrect children traveler details under the round trip
    When selecting the round trip ratio button "1"
    And choosing the departure location
    And choosing the destination location
    And choosing the depart date
    And choosing the return date
    And click the adult subtract button
    And click the children addition button
    And dropdown the economy
    And click the search flight button
    Then validate the Cheap flights page
    When handle the pop up
    And select the departing fligth
    Then validate the flight result page
    When click the continue button
    Then validate the fligth review page
  	Given enter the seniors details "1"
    When enter the first name "<first_name>"
    And enter the middle name "<middle_name>"
    And enter the last name "<last_name>"
    And dropdown the gender
    And enter the day of date of birth "25"
    And dropdown the month of date of birth "09"
    And enter the year of date of birth "<children>"
    Then I validate the seniors details
  	When quit browser
  	
  @Round_trip
  Scenario: Validate incorrect infants in lap traveler details under the round trip
    When selecting the round trip ratio button "1"
    And choosing the departure location
    And choosing the destination location
    And choosing the depart date
    And choosing the return date
    And click the adult subtract button
    And click the infants lap addition button
    And dropdown the economy
    And click the search flight button
    Then validate the Cheap flights page
    When handle the pop up
    And select the departing fligth
    Then validate the flight result page
    When click the continue button
    Then validate the fligth review page
  	Given enter the seniors details "1"
    When enter the first name "<first_name>"
    And enter the middle name "<middle_name>"
    And enter the last name "<last_name>"
    And dropdown the gender
    And enter the day of date of birth "25"
    And dropdown the month of date of birth "09"
    And enter the year of date of birth "2015"
    Then I validate the seniors details 
  	When quit browser
  	
  	Examples:
			|first_name|middle_name|last_name|children|seniors|
			|	kabil@   |  67+hgj   | ka 23^& |  2000  | 2020  |
			| kabil1   |  {[}jkK   | kabil@  |  2005  | 2018  |
			| abcd,    |  12345    | ,989    |  1960  | 2016  |
			| ab &d    |   21$     | kabil1  |  1965  | 2010  |
			| ab 3d    |  546/     | ^87     |  2010  | 2005  |
			| ab /d    |  56 87    | abcd,   |  2002  | 2003  |
			| %kjjbj   |  80 )9    | 45 \65  |  2008  | 1999  |
			| 67jhgj   |  45 \+5   | ab ~d   |  2007  | 1995  |
			| {[}jkb   |  ^87      | 80 (9   |  2003  | 1993  |
			| 12345    |  ,9-9     | ab 3d   |  1998  | 1988  |
			| 21*      |  ka 23^&  | 56 87   |  1995  | 1985  |
			| 546/     |  %k*jbj   | ab /d   |  1980  | 1982  |
			| 56 87    |  ab /d    | 546/    |  1988  | 1979  |
			| 80 (9    |  ab 3d    | %kjjbj  |  1985  | 1977  |
			| 45 \65   |  ab$&d    | 21*     |  1982  | 1974  |
			| ^87      |  abcd,    | 67jhgj  |  1970  | 1970  |
			| ,989     |  kabil1   | 12345   |  1978  | 1968  |
			| ka 23^&  |  kabil@   | {[}jkb  |  1975  | 1965  |
  	
  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
