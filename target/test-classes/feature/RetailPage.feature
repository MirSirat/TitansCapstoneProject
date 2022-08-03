Feature: Retail Page

  #Note: for this feature,you have to have an existing account
  #Backgournd keyword in cucumber
  #Any steps that are repeated at the begining of each scenario and scenario outline
  #and they are exactly the same steps for all scenario and scenario outline
  #in the same feature can be placed under Background keyword
  Background: 
    Given User is on Retail website
    And User click  on MyAccount
    When User click on Login
    And User enter username "Sirat@gmail.com" and password "123456"
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on 'Register for an Affiliate Account' link
    And User fill affiliate form with below information
      | company   | website      | taxID  | paymentMethod | payeeName |
      | TekSchool | tekschool.us | 123456 | DebitCard     | John      |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message

  @smoke
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName  | abaNumber | swiftCode | accountName | accountNumber |
      | Welsfargo | ab12345   |    454545 | Omid        |     123456789 |
    And User click on Continue button
    Then User should see a success message

  Scenario: Edit your account Information
    When User click on 'Edit your account information' link
    And User modify below information
      | firstName | lastName | email           | telephone  |
      | Mir       | Sirat    | Sirat@gmail.com | 1234512345 |
    And User click on Continue button
    Then User should see a message 'Success: Your account has been successfully updated.'
