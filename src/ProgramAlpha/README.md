ProjectAlpha

Version 1.0 

Date: 10/02/2018

Author: Eric Hoffman

General Program Notes: This program is designed to eventually be able to create a number of multimedia devices including music and movie players. It is a template that will eventually create and record all future devices that are made. For now, it contains three java classes; an Enum, Interface, and an abstract class that will be constantly added to throughout the next two months.

Prerequisites

•	IntelliJ IDEA was used for the development environment.

Installation

•	To install IntelliJ IDEA, you will need to go to the jetbrains website and download the ultimate edition. After downloading, install it to your computer and run it when it’s done. Once running you will need to make an account and hopefully you have a way to get the ultimate for free, or else it will cost money after the free trial. 

Project Elements

Interface Item.java

•	Item is a superclass to the abstract class Product that contains methods to set and get fields that will be used throughout the project.
•	It contains 6 methods in total that set String manufacturer, production number, name, and gets the name, manufacture date, and serial number.

Enum ItemType.java

•	For now ItemType is a small java class that contains the constants AU, VI, AM, and VM.

Abstract class Product

•	Product implements the interface Item.
•	The purpose of this class is to declare the fields serialNumber, manufacturer, manufacturedOn, name, and currentProductionNumber. It uses these fields and assigns values or names for each one.
•	The class also completes the methods that were inherited from Item.
•	Product also adds a toString method that returns each string, integer, and date value assigned to each field.


