/********************************************************************
 * File Name:    OrderBusiness.java
 *
 * Date Created: 2015年3月23日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package prototype.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class OrderBusiness
{
  public void saveOrder(OrderApi order)
  {
    while (order.getOrderProductNum() > 1000)
    {
      OrderApi newOrder = order.cloneOrder();
      newOrder.setOrderProductNum(1000);

      order.setOrderProductNum(order.getOrderProductNum() - 1000);

      System.out.println("the new split order is " + newOrder);
    }
    System.out.println("order is " + order);
  }
}
