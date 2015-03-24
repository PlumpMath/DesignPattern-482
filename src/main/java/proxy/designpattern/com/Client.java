/********************************************************************
 * File Name:    Client.java
 *
 * Date Created: 2015年3月24日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package proxy.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class Client
{
  public static void main(String[] args)
  {
    OrderApi order = new OrderProxy(new Order("SEP", 50, "Emma"));
    System.out.println(order);
    order.setOrderNum(100, "Agnes");
    order.setProductName("Jade", "Emma");
    System.out.println(order);

    // Dynamic Proxy
    Order dynamicOrder = new Order("SEP", 50, "Emma");
    DynamicProxy dynamicProxy = new DynamicProxy();
    OrderApi orderApi = dynamicProxy.getProxyInterface(dynamicOrder);
    orderApi.setOrderNum(90, "Agnes");
    orderApi.setProductName("Ruby", "Emma");
    System.out.println(orderApi);

  }

}
