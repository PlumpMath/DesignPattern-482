/********************************************************************
 * File Name:    OrderProxy.java
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
public class OrderProxy implements OrderApi
{
  private Order order = null;

  public OrderProxy(Order realOrder)
  {
    this.order = realOrder;
  }

  public String getProductName()
  {
    // TODO Auto-generated method stub
    return order.getProductName();
  }

  public void setProductName(String productName, String user)
  {
    if (user != null && user.equals(this.getOrderUser()))
    {
      order.setProductName(productName, user);
    }
    else
    {
      System.out.println("Sorry, " + user + ", you can't modify the product name");
    }

  }

  public int getOrderNum()
  {
    // TODO Auto-generated method stub
    return order.getOrderNum();
  }

  public void setOrderNum(int orderNum, String user)
  {
    if (user != null && user.equals(this.getOrderUser()))
    {
      order.setOrderNum(orderNum, user);
    }
    else
    {
      System.out.println("Sorry, " + user + ", you can't modify the product number");
    }
  }

  public String getOrderUser()
  {
    // TODO Auto-generated method stub
    return order.getOrderUser();
  }

  public void setOrderUser(String orderUser, String user)
  {
    if (user != null && user.equals(this.getOrderUser()))
    {
      order.setOrderUser(orderUser, user);
    }
    else
    {
      System.out.println("Sorry, " + user + ", you can't modify the user name");
    }
  }

  @Override
  public String toString()
  {
    return "OrderProxy [order=" + order + "]";
  }

}
