Feature: add book 
Scenario: Admin add book when login
Given Admin is login
When user enters valid information about book "code breaker" and "1982115858" and "2001" and "jennifer Doudna"
Then add book to the list 

Scenario: Admin add book when dose not login
Given Admin is not login
When user enters information about book "code breaker" and "1982115858" and "2001" and "jennifer Doudna"
Then  book dose not add to the list






