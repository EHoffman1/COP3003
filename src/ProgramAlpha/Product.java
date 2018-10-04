/**************************************************************************************************
 * Author: Eric Hoffman
 * FILE: Abstract class Product.java
 * Date: 10/02/2018
 * DESC: This abstract class implements the interface Item
 * The purpose of this class is to add fields like serial number, manufacturer,
 * manufactured on, and name that help describe the Product Object
 * It also adds methods to set and get each field and to return the fields
 *************************************************************************************************/

package ProgramAlpha;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// Create an abstract type called Product that will implement the Item interface
abstract class Product implements Item {

  private int serialNumber;
  private String manufacturer;
  private Date manufacturedOn;
  private String name;

  // Add an integer class variable called currentProductionNumber
  // This will store the next number to be assigned to serialNumber
  private int currentProductionNumber;

  // Add a constructor that will take in the name of the product
  // and set this to the field variable name
  // You will also assign a serial number from the currentProductionNumber
  // The  currentProductionNumber should be incremented in readiness for the next instance
  // Set manufacturedOn as the current date and time.

  /**
   * Assigning each variable to their parameter type
   *
   * @param serialNumber integer value assigned to this.serialNumber
   * @param manufacturer String value assigned to this.manufacturer
   * @param name String value assigned to this.name
   */
  public Product(int serialNumber, String manufacturer, String name) {
    this.name = name;
    this.serialNumber = serialNumber;
    this.manufacturer = manufacturer;
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    dateFormat.format(manufacturedOn);
    this.manufacturedOn = Calendar.getInstance().getTime();
    currentProductionNumber = serialNumber + 1;
  }

  // Complete the methods from the interface Item

  /**
   * public method to set the current production number
   *
   * @param productionNum integer value for the production number of the product
   */
  public void setProductionNumber(int productionNum) {
    currentProductionNumber = productionNum;
  }

  /**
   * public method to set the field name value
   *
   * @param name String value for the name of the product
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * public method returning the name
   *
   * @return String value assigned to name
   */
  public String getName() {
    return name;
  }

  /**
   * public method returning the date of manufacturing
   *
   * @return Date assigned to the manufacturedOn field
   */
  public Date getManufacturerDate() {
    return manufacturedOn;
  }

  /**
   * public method to return the serial number of the product
   *
   * @return integer value assigned to serialNumber
   */
  public int getSerialNumber() {
    return serialNumber;
  }

  // Add a toString method that returns Manufacturer, Serial Number, Date, and Name

  /**
   * public string method to return each field value
   *
   * @return Each string, integer, and date value assigned to each field
   */
  public String toString() {
    return "Manufacturer : " + manufacturer + "\n"
        + "Serial Number : " + serialNumber + "\n"
        + "Date : " + manufacturedOn + "\n"
        + "Name : " + name;
  }

}
