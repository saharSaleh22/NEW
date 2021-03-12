Feature: feature to search books

  Scenario: Search book by substring of title 
    Given I search about book by title
    When The user clicked search write sub string "dog"
    Then A book with name contain  should be returned and printed on the screen
 
   Scenario: Search book by substring of auther name  
     Given I search about book by author
    When The user search write sub string of title div "dav"
    Then A book with author contain should be returned and printed on the screen
    
      Scenario: Search book by substring of ISBN 
     Given I search about book by isbn
     When The user search write sub string of isbn div "323"
     Then A book with isbn contain should be returned and printed on the screen

 

   
    Scenario: : Find more than one book by author 
    Given I search about one more book auther 
    When I search about more one book his auther name is "dav" 
    Then A list of books that the auther is  should be returned and printed on the screen
    
      Scenario: : Find more than one book by title 
    Given I search about one more book title
    When I search about one more book his auther name is "dog" 
    Then A list of books that the title is should be returned and printed on the screen
    
      Scenario: : Find more than one book by isbn 
    Given I search about one more book isbn
    When I search about one more book his isbn name is "323" 
    Then A list of books that the isbn is  should be returned and printed on the screen
   
