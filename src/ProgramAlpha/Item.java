/**************************************************************************************************
 * Author: Eric Hoffman
 * FILE: Interface Item.java
 * Date: 10/02/2018
 * DESC: Interface Item is a superclass to the abstract class Product.
 * It contains accessors, mutators, and fields that Product will use.
 *************************************************************************************************/

package ProgramAlpha;

import java.util.Date;

// Create an interface called Item
public interface Item {

  // A constant called manufacturer that would be set to “OracleProduction”
  String manufacturer = "OracleProduction";

  // A method setProductionNumber that would have one integer parameter
  void setProductionNumber(int productionNum);

  // A method setName that would have one String parameter
  void setName(String name);

  // A method getName that would return a String
  String getName();

  // A method getManufactureDate that would return a Date
  Date getManufacturerDate();

  // A method getSerialNumber that would return an int
  int getSerialNumber();

}
