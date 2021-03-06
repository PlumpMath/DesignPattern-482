/********************************************************************
 * File Name:    ChicagoStylePizzaStore.java
 *
 * Date Created: 2015年3月10日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package abstractfactory.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class ChicagoStylePizzaStore extends PizzaStore
{

  @Override
  Pizza createPizza(String type)
  {
    // TODO Auto-generated method stub
    if (type == "cheese")
    {
      pizza = new NYStyleCheesePizza();
    }
    return pizza;
  }
  // CONSTANTS ------------------------------------------------------

  // CLASS VARIABLES ------------------------------------------------

  // INSTANCE VARIABLES ---------------------------------------------

  // CONSTRUCTORS ---------------------------------------------------

  // PUBLIC METHODS -------------------------------------------------

  // PROTECTED METHODS ----------------------------------------------

  // PRIVATE METHODS ------------------------------------------------

  // ACCESSOR METHODS -----------------------------------------------

}
