/********************************************************************
 * File Name:    DynamicProxy.java
 *
 * Date Created: 2015年3月24日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package proxy.designpattern.com;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class DynamicProxy implements InvocationHandler
{

  private OrderApi order = null;

  public OrderApi getProxyInterface(Order order)
  {
    this.order = order;
    OrderApi orderApi = (OrderApi) Proxy
        .newProxyInstance(order.getClass().getClassLoader(), order.getClass().getInterfaces(), this);
    return orderApi;
  }

  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
  {
    if (method.getName().startsWith("set"))
    {
      if (order.getOrderUser() != null && order.getOrderUser().equals(args[1]))
      {
        return method.invoke(order, args);
      }
      else
      {
        System.out.println("Sorry, " + args[1] + ", you can't modify the data ");
      }
    }
    else
    {
      return method.invoke(order, args);
    }
    return null;
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
