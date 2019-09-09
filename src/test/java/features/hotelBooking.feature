Feature: As a user I want to book a hotel at home page by entering city, checkIn, rooms, checkOut, adults and childs

Scenario Outline: booking a hotel validating test results

Given initialized the browser
And navigate to "https://www.easyjet.com" website
When user enter <hotelName>
And select checkInDate, checkOutDate, adults, childs, childAges
And clic on search button
Then the user is redirect to the search results page
And verify the results match
And close all open windows

Examples:
|  hotelName                | 
|  Hotel Berlin, Berlin     |  			