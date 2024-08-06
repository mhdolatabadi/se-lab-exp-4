@tag
Feature: DivideAndSqrt
Scenario Outline: add two numbers
  Given Two integer input values, <a> and <b>
  When I divide the a on b and sqrt
  Then I expect the result to be <result>

  Examples:
    | a     | b      | result |
    | 4     | 1      | 2      |
    | 36    | 4      | 3      |
