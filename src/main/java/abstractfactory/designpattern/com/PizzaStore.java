/********************************************************************
 * File Name:    PizzaStore.java
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
public abstract class PizzaStore
{
  Pizza pizza;

  public Pizza orderPizza(String type)
  {

    pizza = createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;

  }

  abstract Pizza createPizza(String type);

}
