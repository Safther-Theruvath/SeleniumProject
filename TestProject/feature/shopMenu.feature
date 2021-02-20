Feature: practice automation feature
Scenario: home page contain three sliders
Given user is on main page
When user click show menu
And user click home button
Then three slides will appear




Scenario: home page contain three arrivals
Given user is on main page
When user click show menu
And user click home button
Then available with three arrivals



Scenario: images in arrival should navigate
Given user is on main page
When user click show menu
And user click home button
Then available with three arrivals
And image should be clickable and navigate


Scenario: desciption of book
Given user is on main page
When user click show menu
And user click home button
Then available with three arrivals
And image should be clickable and navigate
Then click on description tab


Scenario: review of book
Given user is on main page
When user click show menu
And user click home button
Then available with three arrivals
And image should be clickable and navigate
Then click on reviews tab




