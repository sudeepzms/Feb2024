#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


#Feature: Features of Flipkart
  #I want to use this template for my feature file

  #@tag1
  #Scenario: Search On Flipkart
    #Given Enter Url of Flipkart
    #And Search My Mobile as "
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |

      
    
Feature: Features of Flipkart
  I want to use this template for my feature file

  @SmokeTestCase
  Scenario: Search On Flipkart
   Given Enter Url of Flipkart "https://www.flipkart.com/"
   
  And Search My Mobile as "Redmi 12"
#	 Then Count the Resultant Mobiles
   #https://www.qafeast.com/demo
   
  @SmokeTestCase 
  Scenario: Work on Hovar on Menu
  Given Hovar on Menu as Men
  
  
  

 