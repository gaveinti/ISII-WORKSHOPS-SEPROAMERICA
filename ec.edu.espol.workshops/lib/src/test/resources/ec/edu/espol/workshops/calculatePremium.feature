Feature: Calculate the insurance prime for a customer 1.
Scenario: The customer is female and married.
GIVEN The sex is female and marital status is not single.
WHEN Calculate the premium.
THEN Substract $200 from the base premium. 
Scenario Outline: The customer is female and married or she is not. The customer is not female
GIVEN the sex is <sex> and marital status is <MatStatus>
WHEN Calculate the premium.
THEN <answer> from the base premium. 
Examples:
sex         |matStatus     |answer
female      |married       |-$200
male        |single        |Variable
female      |single        |-$200


Feature: Calculate the insurance prime for a customer 2.
Scenario: The client is overage.
GIVEN The client is overage.
WHEN Calculate the premium.
THEN Result is -1
Scenario Outline:
GIVEN The client is <age>
WHEN Calculate the premium.
THEN Result is <answer>
Examples:
age   |Asnwer
86    |-1
22    |Variable


Feature: Calculate the insurance prime for a customer  3.
Scenario: The customer si an adult person.
GIVEN The customer is an adult person.
WHEN Calculate the premium.
THEN Substract $100 from the base premium.
Scenario Outline: The customer is or not is an adult
GIVEN The customer is an adult person, the age is <age>
WHEN Calculate the premium.
THEN <answer> for the base premium.
Examples:
age                |answer
between 45 and 65  |-$100
age>80 or age<10       |-1



Feature: Calculate the insurance prime for a customer 4.
Scenario: The customer is male, not married and younger than 25 years old
GIVEN It's age is between 18and 24, male and single.
WHEN Calculate the premium.
Ask for the marital status and ask for age.
THEN add $1500 to the base premium
Scenario Outline:
GIVEN The age is <age>, the maital Staus is <MatStatus> and the sex is <sex>
WHEN Calculate the premium.
THEN Add <answer> for the base premium
Examples:
sex     |matStatus   |age       |answer
male    |Single      |22        |+$1500
male    |married     |47        |-$300
