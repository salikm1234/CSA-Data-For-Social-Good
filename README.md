# Unit 3 - Data for Social Good Project 


## User Story 

As a small business owner, <br> 
I want to manage a list of available drivers and quickly find the closest one, <br> 
so that I can efficiently dispatch drivers to meet customer needs and streamline transportation logistics.

## Dataset 

Dataset: https://docs.google.com/spreadsheets/d/1cKWu2O-EgGyVfmrdEN_xExbf9sAtcgX77Y0QX4jy5L4/edit?usp=sharing

Column Descriptions:

Driver Name
Type: String
Description: Contains the names of the drivers.
Rating (out of 5)
Type: Double
Description: Represents the driver’s rating on a scale from 1 to 5.
Distance (miles)
Type: Double
Description: Indicates the distance of the driver from the user in miles.
Available
Type: String
Description: Shows the availability status of the driver, with possible values of "Yes" or "No".


## UML Diagram 
![data for good UML Diagram](https://github.com/user-attachments/assets/b446193f-1776-4fe4-81e1-ccb2bd4182fb)


## Description 

My project is a Java program designed to help a small business manage a list of drivers by finding, viewing, and booking available ones. The Driver class represents each driver, with instance variables like name, rating, distance, and available, and getter and setter methods to access and update these values. The UserStory class creates an array of Driver objects and includes methods to find the closest available driver, print available drivers, and book a driver by setting their availability to "No." I used conditional statements in the methods to filter available drivers, and iteration to loop through the driver list. This project meets the User Story goals by making it easier for the business owner to manage drivers and quickly find the closest available one.
